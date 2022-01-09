import java.util.ArrayList;

public class Driver{
	
	public static void main(String[] args){
		int size=6;

		ArrayList glen = Sorts.makeOrderedArrayList(size);
		System.out.println( "Best Cases: ");
		Sorts.bubble( glen );
		System.out.println( "	Bubble Swaps: " + Sorts.swapCounter);
		Sorts.selection( glen );
		System.out.println( "	Selection Swaps: " + Sorts.swapCounter);
		Sorts.insertion( glen );
		System.out.println( "	Insertion Swaps: " + Sorts.swapCounter + "\n");

		// A random order of the numbers to compare with the ascending and descending
		Sorts.shuffle(glen);
		System.out.println( "Random Case: " + glen);
		Sorts.bubble( glen );
		System.out.println( "	Bubble Swaps: " + Sorts.swapCounter);
		Sorts.selection( glen );
		System.out.println( "	Selection Swaps: " + Sorts.swapCounter);
		Sorts.insertion( glen );
		System.out.println( "	Insertion Swaps: " + Sorts.swapCounter + "\n");

		glen=Sorts.makeReverseArrayList(size);
		System.out.println( "Worst Cases: ");
		Sorts.bubble( glen );
		System.out.println( "	Bubble Swaps: " + Sorts.swapCounter);
		Sorts.selection( glen );
		System.out.println( "	Selection Swaps: " + Sorts.swapCounter);
		Sorts.insertion( glen );
		System.out.println( "	Insertion Swaps: " + Sorts.swapCounter + "\n");

		/*
		Extra code to further support what we believe are the worst and best cases
		If there is an arrangement needs more swaps than in our predicted worst case, or less swaps than in our predicted best, it will be printed out
		This is expected to be an infinite loop
		
		System.out.println(infShuffleBub(glen, 0, 15)); 
		System.out.println(infShuffleSel(glen, 5));
		*/
	}

	public static ArrayList<Comparable> infShuffleBub(ArrayList<Comparable> data, int best, int worst) {
		while (true) {
			Sorts.bubble(data);

			//If there is an arrangement with a number of swaps that is less than our predicted best, or greater than our predicted worse, the loop breaks
			if ( (Sorts.swapCounter > worst) || (Sorts.swapCounter < best) ) {
				break;
			}
			Sorts.shuffle(data);
		}
		return data;
	}

	public static ArrayList<Comparable> infShuffleSel(ArrayList<Comparable> data, int swaps) {
		while (true) {
			Sorts.selection(data);

			//If there is an arrangement with a number of swaps that is not what we predict, the loop breaks
			if(Sorts.swapCounter != swaps) {
				break;
			}
			Sorts.shuffle(data);
		}
		return data;
	}
}

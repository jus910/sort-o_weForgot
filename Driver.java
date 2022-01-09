import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		int size=6;

		ArrayList glen = Sorts.makeOrderedArrayList(size);
		System.out.println( "Best Cases: ");
		Sorts.bubble( glen );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter);
		Sorts.selection( glen );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter);
		Sorts.insertion( glen );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");

		// A random order of the numbers to comapre with the ascending and descending
		Sorts.shuffle(glen);
		System.out.println( "Random Cases: ");
		Sorts.bubble( glen );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter);
		Sorts.selection( glen );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter);
		Sorts.insertion( glen );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");

		glen=Sorts.makeReverseArrayList(size);
		System.out.println( "Worst Cases: ");
		Sorts.bubble( glen );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter);
		Sorts.selection( glen );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter);
		Sorts.insertion( glen );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");
	}
}

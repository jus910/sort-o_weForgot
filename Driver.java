import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		ArrayList glen = new ArrayList<Integer>();
		glen.add(1);
		glen.add(2);
		glen.add(3);
		glen.add(4);
		glen.add(5);
		System.out.println( "ArrayList glen before sort:\n" +  glen + "\n");

		System.out.println( "ArrayList glen after bubble:\n" + Sorts.bubble( glen ) );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after selection:\n" + Sorts.selection( glen ) );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after insertion:\n" + Sorts.insertion( glen ) );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");


		glen.set(0,5);
		glen.set(1,4);
		glen.set(2,3);
		glen.set(3,2);
		glen.set(4,1);
		System.out.println( "(Start)ArrayList glen before sort:\n" +  glen + "\n");

		System.out.println( "ArrayList glen after bubble:\n" + Sorts.bubble( glen ) );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after selection:\n" + Sorts.selection( glen ) );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after insertion:\n" + Sorts.insertion( glen ) );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");
	}
}

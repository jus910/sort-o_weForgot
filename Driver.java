import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		ArrayList glen = Sorts.makeOrderedArrayList(5);

		System.out.println( "ArrayList glen before sort:\n" +  glen + "\n");

		System.out.println( "ArrayList glen after bubble:\n" + Sorts.bubble( glen ) );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after selection:\n" + Sorts.selection( glen ) );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after insertion:\n" + Sorts.insertion( glen ) );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");


		glen=Sorts.makeReverseArrayList(5);

		System.out.println( "(Start)ArrayList glen before sort:\n" +  glen + "\n");

		System.out.println( "ArrayList glen after bubble:\n" + Sorts.bubble( glen ) );
		System.out.println( "Bubble Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after selection:\n" + Sorts.selection( glen ) );
		System.out.println( "Selection Swaps: " + Sorts.swapCounter + "\n");

		System.out.println( "ArrayList glen after insertion:\n" + Sorts.insertion( glen ) );
		System.out.println( "Insertion Swaps: " + Sorts.swapCounter + "\n");
	}
}

import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		ArrayList glen = new ArrayList<Integer>();
		glen.add(7);
		glen.add(1);
		glen.add(5);
		glen.add(12);
		glen.add(3);
		System.out.println( "ArrayList glen before sort:\n" +  glen );
		System.out.println( "ArrayList glen after bubble:\n" + Sorts.bubble( glen ) );
		System.out.println( "Bubble Swaps :\n" + Sorts.getSwaps() );
		System.out.println( "ArrayList glen after selection:\n" + Sorts.selection( glen ) );
		System.out.println( "Selection Swaps :\n" + Sorts.getSwaps() );
		System.out.println( "ArrayList glen after insertion:\n" + Sorts.insertion( glen ) );
		System.out.println( "Insertion Swaps :\n" + Sorts.getSwaps() );
	}
}

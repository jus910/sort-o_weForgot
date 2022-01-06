import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
		ArrayList glen = new ArrayList<Integer>();
		glen.add(7);
		glen.add(1);
		glen.add(5);
		glen.add(12);
		glen.add(3);
		System.out.println( "ArrayList glen before bubble:\n" + glen );
		Sorts.selection( glen );
		System.out.println( "ArrayList glen after bubble:\n" + glen ); 
	}
}

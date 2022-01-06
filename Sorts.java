import java.util.ArrayList;

public class Sorts{

  public static void swap(ArrayList<Comparable> data, int index1, int index2){
    Comparable currentVal;
    currentVal=data.get(index1);
    data.set(index1,data.get(index2));
    data.set(index2,currentVal);
  }

  public static void bubble( ArrayList<Comparable> data )
  {
    int passes = data.size()-1;
    while (passes > 0) {
  	    for(int i = data.size()-1; i>0; i--){
  		    if (data.get(i).compareTo(data.get(i-1)) == -1){
  			    swap(data,i,i-1);
  		    }
  	    }
        passes--;
    }
  }
  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int i=data.size()-1;i>0;i--) {
      maxPos=i;

      for(int n=i;n>=0;n-- ) {
        if (data.get(maxPos).compareTo(data.get(n)) == -1){
        	maxPos=n;
        }

      }

      swap(data,i,maxPos);

    }
  }//end selectionSort

  public static void insertion( ArrayList<Comparable> data )
  {
    for(int partition=1;partition<data.size();partition++  ) {
      //partition marks first item in unsorted region
      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for(int i=partition;i>0;i--  ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) == -1  ) {

          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          swap(data,i,i-1);
        }
        else
          break;
      }
    }
  }//end insertionSortV
}

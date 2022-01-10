import java.util.ArrayList;

public class Sorts{

  public static int swapCounter = 0;
  public static int passCounter = 0;
  public static int comparisonCounter = 0;
  

  public static ArrayList<Integer> makeOrderedArrayList(int size){
    ArrayList glen = new ArrayList<Integer>();
    for(int i=0;i<size;i++){
      glen.add(i);
    }
    return glen;
  }

  public static ArrayList<Integer> makeReverseArrayList(int size){
    ArrayList glen = new ArrayList<Integer>();
    for(int i=size-1;i>=0;i--){
      glen.add(i);
    }
    return glen;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  public static void swap(ArrayList<Comparable> data, int index1, int index2){
    Comparable currentVal;
    currentVal=data.get(index1);
    data.set(index1,data.get(index2));
    data.set(index2,currentVal);
    swapCounter++;
  }

  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    swapCounter = 0;
    passCounter = 0;
    comparisonCounter=0;
    int passes = data.size()-1;
    while (passes > 0) {
    	    passCounter++;
  	    for(int i = data.size()-1; i>0; i--){
  	    	    comparisonCounter++;
  		    if (data.get(i).compareTo(data.get(i-1)) == -1){
  			    swap(data,i,i-1);

  		    }
  	    }
        passes--;
    }
  }

  public static ArrayList<Comparable> bubble( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> copy = new ArrayList<Comparable>();
    for(Comparable ddd: input){
      copy.add(ddd);
    }
    bubbleSortV(copy);
    return copy;

  }

  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    swapCounter = 0;
    passCounter = 0;
    comparisonCounter=0;
    int maxPos;

    for(int i=data.size()-1;i>0;i--) {
      passCounter++;
      maxPos=i;

      for(int n=i;n>=0;n-- ) {
      	comparisonCounter++;
        if (data.get(maxPos).compareTo(data.get(n)) == -1){
        	maxPos=n;
        }

      }

      swap(data,i,maxPos);

    }
  }//end selectionSort

  public static ArrayList<Comparable> selection( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort

  public static void insertionSortV( ArrayList<Comparable> data )
  {
    swapCounter = 0;
    passCounter = 0;
    comparisonCounter=0;
    for(int partition=1;partition<data.size();partition++  ) {
      passCounter++;
      //partition marks first item in unsorted region
      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for(int i=partition;i>0;i--  ) {
      	comparisonCounter++;

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
  public static ArrayList<Comparable> insertion( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

  public static int getSwaps(){
    return swapCounter;
  }
}

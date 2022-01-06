public class Sorts{
  public static void bubble( ArrayList<Comparable> data )
  {
  	Comparable currentVal;
  	Comparable previousVal;
    int passes = data.size()-1;
    while (passes > 0) {
  	    for(int i = data.size()-1; i>0; i--){
  		    if (data.get(i).compareTo(data.get(i-1)) == -1){
  			    currentVal=(data.get(i));
  			    previousVal=(data.get(i-1));
  			    data.set(i,previousVal);
  			    data.set((i-1),i);
  		    }
  	    }
        passes--;
    }
  }
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    Comparable currentVal;

    for(int i=data.size()-1;i>0;i--) {
      maxPos=i;

      for(int n=i;n>=0;n-- ) {
        if (data.get(maxPos).compareTo(data.get(n)) == -1){
        	maxPos=n;
        }

      }

      currentVal=data.get(i);
      data.set(i,data.get(maxPos));
      data.set(maxPos,currentVal);

    }
  }//end selectionSort

  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for(int partition=1;partition<data.size();partition++  ) {
      //partition marks first item in unsorted region
      Comparable currentVal;

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i=partition;i>0;i--  ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) == -1  ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          currentVal=data.get(i);
          data.set(i,data.get(i-1));
          data.set(i-1,currentVal);

        }
        else
          break;
      }
    }
  }//end insertionSortV
}

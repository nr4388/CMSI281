public class IntList implements IntListInterface {
   private int[] theList;
   private int[] newList;
   private int   size;

   private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

   public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
      theList = new int[STARTING_SIZE];
      size = 0;
   }

   public boolean prepend( int valueToAdd ) {
       expandArray();
       size++;
       insertValueAtIndex(valueToAdd, 0);
       return true;
   }

   public int getValueAtIndex( int index ) {
      checkIndex(index);
      return theList[index];
   }

   public boolean append( int valueToAdd ) {
      expandArray();
      theList[size] = valueToAdd;
      size++;
      return true;
   }

   public void expandArray() {
       if (size >= theList.length) {
           newList = new int[theList.length + STARTING_SIZE];
           for (int i = 0; i < theList.length - 1; i++) {
               newList[i] = theList[i];
           }
           theList = newList;
       }
   }

   // we've gotta have this to actually get things to compile
   public boolean insertValueAtIndex( int value, int index ) {
       try {
           for (int i = theList.length - 1; i > index; i--) {
               System.out.println("i: " + i);
               System.out.println("list[i]: " + theList[i]);
               System.out.println("index: " + index);
               System.out.println("theList[i+1]" + theList[i + 1]);
               theList[i + 1] = theList[i];
           }
           theList[index] = value;
       } catch(ArrayIndexOutOfBoundsException a) {
           System.out.println("Index is not valid");
       }
       // System.out.println("value at index: " + theList[index]);
       return true;
   }

   public void checkIndex(int index) throws ArrayIndexOutOfBoundsException {
       if (size == 0) {
           throw new ArrayIndexOutOfBoundsException( "The list is empty!" );
       } else if (index > size) {
           throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
       } else if (index < 0) {
           throw new ArrayIndexOutOfBoundsException( "The index value is too small");
       }
   }

   public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
      int value = theList[index];
      checkIndex(index);
      holeFiller( index );
      return value;
   }

   private void holeFiller( int index ) {
      for( int i = index; i < size - 1; i++ ) {
         theList[i] = theList[i+1];
      }
      size--;
   }

   public static void main( String[] args ) {
      IntList list = new IntList();
      list.append( 2 );
      list.append( 3 );
      list.append( 5 );
      list.append( 7 );
      System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
      list.append( 11 );
      list.append( 13 );
      list.append( 17 );
      list.append( 19 );
      list.insertValueAtIndex(6, 4);
      System.out.println(list.getValueAtIndex(4));
      System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
      System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
      System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
      System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

   }
}

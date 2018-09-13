/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntListInterface.java
 *  Purpose       :  Interface that specifies operations for IntList file.
 *  Author        :  Nicolas Raymundo
 *  Date          :  09-13-2018
 *  Description   :  Specified operations for list.
 *  Partner       :  Talia Bahar
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public interface IntListInterface {
   int getValueAtIndex( int index );
   boolean append( int valueToAdd );
   boolean insertValueAtIndex( int value, int index );
   int removeValueAtIndex( int index );
}

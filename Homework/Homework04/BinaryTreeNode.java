/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  BinaryTreeNode.java
 *  Purpose       :  Created the inOrderPrinter method to display the in order traversal of a tree given a node.
 *  Author        :  Maya Pegler Gordon, Nicolas Raymundo, Talia Bahar
 *  Date          :  11-25-2018
 *  Description   :  Added methods to be able to add and show the children of trees and subtrees.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class BinaryTreeNode {

  private int data;
  private BinaryTreeNode left;
  private BinaryTreeNode right;

  BinaryTreeNode( int d ) {
    data = d;
    left = null;
    right = null;
  }

  public void add( int s, String child ) {
    child = child.toUpperCase();
    if( child.equals( "L" ) ) {
      left = new BinaryTreeNode( s );
    } else if( child.equals( "R" ) ) {
      right = new BinaryTreeNode( s );
    } else {
      throw new IllegalArgumentException();
    }
  }

  public BinaryTreeNode getChild( String child ) {
    child = child.toUpperCase();
    if( child.equals("L") || child.equals("R") ) {
      return (child.equals("L") ? left : right);
    } else {
      throw new IllegalArgumentException();
    }
  }

  public int getString() {
    return data;
  }

  public static void inOrderPrinter( BinaryTreeNode node ) {
    if( node == null ) {
      return;
    }
    inOrderPrinter( node.getChild( "L" ) );
    System.out.print( "[" + node.data + "]" );
    inOrderPrinter( node.getChild( "R" ) );
   }

  public static void main( String[] args ) {
    BinaryTreeNode root = new BinaryTreeNode( 0 );                  //
    root.add( 1, "L" );
    root.add( 2, "R" );
    BinaryTreeNode one = root.getChild( "L" );
    BinaryTreeNode two = root.getChild( "R" );
    one.add( 3, "L" );
    one.add( 4, "R" );
    two.add( 5, "L" );
    two.add( 6, "R" );
    BinaryTreeNode six = two.getChild( "R" );
    six.add( 7, "L" );
    six.add( 8, "R" );
    System.out.println("InOrder Traversal @ 6");
    System.out.println("Expected Output: " + "[7][6][8]");
    System.out.println(" ");
    inOrderPrinter(six);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("InOrder Traversal @ 2");
    System.out.println("Expected Output: " + "[5][2][7][6][8]");
    System.out.println(" ");
    inOrderPrinter(two);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("InOrder Traversal @ 1");
    System.out.println("Expected Output: " + "[3][1][4]");
    System.out.println(" ");
    inOrderPrinter(one);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("InOrder Traversal @ ROOT(0)");
    System.out.println("Expected Output: " + "[3][1][4][0][5][2][7][6][8]");
    System.out.println(" ");
    inOrderPrinter(root);
    System.out.println(" ");
    System.out.println(" ");
    BinaryTreeNode eight = six.getChild("R");
    System.out.println("InOrder Traversal @ 8");
    System.out.println("Expected Output: " + "[8]");
    System.out.println(" ");
    inOrderPrinter(eight);
    System.out.println(" ");
    System.out.println(" ");
  }
}

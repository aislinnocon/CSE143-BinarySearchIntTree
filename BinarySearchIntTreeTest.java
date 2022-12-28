import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchIntTreeTest {

  @Test
  public void testAdd() {
    BinarySearchIntTree tester = new BinarySearchIntTree();
    
    // add 1 elements to tree
    tester.add(1);
    assertEquals("after adding nodes to tree the inorder print should be", "1", tester.getInOrder());

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("after adding nodes to tree the inorder print should be", "2 5 9 15 25", tester.getInOrder());
    assertEquals("after adding nodes to tree the inorder print should be", "5 2 25 15 9", tester.getPreOrder());
    assertEquals("after adding nodes to tree the inorder print should be", "2 9 15 25 5", tester.getPostOrder());

    // notice how adding the same 5 elemets in a different order generates different preorder and post order but the same inorder
    tester = new BinarySearchIntTree();
    tester.add(2);
    tester.add(15);
    tester.add(5);
    tester.add(9);
    tester.add(25);
    assertEquals("after adding nodes to tree the inorder print should be", "2 5 9 15 25", tester.getInOrder());
    assertEquals("after adding nodes to tree the inorder print should be", "2 15 5 9 25", tester.getPreOrder());
    assertEquals("after adding nodes to tree the inorder print should be", "9 5 25 15 2", tester.getPostOrder());
  }

  @Test
  public void testContains() {
    BinarySearchIntTree tester = new BinarySearchIntTree();

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("determine if the tree contains the value 99", false, tester.contains(99));
    assertEquals("determine if the tree contains the value 25", true, tester.contains(25));
  }

  @Test
  public void testGetPreOrder() {
    BinarySearchIntTree tester = new BinarySearchIntTree();

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("after adding nodes to tree the inorder print should be", "5 2 25 15 9", tester.getPreOrder());
  }

  @Test
  public void testGetInOrder() {
    BinarySearchIntTree tester = new BinarySearchIntTree();

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("after adding nodes to tree the inorder print should be", "2 5 9 15 25", tester.getInOrder());
  }
  
  @Test
  public void testGetPostOrder() {
    BinarySearchIntTree tester = new BinarySearchIntTree();

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("after adding nodes to tree the inorder print should be", "2 9 15 25 5", tester.getPostOrder());
  }

  @Test
  public void testGetHeight() {
    BinarySearchIntTree tester = new BinarySearchIntTree();

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("after adding nodes to tree height should be", 4, tester.getHeight());

    // see how adding 5 elements in a different order affect the height of the tree, this tree is very unbalanced
    tester = new BinarySearchIntTree();
    tester.add(2);
    tester.add(5);
    tester.add(9);
    tester.add(15);
    tester.add(25);
    assertEquals("after adding nodes to tree height should be", 5, tester.getHeight());

    // see how adding 5 elements in a different order affect the height of the tree, this tree is balanced
    tester = new BinarySearchIntTree();
    tester.add(9);
    tester.add(5);
    tester.add(2);
    tester.add(15);
    tester.add(25);
    assertEquals("after adding nodes to tree height should be", 3, tester.getHeight());
  }
  
  @Test
  public void testGetSize() {
    BinarySearchIntTree tester = new BinarySearchIntTree();

    // add 5 elements to tree
    tester = new BinarySearchIntTree();
    tester.add(5);
    tester.add(25);
    tester.add(15);
    tester.add(9);
    tester.add(2);
    assertEquals("after adding nodes to tree the size be", 5, tester.getSize());

    // add 5 elements to tree in a different order does not affect the size of the tree
    tester = new BinarySearchIntTree();
    tester.add(2);
    tester.add(5);
    tester.add(15);
    tester.add(9);
    tester.add(25);
    assertEquals("after adding nodes to tree the size be", 5, tester.getSize());
  }

}
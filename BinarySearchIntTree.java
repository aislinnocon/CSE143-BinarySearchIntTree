// Aislinn O'Connell
// CS 143
// HW Core Topics: BinarySearchIntTree
//
// This program will add a given value to the binary search int tree 
// in a specific location in order to maintain the order inside the 
// binary search int tree. It can also check whether a certain value 
// exists insid the binary search int tree and return the size of the
// tree. 

class BinarySearchIntTree implements IntTree {

   private IntTreeNode overallRoot;
   
   // pre: 
   // post: the spcifie value has been added to the tree in a way that preserves the binary tree contstraints
   public void add(int value) {
      overallRoot = add(overallRoot, value);
   }
   
   // pre:
   // post: the spcifie value has been added to the subtree in a way that preserves the binary tree contstraints   
   private IntTreeNode add(IntTreeNode root, int value) {
      IntTreeNode newNode = new IntTreeNode(value, null, null);
      if (null == root) {
         return newNode;
      }
      if (value <= root.data) {
         root.left = add(root.left, value);
      }
      if (value >= root.data) {
         root.right = add(root.right, value);
      }  
      return root; // be sure to modify this code to return the right value an not null
   }
   
   // pre:
   // post: determines if the specified value is in the tree or not
   public boolean contains(int value) {
      return contains(overallRoot, value);
   }
   
   // pre:
   // post: determines if the specified value is in the subtree or not
   private boolean contains(IntTreeNode root, int value) {
      if (root == null) {
         return false;
      } else if (value == root.data) {
         return true;  
      } else if (value < root.data) {
         return contains(root.left, value);
      } else if (value > root.data) {
         return contains(root.right, value);
      }
      return false; 
   }
   
   // pre:
   // post: returns the number of nodes in the tree
   public int getSize() {
     return getSize(overallRoot);
   }
   
   // pre:
   // post: returns the number of nodes in the specified subtree
   private int getSize(IntTreeNode root) {
      if (root == null) {
         return 0;
      } else {
         return 1 + getSize(root.left) + getSize(root.right);
      }
   }
      
   // pre:
   // post: returns the max height from overalLRoot to the furthest leaf
   public int getHeight() {
      return getHeight(overallRoot); 
   }
   
   // pre:
   // post: returns the max height from root to the furthest leaf
   private int getHeight(IntTreeNode root) {
      if (null == root) {
         return 0;
      }
      return  1 + Math.max(getHeight(root.left), getHeight(root.right));
   }
      
   // pre: none
   // post: returns the data values of the tree using a preorder traversal
   public String getPreOrder() {
      String result = "";
      result = getPreOrder(overallRoot, result);
      return result.strip();
   }
   
   // pre: none
   // post: the values of the sub tree are added to the result string in preorder traverseral order
   private String getPreOrder(IntTreeNode root, String result) {
      if (null != root) {
          result = result + root.data + " ";
          result = getPreOrder(root.left, result);
          result = getPreOrder(root.right, result);
      }   
      return result;
   }

   // pre: none
   // post: returns the data values of the tree using a inorder traversal
   public String getInOrder() {
      String result = "";
      result = getInOrder(overallRoot, result);
      return result.strip();
   }
   
   // pre: none
   // post: the values of the sub tree are  added to the result string in inorder traverseral order
   private String getInOrder(IntTreeNode root, String result) {
      if (null != root) {
          result = getInOrder(root.left, result);
          result = result + root.data + " ";
          result = getInOrder(root.right, result);
      }   
      return result;
   }

   // pre: none
   // post: returns the data values of the tree using a postorder traversal
   public String getPostOrder() {
      String result = "";
      result = getPostOrder(overallRoot, result);
      return result.strip();
   }
   
   // pre: none
   // post: the values of the sub tree are added to the result string in postorder traverseral order
   private String getPostOrder(IntTreeNode root, String result) {
      if (null != root) {
          result = getPostOrder(root.left, result);
          result = getPostOrder(root.right, result);
          result = result + root.data + " ";
      }   
      return result;
   }

   // pre: none
   // post: the tree is print to console rotated 90 degree so the root is on the far left
   public void printSidewaysIndented() {
      printSidewaysIndented(overallRoot, 0);
   }
   
   // pre: none
   // post: the subtree is printed spaced out to appropriately for the level specified
   private void printSidewaysIndented(IntTreeNode root, int level) {
      if (null != root) {
         printSidewaysIndented(root.right, level + 1);
         for (int i = 0; i < level; i ++) {
            System.out.print("    ");
         }
         System.out.println(root.data);
         printSidewaysIndented(root.left, level + 1);
      }   
   }

}

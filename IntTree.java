public interface IntTree {
   public void add(int value);
   public boolean contains(int value);
   public String getPreOrder();
   public String getInOrder();
   public String getPostOrder();
   public int getHeight();
   public int getSize();
   public void printSidewaysIndented();
}
package trees;

public class Node {
  public int value;
  public Node left;
  public Node right;

  public Node(int value) {
    this.value = value;
  }


  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
  @Override
  public String toString() {
    return "Node{" + "value=" + value + ", left=" + left + ", right=" + right + '}';
  }
}

////

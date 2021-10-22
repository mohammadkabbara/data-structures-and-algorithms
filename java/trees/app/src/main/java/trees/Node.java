package trees;


import java.util.ArrayList;
import java.util.List;

public class Node<T> {

  public T value;
  public Node leftChild;
  public Node rightChild;
  public Node next;
  public List<Node> child = new ArrayList<>();

  public Node(T value) {
    this.value = value;
  }

  public Node(T value, Node leftChild, Node rightChild) {
    this.value = value;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }

  public Node() {

  }
}
//  @Override
//  public String toString() {
//    if (front == null) return "null";
//    String outList = "Front = ";
//    Node<T> current = front;
//    while (current != null){
//      outList += current.value+ " -> ";
//      current = current.next;
//    }
//    outList += "Null";
//    return outList;
//  }

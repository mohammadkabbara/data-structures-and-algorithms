package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {


  public Node<Integer> root;

  public BinaryTree() {
  }
//
  public BinaryTree(Node<Integer> root) {
    this.root = root;
  }


  public static ArrayList<Integer> breadthFirst(BinaryTree<Integer> binaryTree) {
    if (binaryTree.root == null) return null;

    ArrayList<Integer> breadthFirstList = new ArrayList<>();
    Queue<Integer> myQueue = new Queue<>();

    myQueue.enqueue(binaryTree.root);

    while (!myQueue.isEmpty()) {

      Node<Integer> front = myQueue.dequeue();
      breadthFirstList.add(front.value);

      if (front.leftChild != null) {
        myQueue.enqueue(front.leftChild);
      }
      if (front.rightChild != null) {
        myQueue.enqueue(front.rightChild);
      }
    }

    return breadthFirstList;
  }

}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree_intersection;


import java.util.HashMap;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    System.out.println(new App().getGreeting());

    BinaryTree binaryTree = new BinaryTree();

    binaryTree.setRoot(new Node(150));

    binaryTree.getRoot().setLeft(new Node(100));
    binaryTree.getRoot().getLeft().setLeft(new Node(75));
    binaryTree.getRoot().getLeft().setRight(new Node(160));
    binaryTree.getRoot().getLeft().getRight().setLeft(new Node(125));
    binaryTree.getRoot().getLeft().getRight().setRight(new Node(175));
    binaryTree.getRoot().setRight(new Node(250));
    binaryTree.getRoot().getRight().setLeft(new Node(200));
    binaryTree.getRoot().getRight().setRight(new Node(350));
    binaryTree.getRoot().getRight().getRight().setLeft(new Node(300));
    binaryTree.getRoot().getRight().getRight().setRight(new Node(500));


    BinaryTree binaryTree1 = new BinaryTree();

    binaryTree1.setRoot(new Node(42));

    binaryTree1.getRoot().setLeft(new Node(100));
    binaryTree1.getRoot().getLeft().setLeft(new Node(15));
    binaryTree1.getRoot().getLeft().setRight(new Node(160));
    binaryTree1.getRoot().getLeft().getRight().setLeft(new Node(125));
    binaryTree1.getRoot().getLeft().getRight().setRight(new Node(175));
    binaryTree1.getRoot().setRight(new Node(600));
    binaryTree1.getRoot().getRight().setLeft(new Node(200));
    binaryTree1.getRoot().getRight().setRight(new Node(350));
    binaryTree1.getRoot().getRight().getRight().setLeft(new Node(4));
    binaryTree1.getRoot().getRight().getRight().setRight(new Node(500));

    HashMapClass hashMapClass = new HashMapClass();
    hashMapClass.treeIntersection(binaryTree1, binaryTree);

    ///////////////cc33/////////////

    HashMap<String, String> left = new HashMap<>();
    HashMap<String, String> right = new HashMap<>();

    left.put("fond", "enamored");
    left.put("wrath", "anger");
    left.put("diligent", "employed");


    right.put("fond", "averse");
    right.put("wrath", "delight");
    right.put("diligent", "idle");


    hashMapClass.leftJoin(left, right);

  }
}
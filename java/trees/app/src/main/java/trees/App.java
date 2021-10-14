/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    BinarySearchTree tree = new BinarySearchTree();

    tree.add(5, tree.root);
    tree.add(8, tree.root);
    tree.add(3, tree.root);


    tree.preOrder(tree.root);
      tree.inOrder(tree.root);
      tree.postOrder(tree.root);
  }

}

package trees;

public class BinaryTree {

  Node root;
  public BinaryTree(){
    this.root=null;
  }
  public Node getRoot(){
    return root;
  }
  public void setRoot(Node root){
    this.root=root;
  }



  public void preOrder (Node root){
    System.out.println(root.value);
    if (root.left !=null){
      preOrder(root.left);
    }
    if (root.right !=null){
      preOrder(root.right);
    }
  }

  public void inOrder(Node root){
    if (root.left !=null){
      inOrder(root.left);
    }
    System.out.println(root.value);
    if (root.right !=null){
      inOrder(root.right);
    }
  }

  public void postOrder(Node root){
    if (root.left !=null){
      postOrder(root.left);
    }
    if (root.right !=null){
      postOrder(root.right);
    }
    System.out.println(root.value);
  }
  @Override
  public String toString() {
    return "BinaryTree{" + "root=" + root + '}';
  }


  //////////////////////////16///////////////////

  public int  maximum (Node root){

    if(root == null) {
      System.out.println("empty");
      return 0;
    }
    else{
      int leftMax;
      int rightMax;

      int max = root.value;
      if(root.left != null){
        leftMax = maximum(root.left);
        max = Math.max(max, leftMax);
      }
      if(root.right != null){
        rightMax = maximum(root.right);
        max = Math.max(max, rightMax);
      }
      return max;
    }
  }

}

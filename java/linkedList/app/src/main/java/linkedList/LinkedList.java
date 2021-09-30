package linkedList;

public class LinkedList {


  public Node head = null;
  public Node tail = null;

  /////////insert//////////

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail=head;
    }else {
      tail.next = newNode;
      tail=newNode;
    }

  }
  /////////include//////////
public boolean include(int data){
  Node currentNode =head;
  while(currentNode!=null){
    if(data ==currentNode.data){
      System.out.println("it is include ");
      return true;
    }
    currentNode=currentNode.next;
  }
  System.out.println("it is not include");
  return false;
}
  /////////toString//////////

  public String toString(){
    String toStringList="";
    Node currentNode = head;
    if (head==null){
      System.out.println("the list empty");

    }
    while (currentNode!=null){
      toStringList += "{"  + currentNode.data +"} ==>";
      System.out.print("{" + currentNode.data + "}" + "==> ");
      currentNode = currentNode.next;
    }
    System.out.println("null");
    return toStringList;
  }



}



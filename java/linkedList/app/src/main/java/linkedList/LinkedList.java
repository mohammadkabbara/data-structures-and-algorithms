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


  ////////////////////////// code challenge 6////////////////////
  public void append(int data){
    Node append = new Node(data);
    if (head == null) {
      head = append;
      tail = head;
    } else {
      tail.next = append;
      tail = append;
    }
  }

  public void insertBefore(int value, int newValue) {
    if (head != null) {
      if (value == head.data) {
        Node newNode = new Node(newValue);
        newNode.next = head;
        head = newNode;
//        newValue=head

      } else {
        Node current = head;
        Node previous = current;
        while (current != null) {
          if (value == current.data) {
            Node newNode = new Node(newValue);
            newNode.next = current;
            previous.next = newNode;
          }
          previous = current;
          current = current.next;
        }
      }
    }
  }


  public void insertAfter(int value , int newValue ){
    if (head != null) {
      if (value == tail.data){
      Node newNode = new Node (newValue);
      tail.next = newNode;
      tail=newNode;
      }else {

        Node current = head ;
        Node next =current.next;
        while (current!=null){
          if (value==current.data){
            Node newNode = new Node(newValue);
            newNode.next=next;
            current.next=newNode;
            break;
          }
          if (current.next!=null){
            current=current.next;
            next=current.next;
          }else {
            current=current.next;
          }
        }
      }
    }
  }

  //////////////////code 7////////
  public int linkedListKth(int number) throws IndexOutOfBoundsException  {
    int length= 0; // the value for n
    Node current = head; // the first node for the pinter to check from

    while (current != null) {
      length++;
      current = current.next;
    }
    if (number < 0 || number >= length) {
      throw new IndexOutOfBoundsException("number not in the range");
    }

    int k = length - number;
//       current = null;
    if (k > 0) {
      current = head;
      for (int i = 1; i < k; i++) {
        current = current.next;
      }
    }
    return current.data;
  }

}

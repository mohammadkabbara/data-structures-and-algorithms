package hashTable;




public class LinkedList<K,V> {

  Node<K,V> head;

  public String toString(){
    String result = " [ ";
    Node current = head;
    while (current != null) {
      result  += "{"+ current.key+ ":" + current.value + "} ";
      current = current.next;
    }
    result  += "] ";
    return result;
  }
}

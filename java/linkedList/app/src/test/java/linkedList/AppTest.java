/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNull;
public class AppTest {
      @Test
      public void testLinkList() {
    //Can successfully instantiate an empty linked list
    LinkedList list1 = new LinkedList();
    assertNull("empty list", list1.head);


    //Can properly insert into the linked list
    LinkedList list2 = new LinkedList();

    list2.insert(1);
    assertEquals("insert to the likedList" ,1, list2.head.data);


    //The head property will properly point to the first node in the linked list
    LinkedList list3 = new LinkedList();

    list3.insert(10);
    list3.insert(100);

    assertEquals("test insert to the linkedList",100,list3.head.data);


    //Can properly insert multiple nodes into the linked list
    LinkedList list4 = new LinkedList();
    list4.insert(100);

    assertEquals("test multiple insert method by checking if tail is not null and equal to last node",100,
      list4.tail.data);


    //Will return true when finding a value within the linked list that exists
    LinkedList list5 = new LinkedList();
    list5.insert(10);
    list5.insert(100);
    list5.insert(1000);

    assertEquals("test includes method when finding a value the output is true",true,
      list5.include(100));


    //Will return false when searching for a value in the linked list that does not exist
    assertEquals("test includes method when not finding a value the output is false",true,
      list5.include(10));

    //Can properly return a collection of all the values that exist in the linked list
    String out = "{ 10 } -> { 100 } -> { 1000 } -> ";
    assertEquals("test toStr method that return all list values",out,
      list5.toString());

  }


}

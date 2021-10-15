package stackAndQueue;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertNull.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class App {
  @Test
  public void testStackPush(){
    Stack<Integer> stackPush = new Stack<>();
    stackPush.push(10);
    assertEquals(10, stackPush.top.value);
  }
  @Test
  public void testStackMultiplePush() {
    Stack<Integer> stackPush = new Stack<>();
    stackPush.push(10);
    stackPush.push(20);
    stackPush.push(30);
    assertEquals(30, stackPush.top.value);
  }

  @Test
  public void testStackPop(){
    Stack<Integer> stackPop = new Stack<>();
    stackPop.push(10);
    stackPop.push(20);
    assertEquals(20, stackPop.top.value);
    System.out.println(stackPop);
  }

  @Test
  public void testStackMultiplePop(){
    Stack<Integer> stackPop = new Stack<>();
    stackPop.push(1);
    stackPop.push(2);
    assertEquals(2, stackPop.top.value);
    System.out.println(stackPop);
  }
  @Test
  public void testStackPeek() throws Exception {
    Stack<Integer> stackPeek = new Stack<>();
    stackPeek.push(10);
    stackPeek.push(20);
    stackPeek.push(30);
    stackPeek.pop();
    assertEquals(20, stackPeek.top.value);
  }




  @Test
  public void testQueueEnqueue() {
    Queue<Integer> queueEnqueue = new Queue<>();
    queueEnqueue.enqueue(1);

    assertEquals(1,queueEnqueue.front.value);
    assertEquals(1,queueEnqueue.rear.value);
  }
  @Test
  public void testQueueEnqueue2() {
    Queue<Integer> queueMultipleEnqueue = new Queue<>();
    queueMultipleEnqueue.enqueue(10);
    queueMultipleEnqueue.enqueue(20);
    queueMultipleEnqueue.enqueue(30);

    assertEquals(10,queueMultipleEnqueue.front.value);
    assertEquals(30,queueMultipleEnqueue.rear.value);
  }

  @Test
  public void testQueueDequeue() throws Exception {
    Queue<Integer> queueDequeue = new Queue<>();
    queueDequeue.enqueue(1);
    queueDequeue.enqueue(2);
    queueDequeue.enqueue(3);

    assertEquals(1,queueDequeue.dequeue(),0);
    assertEquals(2,queueDequeue.front.value);
  }

  @Test
  public void testQueuePeek() throws Exception {
    Queue<Integer> queuePeek = new Queue<>();
    queuePeek.enqueue(10);
    queuePeek.enqueue(20);
    queuePeek.enqueue(30);
    queuePeek.dequeue();

    assertEquals(20,queuePeek.peek(),0);
  }
  @Test
  public void testQueueMultipleDequeue() throws Exception {
    Queue<Integer> MultipleDequeue = new Queue<>();
    MultipleDequeue.enqueue(5);
    MultipleDequeue.enqueue(10);
    MultipleDequeue.enqueue(3);
    MultipleDequeue.dequeue();
    MultipleDequeue.dequeue();
    MultipleDequeue.dequeue();

    assertNull(MultipleDequeue.front);
  }
  @Test
  public void testQueueEmpty() {
    Queue<Integer> queueEmpty = new Queue<>();

    assertNull(queueEmpty.front);
    assertNull(queueEmpty.rear);
  }

}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;

import stackAndQueue.Animal.AnimalShelter;
import stackAndQueue.Animal.Cat;
import stackAndQueue.Animal.Dog;

public class Library {
  public static void main(String[] args) {
    System.out.println("helo");
    Stack<Integer> stackList = new Stack<>();
    stackList.push(1);
    stackList.push(2);
    stackList.push(3);
    stackList.push(4);

//    System.out.println(" ============ Stack =========== ");
//    System.out.println( stackList);
//    System.out.println( stackList.isEmpty());
//    System.out.println( stackList.pop());
//    System.out.println( stackList.peek());
//    System.out.println( stackList);


    Queue<String> queueList = new Queue<>();
    queueList.enqueue("1");
    queueList.enqueue("2");
    queueList.enqueue("3");
    queueList.enqueue("4");

//    System.out.println(" ============ Queue =========== ");
//    System.out.println( queueList);
//    System.out.println(queueList.isEmpty());
//    System.out.println(queueList.dequeue());
//    System.out.println(queueList.peek());
//    System.out.println( queueList);


    //////////////////////////code 11//////////////////
//    PseudoQueue test = new PseudoQueue();
//    test.enqueue(7);
//    test.enqueue(3);
//    test.enqueue(5);
//    test.enqueue(4);
//    test.enqueue(7);
//    test.dequeue();
//    test.enqueue(11);
//    test.dequeue();
//    test.dequeue();
//    System.out.println(test.stackOne.toString());

    ////////////////////code 12 /////////


//    AnimalShelter lists = new AnimalShelter();
////    System.out.println(lists);
//    lists.enqueue(new Cat("Cat1"));
//    lists.enqueue(new Cat("Cat2"));
//    lists.enqueue(new Cat("Cat3"));
//    lists.enqueue(new Dog("Dog1"));
//    lists.enqueue(new Dog("Dog2"));
//    lists.enqueue(new Dog("Dog3"));
//    lists.dequeue("cat");
//    lists.dequeue("dog");
////    lists.dequeue("dog2");
//
//    System.out.println(lists.catQueue.toString());
//    System.out.println(lists.dogQueue.toString());






    /////////////////////////code 13///////////////////////////////////////////////////


    Brackets lists = new Brackets();
    System.out.println(" the result is --> " + Brackets.brackets("[[by]]"));
   System.out.println("the result is --> " + Brackets.brackets("({{}})"));
 System.out.println("the result is --> " + Brackets.brackets("{()"));
    System.out.println(" the result is --> " + Brackets.brackets("({}"));
    System.out.println("the result is --> " + Brackets.brackets("int )"));
    System.out.println(" the result is --> " + Brackets.brackets(""));
    System.out.println(" the result is --> " + Brackets.brackets("mooo"));
    System.out.println("the result is --> " + Brackets.brackets("m((}}"));


  }
}


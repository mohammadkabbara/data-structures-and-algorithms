/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
////
//    LinkedList showValue = new LinkedList();
//    // insert
//      showValue.insert(1);
//      showValue.insert(2);
//      showValue.insert(67);
//      showValue.insert(50);
//      showValue.insert(4);
//
//    //includes
//    System.out.println(showValue.include(3));
//
//    // to string
//    System.out.println(showValue.toString());
//
//    }
    //////////////////code 6////////


//    LinkedList list = new LinkedList();
//    list.append(2);
//    list.append(1);
//    list.append(4);
//    System.out.println("append method" + " " + list.toString());
//
//
//    list.insertBefore(1, 3);
//    System.out.println("insertBefore" + " " + list.toString());
//
//
//    list.insertAfter(2,100);
//    System.out.println("insertAfter" + " " + list.toString());
//  }


    //////////////////code 7////////


// kth from end
//    try {
//      LinkedList listKth = new LinkedList();
//      listKth.append(1);
//      listKth.append(2);
//      listKth.append(3);
//      listKth.append(4);
//      listKth.append(5);
//      listKth.append(6);
//      listKth.append(7);
//      listKth.append(8);
//      listKth.append(9);
//      listKth.append(10);
//
//      System.out.println(listKth.linkedListKth(1));
//      System.out.println(listKth.linkedListKth(-7));
//    } catch (IndexOutOfBoundsException e) {
//      System.out.println("number out of the range");
//    }


    //////////////////code 8////////
    LinkedList firstList = new LinkedList();
    firstList.append(1);
    firstList.append(2);
    firstList.append(3);
    System.out.println(firstList);
    LinkedList secondList = new LinkedList();
    secondList.append(4);
    secondList.append(5);
    secondList.append(6);
    System.out.println(secondList);

    System.out.println("  ");

    LinkedList newZippedList = new LinkedList();
    newZippedList.head = firstList.zipLists(firstList,secondList);
    System.out.println(newZippedList);
  }
}

//

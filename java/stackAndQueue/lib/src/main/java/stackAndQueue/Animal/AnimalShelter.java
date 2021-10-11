package stackAndQueue.Animal;

import stackAndQueue.Queue;

public class AnimalShelter {

 public Queue catQueue = new Queue();
 public Queue dogQueue = new Queue();



    //////////////////////////////

    public void enqueue(Animal animal) {

      if (animal instanceof Cat){
        catQueue.enqueue(animal);
      }else if (animal instanceof Dog){
        dogQueue.enqueue(animal);
      }

    }

    public Object dequeue (String pref){
      if (pref.equals("cat")){
        return catQueue.dequeue();
      }else if (pref.equals("dog")){
        return dogQueue.dequeue();
      }
      return null;
    }

    @Override
  public String toString(){
      if (catQueue.isEmpty() && dogQueue.isEmpty()){
        return null;
      }

      return " Dog list => "+ dogQueue + "|||  Cat list => " + catQueue;
    }
  }



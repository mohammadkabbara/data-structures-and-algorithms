package stackAndQueue.Animal;

public class Cat extends Animal {
  public Cat (String catName){
    super(catName);
  }


  @Override
  public String toString(){
    return getAnimalName();
  }
}

package stackAndQueue.Animal;

public class Dog extends Animal {
  public Dog (String dogName){
    super(dogName);
  }


  @Override
  public String toString(){
    return getAnimalName();
  }
}

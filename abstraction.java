package oops_concepts;

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
public abstract void animalSound();
//Regular method
public void sounds() {
System.out.println("hello dog");
}
}

//Subclass (inherit from Animal)
class Dog extends Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The dog : barks");
}
}

public class abstraction {
public static void main(String[] args) {
 Dog myDog = new Dog(); // Create a dog object
 myDog.animalSound();
 myDog.sounds();
}
}

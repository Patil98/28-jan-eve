package Interface;

//Interface with an abstract method
interface Animal {
 void eat(); // Abstract method (implicitly public and abstract)
}

//Class implementing the interface
class Dog implements Animal {
 public void eat() {
     System.out.println("Dog is eating.");
 }
}

public class Calling_Abstract_Methods {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat(); // Calls the overridden method in Dog class
 }
}

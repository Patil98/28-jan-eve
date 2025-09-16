package Interface;

//Interface with a default method
interface Ani {
 default void sleep() {
     System.out.println("Animal is sleeping.");
 }
}

//Class implementing the interface
class Dogi implements Ani {
 // No need to override sleep() unless custom behavior is needed
}

public class Calling_Default_Methods {
 public static void main(String[] args) {
     Dogi dog = new Dogi();
     dog.sleep(); // Calls default method from interface
 }
}


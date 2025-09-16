package Interface;

//Interface with a static method
interface Anima {
 static void sound() {
     System.out.println("Animal makes a sound.");
 }
}

public class Calling_Static_Methods {
 public static void main(String[] args) {
     Anima.sound(); // Called using interface name
 }
}

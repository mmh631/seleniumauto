package javaPackage;

//Interface
public class Interface Animal {
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Horse implements Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The Horse says: wee wee");
}
public void sleep() {
 // The body of sleep() is provided here
 System.out.println("Zzz");
}
}

class Main {
public static void main(String[] args) {
 Horse myPig = new Horse();  // Create a Horse object
 myPig.animalSound();
 myPig.sleep();
}
}
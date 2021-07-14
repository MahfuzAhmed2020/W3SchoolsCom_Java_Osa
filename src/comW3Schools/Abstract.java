package comW3Schools;
//  https://www.w3schools.com/java/java_abstract.asp

	// Abstract class
abstract class Animal {
	public static void main(String[] args) {
		
	}
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzzzzzzzzzzzz");
  }
}
/*
// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}*/


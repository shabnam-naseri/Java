public class HelloWorld {
  public static void main(String[] args) {
    //First-The easiest way
    System.out.println("Hello World!");

    //Second- ;)
    System.out.println("+===================+"); 
    System.out.println("| Hello World!      |");
    System.out.println("+===================+");

    //Third- With red text
    System.out.print("\033[31m");
    System.out.println("Hello World!"); 
  }
}

//Fourth- Object-Oriented version of Hello World
public class Greeting {
  
  private String message;
  
  public Greeting(String message) {
    this.message = message; 
  }
  
  public void greet() {
    System.out.println(message); 
  }
  
}
public class World {

  private String word = "World";
  
  public String getWord() {
    return word;
  }
  
}
public class Main {

  public static void main(String[] args) {
    
    World world = new World();
    Greeting greeting = new Greeting("Hello " + world.getWord() + "!");
    
    greeting.greet();
    
  }

}

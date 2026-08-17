
public class Main {
  public static void main(String[] args) {  
    World world = new World(600,600);
    World world2= new World(500,500);
    World world3= new World(true);
   
     
    Turtle yertle = new Turtle(world);
    Turtle purdle = new Turtle(100,200,world2);
    Turtle hurdle = new Turtle(200,250,world3);

    // // Add your code here
    yertle.forward();
    yertle.turnRight();
    yertle.forward();

  
    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  }
}

import java.awt.Color;

public class Main {
  public static void main(String[] args) {  
    World world = new World(600,600);
    World world2= new World(500,500);
    World world3= new World(true);
   
     
    Turtle yertle = new Turtle(world);
    Turtle purdle = new Turtle(100,200,world);
    Turtle hurdle = new Turtle(200,250,world3);
    // // Add your code here

    // yertle.setShellColor(Color.blue);
    // yertle.setColor(Color.red);
    // System.out.println(hurdle.getShellColor());
    // yertle.setPenWidth(10); 
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();

    // purdle.turnToFace(yertle);

    yertle.star(5,50);
    purdle.spiral(10, 5);
    
    hurdle.square(50);
    
    hurdle.penUp();
    hurdle.forward(200);
    hurdle.penDown();


    hurdle.asterisk(50);
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

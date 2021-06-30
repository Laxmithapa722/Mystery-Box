/*
NIT2112
Mystery Box Game
19/06/2019
Game.java
Creates 3 box objects which are then put into a case with 8 different
possible outcomes which are randomised each time the game is run, the user
will be asked to select a box between 1 and 4 and if the box selected
sum is higher than the 3 bank boxes combined the player will win, otherwise 
the banker will win.
*/

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Game
{
   public static void main(String [] args)
   {
      Box b1 = new Box(1);
      Box b2 = new Box(2);
      Box b3 = new Box(3);
      Box b4 = new Box(4);
      Random randomiser = new Random(); 
      
      switch(randomiser.nextInt(8)) //uses above randomiser for 8 different cases below
      {
         case 0: //represents the 8 different outcomes of the boxes
            b1.setValue(20);
            b2.setValue(50);
            b3.setValue(200);
            b4.setValue(100);
            break;
         
         case 1:
            b1.setValue(20);
            b2.setValue(200);
            b3.setValue(50);
            b4.setValue(100);
            break;
         
         case 2:
            b1.setValue(50);
            b2.setValue(20);
            b3.setValue(100);
            b4.setValue(200);
            break; 
            
         case 3:
            b1.setValue(50);
            b2.setValue(100);
            b3.setValue(200);
            b4.setValue(20);
            break;
         
         case 4:
            b1.setValue(100);
            b2.setValue(20);
            b3.setValue(50);
            b4.setValue(200);
            break;
         
         case 5:
            b1.setValue(100);
            b2.setValue(200);
            b3.setValue(20);
            b4.setValue(50);
            break;
            
         case 6:
            b1.setValue(200);
            b2.setValue(100);
            b3.setValue(20);
            b4.setValue(50);
            break;
            
         case 7:
            b1.setValue(200);
            b2.setValue(50);
            b3.setValue(100);
            b4.setValue(20);
            break;
      }
      System.out.println("******* Welcome to the Mystery Box Game *******"); //game starts
      System.out.print("Please select a box: "); //user selects a box
      
      Scanner in = new Scanner(System.in);
      int scLabel = in.nextInt(); //scans the users input
      
      Box bB1; 
      Box bB2;
      Box bB3;
      Player player;

      switch (scLabel)
      {
      case 1: //reads users input to declare which box is selected
         player = new Player(b1);
         bB1 = b2;
         bB2 = b3;
         bB3 = b4;
      break;
      
      case 2: 
         player = new Player(b2);
         bB1 = b1;
         bB2 = b3;
         bB3 = b4;
      break; 
      
      case 3: 
         player = new Player(b3);
         bB1 = b1;
         bB2 = b2;
         bB3 = b4;
      break;
      
      default: 
         player = new Player(b4);
         bB1 = b1;
         bB2 = b2;
         bB3 = b3;
      }
      
      int Ototal = bB1.getValue() + bB2.getValue() + bB3.getValue();
      System.out.println(); 
      System.out.println(player); //runs the print from player.java which contains 
                                  //the users selected box and value
      System.out.println();
      System.out.println("The banker has: " + Ototal);
      System.out.println(bB1); //runs the print from player.java which contains 
      System.out.println(bB2); //the 3 bank boxes with their values
      System.out.println(bB3);
      System.out.println();
      
      if (player.getBoxValue() > bB1.getValue() + bB2.getValue() + bB3.getValue()) {
         System.out.println("Player wins the game");
      } else { //if players value is more than banks combined the player wins
         System.out.println("The Banker wins the game");
      }        //if not the bank wins
   }
}  

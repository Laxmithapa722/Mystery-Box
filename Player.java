/*
NIT2112
Mystery Box Game
19/06/2019
Player.java
Player contains the pickedbox which contains the values the
user selected while running game.java
*/

public class Player
{
  private Box pickedBox;
  
  public Player(Box pickedBox) //creates player with the selected box
  {
    this.pickedBox = pickedBox;
  }
  
  public int getBoxValue() //collects box value
  {
    return this.pickedBox.getValue();
  }
  
  public String toString()
  { //the print line which is used in game.java to print the players box and value
    return "Player has chosen box " + this.pickedBox.getLabel() 
    + " with value " + this.pickedBox.getValue();
  }
}
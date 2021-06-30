/*
NIT2112
Mystery Box Game
19/06/2019
Box.java
Box is used to store and collect the users input which is
used in player.java to print the values the user and inputed 
in game.java
*/
public class Box
{
  private int label;
  private int value;
  
  public Box(int label) //creates the box used in game.java
  {
    this.label = label;
  }
  public String toString() //returns a string variable to be used in player.java print
  {
    return "Box " + this.label + " with value " + this.value;
  }
  public void setValue(int value) //creates value
  {
    this.value = value;
  }
  public int getValue() //receives the value
  {
    return this.value;
  }
  public int getLabel() //receives the label
  {
    return this.label;
  }
}

/*
NIT2112
Mystery Box Game
19/06/2019
DisplayGame.java
Creates the JFrame that will be used in GamePanel.java
*/

import javax.swing.JFrame;

public class DisplayGame
{
  public static void main(String[] args)
  {
    JFrame w1 = new JFrame("Mystery Box Game"); //name of JFrame
    
    GamePanel myGamePanel = new GamePanel(); 
    w1.add(myGamePanel); //Adds JFrame and size
    w1.setSize(275, 280);
    w1.setVisible(true);
    w1.setDefaultCloseOperation(3);
  }
}
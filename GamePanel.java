/*
NIT2112
Mystery Box Game
19/06/2019
GamePanel.java
Creates 3 box objects which are then put into a case with 8 different
possible outcomes which are randomised each time the game is run, the user
will be asked to select a box between 1 and 4 and if the box selected
sum is higher than the 3 bank boxes combined the player will win, otherwise 
the banker will win.
*/

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel
  extends JPanel
  implements ActionListener
{
  private JButton boxButton1 = new JButton("Mystery Box 1"); //Creates the JButtons
  private JButton boxButton2 = new JButton("Mystery Box 2");
  private JButton boxButton3 = new JButton("Mystery Box 3");
  private JButton boxButton4 = new JButton("Mystery Box 4");
  private Box b1 = new Box(1); //Box variable created
  private Box b2 = new Box(2);
  private Box b3 = new Box(3);
  private Box b4 = new Box(4);
  private JTextArea resultField = new JTextArea();
  
  public GamePanel()
  {
    setLayout(new FlowLayout());
    
    add(this.boxButton1);
    add(this.boxButton2);
    add(this.boxButton3);
    add(this.boxButton4);
    
    this.boxButton1.addActionListener(this);
    this.boxButton2.addActionListener(this);
    this.boxButton3.addActionListener(this);
    this.boxButton4.addActionListener(this);

    
    add(new JLabel("Click any box to commence play"));
    
    this.resultField.setPreferredSize(new Dimension(250, 150)); //JTextArea dimensions
    add(this.resultField); 
    
    Random randomiser = new Random(); //uses above randomiser for 8 different cases below
    switch (randomiser.nextInt(8))
    {
    case 0: //represents the 8 different outcomes of the boxes
      this.b1.setValue(20);
      this.b2.setValue(50);
      this.b3.setValue(200);
      this.b4.setValue(100);
      break;
    case 1: 
      this.b1.setValue(20);
      this.b2.setValue(200);
      this.b3.setValue(50);
      this.b4.setValue(100);
      break;
    case 2: 
      this.b1.setValue(50);
      this.b2.setValue(20);
      this.b3.setValue(100);
      this.b4.setValue(200);
      break;
    case 3: 
      this.b1.setValue(50);
      this.b2.setValue(100);
      this.b3.setValue(200);
      this.b4.setValue(20);
      break;
    case 4: 
      this.b1.setValue(100);
      this.b2.setValue(20);
      this.b3.setValue(50);
      this.b4.setValue(200);
      break;
    case 5: 
      this.b1.setValue(100);
      this.b2.setValue(200);
      this.b3.setValue(20);
      this.b4.setValue(50);
       break;
    case 6: 
      this.b1.setValue(200);
      this.b2.setValue(100);
      this.b3.setValue(20);
      this.b4.setValue(50);
      break;
    case 7: 
      this.b1.setValue(200);
      this.b2.setValue(50);
      this.b3.setValue(100);
      this.b4.setValue(20);
    }
  }
  
  public void actionPerformed(ActionEvent e)
  {
    Box bB3;
    Box bB2;
    Player player;
    Box bB1;
    
    if (e.getSource() == this.boxButton1)
    {  //reads users input to declare which box is selected
      player = new Player(this.b1);
      bB1 = this.b2;
      bB2 = this.b3;
      bB3 = this.b4;
    }
    else
    {
      if (e.getSource() == this.boxButton2)
      {
        player = new Player(this.b2);
        bB1 = this.b1;
        bB2 = this.b3;
        bB3 = this.b4;
      }
      else if (e.getSource() == this.boxButton3)
      {
        player = new Player(this.b3);
        bB1 = this.b1;
        bB2 = this.b2;
        bB3 = this.b4;
      }
      else
      {
        player = new Player(this.b4);
        bB1 = this.b1;
        bB2 = this.b2;
        bB3 = this.b3;
      }
    } 
    
    int Ototal = bB1.getValue() + bB2.getValue() + bB3.getValue();
    
    //prints values in JTextArea of users chosen box and if they won
    this.resultField.setText(player.toString() + "\n"); 
    this.resultField.append("\n");
    this.resultField.append("The banker has: " + Ototal);
    this.resultField.append("\n");
    this.resultField.append(bB1.toString() + "\n");
    this.resultField.append(bB2.toString() + "\n");
    this.resultField.append(bB3.toString() + "\n");
    this.resultField.append("\n");
    if (player.getBoxValue() > bB1.getValue() + bB2.getValue()+ bB3.getValue()) {
      this.resultField.append("Player wins the game");
    } else {
      this.resultField.append("The banker wins the game");
    }
  }
}
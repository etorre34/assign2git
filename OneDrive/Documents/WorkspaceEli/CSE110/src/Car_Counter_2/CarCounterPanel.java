

//********************************************************************
//Program Name:  CarCounterPanel.java  Starting File - CarCounter 2 Activity 
//Author : P Baker / P Jalowiec
//Date : 2011
//
//Brief Description:
//	Demonstrates a graphical user interface and an event listener.
//		Frames, Panels, labels, textfields, buttons
//
//Bonus :  add an image of the car 
//********************************************************************
package Car_Counter_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class CarCounterPanel extends JPanel
{
 private int carCount;
 private JLabel carLabel;
	private JTextField carTextField;
	private JButton carButton;
	private Random gen;
	private JLabel carMakeLabel;
	private JTextField carMakeTextField;
	
	//Bonus  add an image into a JLabel
	
	private JLabel carImageLabel;
	private ImageIcon chevyImageIcon;
	private ImageIcon mercedesImageIcon;

	//Constructor:  Sets up the Panel  
	public CarCounterPanel()
{
     carCount = 0;
     gen = new Random();
		
		//create panel components
		carLabel =     new JLabel("Number of cars: ");
		carTextField = new JTextField(10);
     carButton = new JButton("Press Here");
     carMakeLabel = new JLabel("Car Make: ");
     carMakeTextField = new JTextField(10);
     
     //bonus
     carImageLabel = new JLabel(" ");
     chevyImageIcon = new ImageIcon("src/ch6/chevy.jpg"); //need to put path
     mercedesImageIcon = new ImageIcon("src/ch6/mercedes.jpg");
     
		//connect event handler to event source
     carButton.addActionListener(new ButtonListener());
		
		//add components to panel.  order is important
     add(carLabel);
     add(carTextField);
     
		add(carMakeLabel);
		add(carMakeTextField);
		
		//bonus
		add(carImageLabel);
		
		add(carButton);
				
		//configure panel.  
     setBackground(Color.cyan);
     //setPreferredSize(new Dimension(300, 200));
     setPreferredSize(new Dimension(160, 220));
		carTextField.setText(Integer.toString(0));
}

//private internal class that is a listener for button push (action) events.
	//also called an event handler
	private class ButtonListener implements ActionListener
{
   public void actionPerformed (ActionEvent event)
   {
		  //update the counter and the textField with the button is pushed
 	  //carCount++;
 	  carCount = gen.nextInt(51);
 	  carTextField.setText(Integer.toString(carCount));
 	  if (carCount % 2 == 0)//even
 	  {
 		  setBackground(Color.YELLOW);
 		  carMakeTextField.setText("Chevy");
 		  //bonus
 		  carImageLabel.setIcon(chevyImageIcon);
 	  }
 		  
 	  else
 	  {
 		  setBackground(Color.GREEN);
 		  carMakeTextField.setText("Mercedes");
 		  //bonus
 		  carImageLabel.setIcon(mercedesImageIcon);
 	  }
 		  
        
			  
			  
   }//end of ActionPerformed method
		
}//end of ButtonListener
	
}//end of CarCounterPanel


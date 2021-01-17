package Car_Counter_2;

//********************************************************************
//Program Name:CarCounter.java   CarCounter 2 Activity     
//Author :  P Baker / P Jalowiec
//Date :  Oct 2010
//
//Brief Description: Demonstrates a graphical user interface and an event listener.
//********************************************************************

import javax.swing.JFrame;

public class CarCounter
{
public static void main(String[] args)
{
		//Create frame and panel
  JFrame frame = new JFrame("Car Counter");
  CarCounterPanel panel = new CarCounterPanel();

	//set frame behavior
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	
	//place panel in frame
  frame.getContentPane().add(panel);
	
	//format frame and make available/visible
  frame.pack();
  frame.setVisible(true);
}
}


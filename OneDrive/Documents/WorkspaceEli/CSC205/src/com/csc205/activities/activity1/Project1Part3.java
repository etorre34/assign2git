package com.csc205.activities.activity1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 * 
 * @author torre
 *
 */
public class Project1Part3 extends Applet {
	public void paint(Graphics g)
	{
		/**
		 * Declaring Color to equal
		 * a specific color
		 */
		Color Alabama = Color.blue;
		Color Arkansas = Color.blue;
		Color Louisiana = Color.orange;
		Color Tennessee = Color.orange;
		Color Mississippi = Color.red;
		
		g.setColor(Alabama);
		g.setColor(Arkansas);
		g.setColor(Louisiana);
		g.setColor(Tennessee);
		g.setColor(Mississippi);
		
		g.drawString("Alabama " + Alabama, 60, 60);
		g.drawString("Arkansas " + Arkansas, 100, 100);
		g.drawString("Louisiana " + Louisiana, 200, 200);
		g.drawString("Tennessee " + Tennessee, 150, 150);
		g.drawString("Mississippi " + Mississippi, 250, 250);
	
		
		}

	private String setColor(Color orange) {
		
		return "Alabama";
	}
	
		
}




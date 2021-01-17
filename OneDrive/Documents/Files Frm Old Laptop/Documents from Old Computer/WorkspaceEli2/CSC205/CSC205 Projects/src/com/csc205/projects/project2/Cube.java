package com.csc205.projects.project2;
import java.text.DecimalFormat;

/**
 * Cube class that extends the ThreeDShapes abstract class.
 * <p>
 *  Has methods to set up number of sides on a cube to be used to calculate the surface area
 * and volume. This class also has methods to use the formulas to find 
 * both the surface area and the volume. Also has a method to format the results of the 
 * surface area and the volume.
 * <p>
 * 
 * Author Elias Torres
 *
 */
public class Cube extends ThreeDShapes {

	/**
	 * Constructor
	 */
	public double sides;
	/**
	 * To format results.
	 */
	DecimalFormat fmt = new DecimalFormat("0.00");
	
	/**
	 * To set up the measurement.
	 */
	public Cube (double sides) {
		this.sides = sides;
		
	}
	
	/**
	 * Formula to calculate the surface area and
	 * format the results.
	 */
	public String calculateSurfaceArea() {
		return fmt.format((6.0) * Math.pow(sides, 2));
	}
	
	/**
	 * Formula to calculate the volume and
	 * format the results.
	 */
	public String calculateVolume() {
		return fmt.format(Math.pow(sides, 3));
	}
	
	/**
	 * To string the results of the surface area
	 * and volume to the driver class.
	 */
	public String toString() {
		return "Cube [Surface Area = " + calculateSurfaceArea() + 
				" Volume = " + calculateVolume() + "]";
	}


}

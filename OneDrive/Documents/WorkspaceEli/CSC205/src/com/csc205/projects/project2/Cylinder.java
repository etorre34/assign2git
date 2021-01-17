package com.csc205.projects.project2;
import java.text.DecimalFormat;

/**
 * Cylinder class that extends the ThreeDShapes abstract class.
 * <p>
 * Has methods to set up the radius and to be used to calculate the surface area and
 * the volume of a cylinder. This class also has methods to use the formulas to find 
 * the surface area and volume. Also has a method to format the results of the 
 * surface area and the volume.
 * <p>
 * 
 * Author Elias Torres
 *
 */
public class Cylinder extends ThreeDShapes {

	/**
	 * Constructors
	 */
	public double height;
	public double radius;
	/**
	 * To format the results.
	 */
	DecimalFormat fmt = new DecimalFormat("0.00");
	
	/**
	 * To set up the radius and height.
	 */
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	/**
	 * To return the radius.
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * To return the height.
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Mutator to set the height.
	 */
	public void setHeight(double h) {
		this.height = h;
	}
	
	/**
	 * Mutator to set the radius.
	 */
	public void setRadius(double r) {
		this.radius = r;
	}
	
	/**
	 * Formula to calculate the surface area
	 * and format the results.
	 */
	public String calculateSurfaceArea () {
		 return fmt.format((2.0) * Math.PI * Math.pow(radius, 2)
				+ (2.0) * Math.PI * radius * height);
	}
	
	/**
	 * Formula to calculate the volume and
	 * format the results.
	 */
	public String calculateVolume () {
		return fmt.format(Math.PI * Math.pow(radius, 2) * height);
	}
	
	/**
	 * To string the results of the surface area and volume
	 * to the driver class.
	 */
	public String toString() {
		return "Cylinder [Surface Area = " + calculateSurfaceArea()
		+ " Volume = " + calculateVolume() + "]";
	}
	
}

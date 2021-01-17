package src.com.csc205.projects.project2;
import java.text.DecimalFormat;

/**
 * Sphere class that extends the ThreeDShapes abstract class
 * <p>
 * Has methods to set up the radius and to be used to calculate the surface area 
 * and volume of a sphere. This class also has methods to use the formulas to find 
 * the surface area and volume. Also has a method to format the results of the 
 * surface area and volume.
 * <p>
 * 
 * 
 * Author Elias Torres
 *
 */
public class Sphere extends ThreeDShapes {

	/**
	 * Constructor
	 */
	public double radius;
	/**
	 * To format results.
	 */
	DecimalFormat fmt = new DecimalFormat("0.00");
	
	/**
	 * To set up radius as r.
	 */
	public Sphere (double r) {
		this.radius = r;
	}
	
	/**
	 * To return the radius.
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Mutator to set the radius.
	 */
	public void setRadius(double r) {
		this.radius = r;
	}
	
	/**
	 * Formula to calculate the surface area
	 * and return the result.
	 */
	public String calculateSurfaceArea() {
		return fmt.format((4.0) * Math.PI * Math.pow(radius, 2));
	}
	
	/**
	 * Formula to calculate the volume and
	 * return the result.
	 */
	public String calculateVolume() {
		return fmt.format((4.0/3) *Math.PI * Math.pow(radius, 3));
		
	}
	
	/**
	 * To String the results of the surface area and 
	 * volume to the driver class.
	 */
	public String toString() {
		
	return "Sphere [Surface Area = " + calculateSurfaceArea() +
			" Volume = " + calculateVolume() + "]";
	
	
	}
}



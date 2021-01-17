package src.com.csc205.projects.project2;
import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2 to give the surface area and volume of three 3D shapes.
 * <p>
 * This driver has methods like using the array list and a for loop to make
 * a list of the 3D shapes used from the child classes so it can be in 
 * order and show the surface area and volume. I also added a String to 
 * give better results.
 * <p>
 * Output:
 * 
 * <pre>
 *Cube [Surface Area = 600.00 Volume = 1000.00]
 *Sphere [Surface Area = 113.10 Volume = 113.10]
 *Cylinder [Surface Area = 87.96 Volume = 62.83]
 * <pre>
 * 
 * 
 * Author: Elias Torres
 * 
 */
public class Project2Test {
	/**
	 * Main method.
	 */
	public static void main(String[] args) {
	/**
	* Method is used to make a new ArrayList out of 
	* the abstract class ThreeDShapes   
	*/
	List<ThreeDShapes> shapes = new ArrayList<>();
	/**
	 * Makes a new object using the child classes
	 */
	  shapes.add(new Cube(10.0));
	  shapes.add(new Sphere(3.0));
	  shapes.add(new Cylinder(2.0,5.0));
	  /**
	   * a for loop to put the shapes in order
	   * and print the list out.
	   */
	  for (ThreeDShapes shape : shapes) {
		
		  System.out.println(shape);
		}

	}

}
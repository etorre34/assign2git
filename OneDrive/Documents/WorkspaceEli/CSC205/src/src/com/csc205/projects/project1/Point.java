package src.com.csc205.projects.project1;

/**
 * Point class to be used in the driver class: Project 1
 * <p>
 * The point class has methods to be implemented in the driver class. This will help
 * set up a new point in the driver class and process the formula to get the distance
 * and rotation where the point shall be at. This will provide a hashcode 
 * for the point.
 * <p>
 * output
 * 
 * <pre>
 *Project 1 : Point Tester
 *
 *Point 1: Point [x=3.0, y=1.0, getX()=3.0, getY()=1.0, hashCode()=366712642]
 *Point 2: Point [x=0.0, y=0.0, getX()=0.0, getY()=0.0, hashCode()=1829164700]
 *
 *Distance: 3.1622776601683795
 *
 *Rotated a 1.5707963267948966: Point [x=2.916636249802312, y=2.9954914495915914, getX()=2.916636249802312, getY()=2.9954914495915914, hashCode()=366712642]
 *Shifted b 4.47213595499958 away from original position: Point [x=4.0, y=-2.0, getX()=4.0, getY()=-2.0, hashCode()=1829164700]
 *<pre>
 *
 *
 * @author Elias Torres
 *
 */
public class Point {
	/**
	 * Used as my instance variables
	 */
	private double x;
	private double y;
	
	public Point() {
	
	}
	/**
	 * Used as constructors
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Constructor that's used to return the distance
	 * by using the distance formula.
	 * @param p2
	 * @return
	 */
	public double distance(Point p2) {
	     double x = this.x - p2.x;
	     double y = this.y - p2.y;
	     return Math.sqrt(x * x + y * y);
	 
	}
	/**
	 * Returns the distance after the formula.
	 * @param x
	 * @param y
	 * @return
	 */
	public double distance(double x, double y) {
		return distance(x, y);
	
		//return distance;
	}
	
	/**
	 * Returns the x variable
	 * @return
	 */
	public double getX() {
		return this.x;
	}
	/**
	 * After returning, sets the x-variable
	 * @param x
	 */
	public void setX(double x) {
		x = this.x;
	}
	/**
	 * Returns the y-variable
	 * @return
	 */
	public double getY() {
		return this.y;
	}
	/**
	 * After returning, sets the y-variable
	 * @param y
	 */
	public void setY(double y) {
		y = this.y;
	}
	/**
	 * Sets the initial point 
	 * @param x
	 * @param y
	 */
	public void setPoint(double x, double y) {
		this.x = 0;
		this.y = 0;
	}
	/**
	 * Mutator that helps shift the x variable by one in the positive
	 * and negative direction.
	 * @param n
	 */
	public void shiftX(double n) {
	    x += n;
	}
	/**
	 * Mutator that helps shift the y variable by one in the positive
	 * and negative direction.
	 * @param n
	 */
	public void shiftY(double n) {
		y += n;
	}
	/**
	 * Formulas used to rotate the angle of the point.
	 * @param angle
	 */
	public void rotate(double angle) {
		x = this.x * (Math.cos(Math.toRadians(angle)) - this.y * Math.sin(Math.toRadians(angle)));
		y = this.x * (Math.sin(Math.toRadians(angle)) + this.y * Math.cos(Math.toRadians(angle)));
	}
	/**
	 * Overridden toString method.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append(", getX()=" + getX());
		builder.append(", getY()=" + getY());
		builder.append(", hashCode()=" + hashCode());
		//builder.append(", toString()=");
		builder.append("]");
		return builder.toString();
	}
	
	
}

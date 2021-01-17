package src.com.csc205.projects.project1;

/**
 * Driver class used to test the Point class.
 *
 *<pre>
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
 * @author Elias Torres
 * @version 1.1
 */
public class Project1 {
	
/**
 * The driver arguments.
 */
    public static void main(String[] args) {
    	
        System.out.println("Project 1 : Point Tester\n");
        /**
         * Initialize and start a new point.
         */
        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));
        /**
         * Formula used for rotation of the new point
         * and records the rotation.
         */
        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);
        
        /**
         * The new point that's to be shifted from Point b 
         * and recorded.
         */
        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);

    }
}


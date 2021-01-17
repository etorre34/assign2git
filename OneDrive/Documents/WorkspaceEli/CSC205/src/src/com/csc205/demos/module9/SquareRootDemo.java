package src.com.csc205.demos.module9;

import java.util.Scanner;

/**
 * Example of an application of a binary search algorithm.
 * <p>
 * Uses a min, mid and max value to determine the square root of a number.  Starting point is the
 * number entered divided by two.  A precision is used to determine when to stop guessing.  Code is
 * added to handle situations where parasidic oscillations occur that cause the same value to be
 * guessed over and over again.
 * <p>
 * Created by Ray on 6/17/2016.
 */
public class SquareRootDemo {

    public static float calculate(float number, float precision) {

        // TODO implement code to estimate square root
		
        if (number < 0) {
        	return -1;
        }

    

    /**
     * Used to determine if calculated square root is within tolerance.
     *
     * @param datum
     * @return
     */
  
        
     
        Datum datum = new Datum();
        
        datum.min = 0.0f;
        datum.max = number;
        datum.mid = 0.0f;
        
        datum.number = number;
        datum.precision = precision;
        
        while (outOfTolerance(datum)) {
        	
        	Datum originalDatum = new Datum(datum);
        	datum.mid = (datum.min + datum.max) / 2.0f;
        	System.out.print("Guess: " + datum.mid + "");
        	
        	if (Math.pow(datum.mid, 2) > number) {
        		datum.max = datum.mid;
        		if (outOfTolerance(datum)) {
        			System.out.println("Guess Too High - dropping max");
        			
        		}
        	} else {
        		datum.min = datum.mid;
        		if (outOfTolerance(datum)) {
        			System.out.println("Guess Too Low - raising min");
        		}
        	}
        	
        	if (originalDatum.compareTo(datum) == 0) {
        		System.out.println(datum);
        		break;
        	}
        }
        
        System.out.println();
        
        return datum.mid;
    }
    private static boolean outOfTolerance(Datum datum) {
        return ((float) Math.abs(Math.pow(datum.mid, 2) - datum.number) >= datum.precision);
    /**
     * Class used to hold data related to square root search/guess.
     */
    private static class Datum//Datum sounds like data, means a single point of data.
        implements Comparable<Datum> {

        float min;
        float max;
        float mid;

        float number;
        float precision;

        // Needed to be able to have a copy constructor
        Datum() {

        }

        // copy constructor pattern - creates deep copy
        Datum(Datum datum) {

            this.min = datum.min;
            this.max = datum.max;
            this.precision = datum.precision;
            this.mid = datum.mid;
            this.number = datum.number;

        }

        /**
         * Used to compare two Datum objects.
         *
         * @param datum
         * @return
         */
        @Override public int compareTo(Datum datum) {

            if (this.mid < datum.mid) {
                return -1;
            } else if (this.mid > datum.mid) {
                return 1;
            }

            return 0;

        }
		
		@Override public boolean equals(Object obj) {
            if (obj instanceof Datum) {
                if (((Datum)obj).mid == this.mid) {
                    return true;
                }
            }
            return false;
        }

        @Override public String toString() {
            return "Datum{" +
                "min=" + min +
                ", max=" + max +
                ", mid=" + mid +
                '}';
        }
    }

}
}

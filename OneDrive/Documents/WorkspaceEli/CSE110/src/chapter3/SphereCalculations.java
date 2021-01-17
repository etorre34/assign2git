package chapter3;

//Program Name: SphereCalculations.java
//Author: Elias Torres
//Class: CSC110
//Date Written: 11-Sept-2016
//Brief Description: This program will help calculate the radius, volume and surface area
//                 of a sphere.

import java.text.DecimalFormat;
import java.util.Scanner;

public class SphereCalculations {

	public static void main(String[] args) {
		
double radius, volume, surface_area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Sphere Calculator");
		System.out.print("Enter the sphere's radius: ");
		radius = scan.nextDouble();
		System.out.print("\n");
		
		volume = ((4.0/3) * Math.PI * Math.pow(radius, 3));
		surface_area = 4.0 * Math.PI * Math.pow(radius, 2);
		
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		System.out.println("The Results are:");
		System.out.println("Radius: " + radius);
		System.out.println("Volume: " + fmt.format(volume));
		System.out.println("Surface area: " + fmt.format(surface_area));
		System.out.print("\n");
		
		System.out.println("Welcome to the Sphere Calculator");
		System.out.print("Enter the sphere's radius: ");
		radius = scan.nextDouble();
		System.out.print("\n");
		
		volume = ((4.0/3) * Math.PI * Math.pow(radius, 3));
		surface_area = 4.0 * Math.PI * Math.pow(radius, 2);

		System.out.println("The Results are:");
		System.out.println("Radius: " + radius);
		System.out.println("Volume: " + fmt.format(volume));
		System.out.println("Surface area: " + fmt.format(surface_area));
		
		scan.close();
		
		
		
	}

}

/* my output
* Welcome to the Sphere Calculator
Enter the sphere's radius: 4.2

The Results are:
Radius: 4.2
Volume: 310.3391
Surface area: 221.6708

Welcome to the Sphere Calculator
Enter the sphere's radius: 7.5

The Results are:
Radius: 7.5
Volume: 1767.1459
Surface area: 706.8583
*/


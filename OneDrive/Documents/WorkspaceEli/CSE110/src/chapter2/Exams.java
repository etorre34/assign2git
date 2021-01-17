package chapter2;

//Program Name: Exam.java
//Author: Elias Torres
//Date Written: 05-Sept-2016
//Class: CSC110
//Brief Description: This program will calculate the average of the three exam scores.

import java.util.Scanner;

public class Exams {

	public static void main(String[] args) {
		
		 int javaExamScoreOne;
		 int javaExamScoreTwo;
		 int javaExamScoreThree;
		 double javaAverageScore;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first exam score:");
		javaExamScoreOne = scan.nextInt();
		
		System.out.print("Enter the second exam score:");
		javaExamScoreTwo = scan.nextInt();
		
		System.out.print("Enter the third exam score:");
		javaExamScoreThree = scan.nextInt();
		
		javaAverageScore = (javaExamScoreOne + javaExamScoreTwo + javaExamScoreThree)
				/ 3; 
		
		System.out.println("");
		System.out.println("The average exam score is: " + javaAverageScore);
		
				
		scan.close();
		
	}

}


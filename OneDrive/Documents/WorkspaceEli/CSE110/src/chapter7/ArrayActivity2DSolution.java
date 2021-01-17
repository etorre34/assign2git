package chapter7;
//**********************************************************
//In class Activity - Ch 7 Arrays - 2D/Multidimensional solution
//Program Name : ArrayActivity2DSolution.java  
//
//Author: PBaker
//Date Written : 
//Class:
//
//Brief Description:
//Intro to 2 dimensional arrays in a java
//
//**********************************************************

public class ArrayActivity2DSolution
{
  public static void main(String[] args)
  {
		double value = 0.0;
		double average = 0.0;
		int countValues = 0;
		
		// declare an array called myExams that holds 4 exams for 10 students
		// so each row is represents a student
		double[][] myExams = new double[10][3];

  	//load the array with the values 0 - 39, in order
		value = 0;
  	for(int row = 0; row < 10; row++)  
  	//  for(int row = 0; row < myExams.length; row++)   this is better 
  	{
  		for (int col = 0; col < 3; col++)
  		//  for (int col = 0; col < myExams[0].length; col++)   this is better	
  		{
  			
  			myExams[row][col] = value;
  			value += 1;
  		}
  	}
  	
		
 	  //display all the components of the array
    System.out.println("Display the array\n");	
  	for(int row = 0; row < myExams.length; row++)  
      {
      	for (int col = 0; col < myExams[0].length; col++)
      	{
      		System.out.print(myExams[row][col] + "\t");
      	}
      	System.out.println();
      }
		
  	
		//add up all the element values in the array
		double sum = 0.0;
		for(int row = 0; row < myExams.length; row++)  
	    {
	    	for (int col = 0; col < myExams[0].length; col++)	
	    	{
	    		sum = sum + myExams[row][col];
	    	}
	    }
		
		System.out.println("The sum of the array: " + sum);
		
		//challenge : calculate the average
		
		average = sum / (myExams.length * myExams[0].length);
		
		System.out.println("\nChallenge: Calculate the average ");
		System.out.println("The average is :" + average);
		
		System.out.println("\nChallenge: Count how many values that are greater than 22: ");
		
		countValues = 0;
		for(int row = 0; row < myExams.length; row++)  
	    {
	    	for (int col = 0; col < myExams[0].length; col++)	
	    	{
	    		if (myExams[row][col] > 22)
	    			countValues++;
	    	}
	    }
		
		System.out.println("Number of values greater than 22: " + countValues);
		


  }
}


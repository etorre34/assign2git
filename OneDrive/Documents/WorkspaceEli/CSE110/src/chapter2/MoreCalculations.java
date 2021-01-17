package chapter2;

/*      Looking at calculations with integers and doubles.

Of special interest is integer division.
Show conversion with assignment
Show conversion via promotion
Show conversion with casting with (double)

Using modulo in conjunction with integer division.

Using final to declare a constant.  Note constants are
traditionally written in all caps.
*/




public class MoreCalculations
{


public static void main(String[] args)
{

//variable declarations

int iResult;
double dResult;


iResult = 12/ 6;  //returns 2
System.out.println("Result = " + iResult);

iResult = 10 / 6; //returns 1
System.out.println("Result = " + iResult);

dResult = iResult;  //example of conversion with assignment


//dResult = 10.0 / 6;  //returns 1.666 example of promotion
//dResult = (double)10 / 6; //an example of casting

System.out.println("DResult = " + dResult);

//Modular arithmetic
int totalCash = 37;
int nickels = totalCash / 5;

//Clearer to use a constant
final int NICKELVALUE = 5;

//now the calculation is self explanatory
nickels = totalCash / NICKELVALUE;

System.out.println("Total Cash = " + totalCash);
System.out.println("Nickels = " + nickels);

//Use the modulo operator to find the remainder
int penniesLeft = totalCash % NICKELVALUE;

System.out.println("Pennies left = " + penniesLeft);


	}
}




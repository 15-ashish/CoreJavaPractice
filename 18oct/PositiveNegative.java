/*
Program: Positive /Negative Number
 Ashish Sahay
 18 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class PositiveNegative
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          int num1;
          System.out.println("Enter your number");
		  num1=sc.nextInt();//method to take user input
		  if((num1>0))//checking positive/negative
		  {
			  System.out.println("Given number "+num1 +" is positive ");//printing positive number
		  }
		  else
		  {
			   System.out.println("Given number "+num1 +" is negative ");//printing negative number
		  }
		
	}	
		
	}//end of main
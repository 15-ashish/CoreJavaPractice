/*
Program: Voting Age
 Ashish Sahay
 18 oct 2022  
*/
 import java.util.*;
 
//declaring a class
class VotingAge
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          int age;
		  String name;
          System.out.println("Enter your name");
		  name=sc.nextLine();//method to take user input as string
		  System.out.println("Enter your age");
		  age=sc.nextInt();//method to take user input as integer
		  if((age>=18))
		  {
			  System.out.println(name +","+" you are eligible to vote as your age, " +age +" is above 18");//printing eligible name and age
		  }
		  else
		  {
			   System.out.println(name +","+" you are not eligible to vote as your age, " +age +" is below 18");//printing not eligible name and age
		  }
		
	}	
		
	}//end of main
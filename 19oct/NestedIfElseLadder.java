/*
Program: Nested if else ladder demo
Ashish Sahay
19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedIfElseLadder
{
	//main started
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          float operating_system,java,dbms;// declaring variable 
		  String name;
          
		  System.out.println("Enter your Nmae:");
		  name=sc.nextLine();
		  
		  System.out.println("Enter your Operating System Marks");
		  operating_system=sc.nextFloat();//user input ----> marks @ os
		  
		  System.out.println("Enter your  Marks in java");
		  java=sc.nextFloat();//user input ----> marks @ java
		  
		  System.out.println("Enter your Marks of dbms");
		  dbms=sc.nextFloat();//user input ----> marks @ dbms
		  
		  System.out.println("\n\n");
		 float percentage=(float)((operating_system+java+dbms)/300)*100;
		 
		  if((percentage>=90))//checking percentage
		        System.out.println("Congratulations!!! "+name+" you have passed with grade A,Your marks is "+percentage);
	      else if((percentage>70)&&(percentage<90))
			  System.out.println("Need Improvement!!! "+name+" you have passed with grade B,Your marks is "+percentage);
		  else if((percentage>50)&&(percentage<=70))
			  System.out.println("Work Hard!! "+name+" you have passed with grade C,Your marks is "+percentage);
		  else if((percentage>=40)&&(percentage<=50))
			  System.out.println("Work Very hard!!! "+name+" you have passed with grade D,Your marks is "+percentage);
		  else
			  System.out.println("Sorry!!! "+name+" you have failed  with grade F,Your marks is "+percentage);
			
		
		    
	}
		
	// end of main
}
// end of class 
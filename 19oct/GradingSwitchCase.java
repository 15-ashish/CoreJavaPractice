/*
Program: Grading System using Switch case and application of method call
Ashish Sahay
19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class GradingSwitchCase
{
	
	   //grade method starts
	   static void grade(char g,String name,float percentage) //formal arguments 
	   {
		    switch(g) //Switch case starts----->>>taking input value in character g and switches the control to desired case
			{
			 case 'A':
			     System.out.println("Congratulations!!! "+name+" ,you have passed with grade "+g+", Your marks is "+percentage);
		      break;  //break the flow and allow the control to come out of switch case
			
			 case 'B':
			     System.out.println("Need Improvement!!! "+name+" ,you have passed with grade "+g+",Your marks is "+percentage);
		      break;   //break the flow and allow the control to come out of switch case
			
			 case 'C':
			      System.out.println("Work hard!!! "+name+" ,you have passed with grade "+g+",Your marks is "+percentage);
		      break; //break the flow and allow the control to come out of switch case
			
			 case 'D':
			      System.out.println("Work Very Hard!!! "+name+" ,you have passed with grade "+g+",Your marks is "+percentage);
		      break; //break the flow and allow the control to come out of switch case
			
			 case 'F':
			      System.out.println("Sorry!!! "+name+" ,you have failed with grade "+g+",Your marks is "+percentage);
		      break; //break the flow and allow the control to come out of switch case
			 default:
			   System.out.println("Invalid Input");//Runs if all other cases are not met.
			  
			} 
	   }//End of grade() method
	   
	   //start of CalcPercentage() method to calculate percentage
	   static void CalcPercentage(float os ,float java,float dbms,String name)//formal arguments.....Method is called in inpt() method
	   {
		    float percentage=(float)((os+java+dbms)/300)*100; //calculating percentage
		   
		   
		   if((percentage>=90))//checking percentage
		       grade('A',name,percentage);//calling function/method grade();
	      else if((percentage>70)&&(percentage<90))
			  grade('B',name,percentage);//calling function/method grade();
		  else if((percentage>50)&&(percentage<=70))
			  grade('C',name,percentage);//calling function/method grade();
		  else if((percentage>=40)&&(percentage<=50))
			  grade('D',name,percentage);//calling function/method grade();
		  else
			  grade('F',name,percentage);//calling function/method grade();
	   }

   //start of input() method
      static void input() //method to take input from user 
	   {
		   Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          
		  float operating_system,java,dbms;// declaring variable 
		  String name;
          
		  System.out.println("Enter your Name:");//user input------->@name
		  name=sc.nextLine();
		  
		  System.out.println("Enter your Operating System Marks");
		  operating_system=sc.nextFloat();//user input ----> marks @ os
		  
		  System.out.println("Enter your  Marks in java");
		  java=sc.nextFloat();//user input ----> marks @ java
		  
		  System.out.println("Enter your Marks of dbms");
		  dbms=sc.nextFloat();//user input ----> marks @ dbms
		  
		  CalcPercentage(operating_system,java,dbms,name);//calling CalcPercentage() methid to calculate grade
	   }
	//main started
	public static void main(String args[])
	{
		  
		  
		 input(); 
		
		   
	}
		
	// end of main
}
// end of class 
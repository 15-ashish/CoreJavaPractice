
/*
Program:Pass/Fail 
 Ashish Sahay
 19 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class ResultPassFail
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          float operating_system,java,dbms;// declaring variable 
          
		  System.out.println("Enter your Operating System Marks");
		  operating_system=sc.nextFloat();//user input ----> marks @ os
		  
		  System.out.println("Enter your  Marks in java");
		  java=sc.nextFloat();//user input ----> marks @ java
		  
		  System.out.println("Enter your Marks of dbms");
		  dbms=sc.nextFloat();//user input ----> marks @ dbms
		  
		  System.out.println("\n\n");
		 float percentage=(float)((operating_system+java+dbms)/300)*100;
		  if((percentage>=40))//checking percentage
		  {
			  System.out.println("Congratulations!!! You are pass with "+percentage+"%");//printing pass percent
		  }
		  else
		  {
			   System.out.println("sorry !!! You are fail");//printing fail
		  }//end of ifelse
		
	}	
		
	}//end of main

/*
Program: IfElse
 Ashish Sahay
 18 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class IfElseDemo
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          int num1,num2;
          System.out.println("Enter First integer number");//user input ----> number 1
		  num1=sc.nextInt();//method to take user input num1
		  System.out.println("Enter Second integer integer number");//user input ----> number 2
		  num2=sc.nextInt();//method to take user input num2
		  int c=num1+num2;
		  if((c>0)&&(c<100))//Applying Condition 
		  {  
	        System.out.println("Given number's sum , "+c +" lie within 1-100");//printing even number
		  }
		  else
		  {
			   System.out.println("Given number's sum ,  "+c +" is out of range 1-100");//printing odd number
		  }
		  
		  
	}	
		
	}//end of main
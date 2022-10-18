
/*
Program: Odd Even
 Ashish Sahay
 18 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class OddEven
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          int num1;
          System.out.println("Enter your number");//user input ----> number
		  num1=sc.nextInt();//method to take user input
		  if((num1%2==0))//checking odd/even
		  {
			  System.out.println("Given number "+num1 +" is even");//printing even number
		  }
		  else
		  {
			   System.out.println("Given number "+num1 +" is odd");//printing odd number
		  }
		
	}	
		
	}//end of main
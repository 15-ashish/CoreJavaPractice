/*
Program: OPERATORS
 Ashish Sahay
 18 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class OperatorsDemo
{
	public static void main(String args[])
	{
		 int a=12,b=23,c=90;
		 //int c=a+b;
		 System.out.println("a = "+a+"  b="+b+ "  c="+c);
		 System.out.println("\n\n\n\n");
		  
		  //Airthmatic Operators
		 System.out.println("Sum a+b = "+(a+b));
		 System.out.println("Difference a-b = "+(a-b));
		 System.out.println("Multiplication  a*b= "+(a*b));
		 System.out.println("Division a/b = "+(a/b));
		 System.out.println("Remainder(modulus) a%b= "+(a%b));
		 System.out.println("\n\n\n\n");
		 
		 // Relational operators and logical operators
		 
		 if((a>b)&&(a>c))
		 {
			 System.out.println("Greatest Number is "+a);
			 
		 }
		 else if((b>c))
		 {
			 System.out.println("Greater number is = "+b);
			 
		 }
		 else
		 {
			 System.out.println("Graeter number is "+c);
		 }
	 
            System.out.println("\n\n\n\n");	     
		 // Bit Wise operators
		  
		  System.out.println("Bit wise AND = "+(a&b));
		  System.out.println("Bit wise OR = "+(a|b));
		  System.out.println("Bit wise XOR = "+(a^b));
		  System.out.println("Bit wise NOT = "+(~a));
		 
		 
		/* System.out.println("Sum a= "+a)
		 
		a+=b;
		System.out.println("Sum a= "+a);//implicit
		System.out.println("Sum c = "+c);//explicit*/
		
	}	
		
	}//end of main
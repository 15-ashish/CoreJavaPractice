/*
Program: type casting
 Ashish Sahay
 18 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class TypeCastingDemo 
{
	public static void main(String args[])
	{
		double a,b;
		a=1.2;
		b=4.5;
		float c=(float)(a+b);
		a+=b;
		System.out.println("Sum a= "+a);//implicit
		System.out.println("Sum c = "+c);//explicit
		
	}	
		
	}//end of main
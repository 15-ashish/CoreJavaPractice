
/*
Program:Enhanced Swich case
 Ashish Sahay
 21 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class EnhancedSwitch //calculating  discount
{
	
	static void language(String name)
	{
		
		switch(name) //Switch case starts----->>>taking input value in int choice and switches the control to desired case
			{
			 case "c","c++","java",".net"->System.out.println("Programming Language");	 		 	
			 case "sql","oracle"->System.out.println("DBMS");
   			 case "php","javascript"->System.out.println("Web development");
			 default->System.out.println("Invalid Input"); 
			} 
		
	}//end of ShoppingBill() method
			
	static void input()//method starts
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner    
		  System.out.println(".............Switch case.........................");
		  String name;
		  System.out.println("enter choice");
		  name=sc.next().toLowerCase();
		  language(name);		  
		 	  
	}
	//end of input()
	
	public static void main(String args[])
	{
		  input();//calling method to take input
		  

		
	}//end of main
}
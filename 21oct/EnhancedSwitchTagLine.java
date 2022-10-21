
/*
Program:Enhanced Swich case tagline
 Ashish Sahay
 21 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class EnhancedSwitchTagLine //calculating  discount
{
	
	static void language(String name)
	{
		
		switch(name) //Switch case starts----->>>taking input value in int choice and switches the control to desired case
			{
			 case "MICROSOFT"->System.out.println("Your Potential. Our Passion");	 		 	
			 case "APPLE"->System.out.println("Think Different.");
   			 case "HCL"->System.out.println("employees first, customers second");
			 case "ADIDAS"->System.out.println("Impossible Is Nothing.");
			 case "WIPRO"->System.out.println("Spirit of Wipro");
			 default->System.out.println("Invalid Input"); 
			} 
		
	}//end of ShoppingBill() method
			
	static void input()//method starts
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner    
		  System.out.println(".............Switch case.........................");
		  String name;
		  System.out.println("enter the name of company whose tagline you want to print");
		  name=sc.next().toUpperCase();
		  language(name);		  
		 	  
	}
	//end of input()
	
	public static void main(String args[])
	{
		  input();//calling method to take input
		  

		
	}//end of main
}
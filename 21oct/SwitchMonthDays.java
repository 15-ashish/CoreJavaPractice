
/*
Program:Enhanced Swich case tagline
 Ashish Sahay
 21 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class SwitchMonthDays //
{
	
	static void month(String month)
	{
		 int year;
		 Scanner sc= new Scanner(System.in);
		switch(month) //Switch case starts----->>>taking input value in int choice and switches the control to desired case
			{
			 case "january","jan":	 		 	
			 case "march","mar":
   			 case "may":
			 case "july","jul":
			 case "august","aug":
			 case "october","oct":
			 case  "december","dec" : System.out.println("Nymber of days in "+month+ " are 31 days");
			                     break;
 			 case "april","apr":
			 case "june","jun":
			 case "september","sept","sep":
			 case "november","nov": System.out.println("Number of days in "+month+ "are 30 days");
			                    break;
							
			 case "february","feb":
                           	System.out.println("Enter year");
							year=sc.nextInt();
							if((year%4==0)&&((year%100!=0)||(year%400==0)))
								System.out.println("Leap year,Number of days in "+month+" are 29 days");
							else
								System.out.println("No Leap year,Number of days in "+month+" are 28 days");
							break;
            default: System.out.println("Invalid Input");
							
			} 
		
	}//end of month() method
			
	static void input()//method starts
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner    
		  System.out.println(".............Switch case.........................");
		  String name;
		  System.out.println("enter the name of month.....");
		  name=sc.next().toLowerCase();
		  month(name);		  
		 	  
	}
	//end of input()
	
	public static void main(String args[])
	{
		  input();//calling method to take input
		  

		
	}//end of main
}
/*
Program: Nested if else demo
Ashish Sahay
19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedIfelse
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner obj = new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		char gender;
		String name;
		
		//taking input
		System.out.println("Enter your Name:");
		name=obj.nextLine();
		
		System.out.println("Enter your age:");
		age= obj.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			//taking input
			System.out.println("Enter your gender(m/f):");
		    gender= obj.next().charAt(0);//entering gender
			
			System.out.println("Enter your weight:");
		    weight= obj.nextFloat();
			
			//checking weight criteria
			if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
			   System.out.println("You can donate the blood...."+name);
   
		     else
				  System.out.println("You cannot donate the blood...."+name+" Better luck next time");
			   
		}
		else
			System.out.println("You are too young to donate blood... Please wait!for sometime "+name);
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 
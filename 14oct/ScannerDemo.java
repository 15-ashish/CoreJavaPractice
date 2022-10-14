/* To understand the usage of Scanner class
 Name: Ashish Sahay
 Date 14/10/22

*/
//importing scanner class
import java.util.Scanner;

class ScannerDemo
{
	//main method starts
	public static void main(String args[])
	{        
	          // creating objects of scannner class
               Scanner sc=new Scanner(System.in);			  
			  
			   System.out.println("Enter your Roll");//roll
			   int roll=sc.nextInt();
			   
			   System.out.println("Enter your Name");//Name
			   String name=sc.next();
			  
			  System.out.println("Enter your marks");//Marks
			   float marks=sc.nextFloat();
			   
			   System.out.println("Enter pass/fail(true/false))");//pass/fail
			   boolean status=sc.nextBoolean();
			 
			 System.out.println("Enter your gender");//Gender
			char gender=sc.next().charAt(0);
		
            System.out.flush();
			System.out.println("Name :"+name);
			System.out.println("Roll :" +roll);
			System.out.println("marks :"+marks);
			System.out.println("Gender :"+gender);
			System.out.println("Result :"+status);
			
			   
	
	
	           
	}//end of main
}
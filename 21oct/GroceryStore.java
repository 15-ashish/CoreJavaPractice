
/*
Program:Vegetable Store
 Ashish Sahay
 21 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class GroceryStore //calculating  discount
{
	static void discount(float qty,float rate)
	{
		float discountedamount,finalamount;
		 float totalbill=(float)(qty*rate);
		  if((totalbill>=2000))//checking for discount
		  {
			  System.out.println("Your Item is eligible to get discount of 20% ");//
			  discountedamount=(totalbill/4);
			  finalamount=(float)(totalbill-discountedamount);
			  System.out.println("Your discounted amount  "+discountedamount);
			  System.out.println("Your final amount to pay is "+finalamount);
			  
		  }
		  else if((totalbill>1000)&&(totalbill<2000))
		  {
			   
			   System.out.println("Your Item  is eligible to get discount of 10% ");//
			  discountedamount=(totalbill/10);
			  finalamount=(float)(totalbill-discountedamount);
			  System.out.println("Your discounted amount  "+discountedamount);
			  System.out.println("Your final amount to pay is "+finalamount);

		  }
		      else if ((totalbill>500)&&(totalbill<1000))
			  {
				  System.out.println("Your Item , is eligible to get discount of 5% ");//
			  discountedamount=(totalbill/20);
			  finalamount=(float)(totalbill-discountedamount);
			  System.out.println("Your discounted amount  "+discountedamount);
			  System.out.println("Your final amount to pay is "+finalamount);
			  
			  }
			  else
			  {
				  System.out.println("Your are not elible to get discount");
				  System.out.println("Your final amount to pay is "+totalbill);
			  }
				  //end of ifelse
	}
	
	
	
	
	
	static void calc(int choice,float qty)
	{
		float rate;
		switch(choice) //Switch case starts----->>>taking input value in int choice and switches the control to desired case
			{
			 case 1: //potato
			       rate=200;
				 		discount(qty,rate);	 		 
				 
		      break;  //break the flow and allow the control to come out of switch case
			
			 case 2://Brinjal
                   
				 rate=150;
				 discount(qty,rate);	
				   
		      break;   //break the flow and allow the control to come out of switch case
			
			 case 3://Cabbage
			     rate=250;
				 discount(qty,rate);	
		      break; //break the flow and allow the control to come out of switch case
			
			 case 4://Onion
                  rate=350;
				  discount(qty,rate);	
				   
		      break; 
			  case 5:// Tomato
                   rate=180;
				   discount(qty,rate);	
				   
				   
		      break; 
			 default:
			   System.out.println("Invalid Input");//Runs if all other cases are not met.
			  
			} 
		
	}//end of ShoppingBill() method
	
	
	
	
	
	
	static void input()//method starts
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          
		  
		  // declaring variable 
          float qty;
		  int choice;
		  System.out.println(".............Grocery Store..........................");
		  System.out.println("1.Potato @ 200/kg");
		  System.out.println("2.Brinjal @150/kg");
		  System.out.println("3.Cabbage @250/kg");
		  System.out.println("4.Onion @350/kg");
		  System.out.println("5.Tomato @180/kg");
		  
		  System.out.println("Enter your choice (1,2,3,4,5)");
		  choice=sc.nextInt();//user input-->> choice
		  
		  System.out.println("Enter the quantity for your choice........");
		  qty=sc.nextFloat();//user input ----> quantity
		  calc(choice,qty);//calling method to calculate discount
	}
	//end of input()
	
	public static void main(String args[])
	{
		  input();//calling method to take input
		  

		
	}//end of main
}
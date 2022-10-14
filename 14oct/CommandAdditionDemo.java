/* To take input from command line and perform addition
 Name: Ashish Sahay
 Date 14/10/22

*/
class CommandAdditionDemo
{
	//main method starts
	public static void main(String args[])
	{
      int nos1=Integer.parseInt(args[0]);// converting strinf type into int
	  float nos2=Float.parseFloat(args[1]);//converting string type into float
	  float sum=nos1+nos2;//addtion of number input from command line arguments
	  System.out.println("Sum of given number is "+sum); //showning ressult
	  	       
	}
}
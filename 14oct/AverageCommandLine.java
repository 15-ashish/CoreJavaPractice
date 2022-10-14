/* To take input from command line and perform average operation of three number
 Name: Ashish Sahay
 Date 14/10/22

*/
class AverageCommandLine
{
	//main method starts
	public static void main(String args[])
	{
      int nos1=Integer.parseInt(args[0]);// converting strinf type into int
	  float nos2=Float.parseFloat(args[1]);//converting string type into float
	  float nos3=Float.parseFloat(args[2]);//converting string type into float
	  float sum=nos1+nos2+nos3;//addtion of number input from command line arguments
	  float average=sum/3; //average operation
	  System.out.println("Average of given number is "+average); //showning ressult
	  	       
	}
}
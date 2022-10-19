
/*
Program:Pass/Fail trough command line
 Ashish Sahay
 19 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class ResultPassFailCmdLine
{
	public static void main(String args[])
	{
		float os=Float.parseFloat(args[0]);//converting string type into float
		float java=Float.parseFloat(args[1]);//converting string type into float
		float dbms=Float.parseFloat(args[2]);//converting string type into float
		  
		  System.out.println("\n\n");
		  
		 float percentage=(float)((os+java+dbms)/300)*100;
		 //float percentage=(float)(Float.parseFloat((args[0]+args[1]+args[2]))/300)*100;
		  if((percentage>=40))//checking percentage
		  {
			  System.out.println("Congratulations!!! You are pass with "+percentage+"%");//printing even number
		  }
		  else
		  {
			   System.out.println("sorry !!! You are fail");//printing odd number
		  }
		
	}	
		
	}//end of main
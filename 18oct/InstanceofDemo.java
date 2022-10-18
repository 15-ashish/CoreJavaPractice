/*
Program: To understand instanceOf operator
Ashish Sahay
18/10/2022 
Class name is diffrent from the name given to program. No Compilation error.while executing call it by class name ,i.e, java car and 
not java InstanceofDemo(THIS STSTEMENT WILL GIVE ERROR {CANNOT LOAD CLASS FILE} 
*/


//declaring a class
class Car
{
	public static void main(String args[])
	{
          Car obj1=new Car();
		  //Car obj2;
		  Car obj3=null;
		  Car obj4=null;
		  obj4=new Car();
         System.out.println(obj1 instanceof Car);	//print boolean value true  
		//System.out.println(obj2 instanceof Car); Error->> obj2 is not initialozed
		System.out.println(obj3 instanceof Car);//print boolean value false
		System.out.println(obj4 instanceof Car);
	}
		
	
	// end of main
}
// end of class 
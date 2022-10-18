
/*
Program: To print System properties
 Ashish Sahay
 18 oct 2022  
*/

//declaring a class
class VersionDemo
{
	public static void main(String args[])
	{
		System.out.println("The java version is:"+System.getProperty("java.version"));
		System.out.println("The installation directory is:"+System.getProperty("java.home"));
		System.out.println("The Java runtime environment vendor is:"+System.getProperty("java.vendor"));
		System.out.println("The Java Virtual memory name  is:"+System.getProperty("java.vm.name"));
		System.out.println("The java class path is:"+System.getProperty("java.class.path"));
		System.out.println("The java library path is:"+System.getProperty("java.library.path"));
		System.out.println("The java JIT compiler is:"+System.getProperty("java.compiler"));
		System.out.println("The java user directory is:"+System.getProperty("user.dir"));
		System.out.println("The java user home is:"+System.getProperty("user.home"));
		
	}//end of main
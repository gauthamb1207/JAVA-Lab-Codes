JAVA OOP

  public class Main{
    int x=5;
    public static void main(String[] args)
    {
        Main myObj=new Main();
        System.out.println(myObj.x);
    }
}



public class Main{
    int x=5;
    public static void main(String[] args)
    {
        Main myObj1=new Main();
        Main myObj2=new Main();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}




//Using class Main for a different file and creating object for it in a new file

//Main.java
public class Main
{
    int x=5;
}

//Second.java
public class Second
{
    public static void main(String[] args)
    {
        Main myObj=new Main();
        System.out.println(myObj.x);
    }
    
}




public class Main
{
    int x;
	public static void main(String[] args)
	{
		Main myObj=new Main();
		myObj.x=40;
		System.out.println(myObj.x);
	}
}



//Overriding existing variables
public class Main
{
    int x=10;
	public static void main(String[] args)
	{
		Main myObj=new Main();
		myObj.x=25; //x is now 25
		System.out.println(myObj.x);
	}
}



public class Main
{
    final int x=10;
	public static void main(String[] args)
	{
		Main myObj=new Main();
		myObj.x=25; //throws an error
		System.out.println(myObj.x);
	}
}




public class Main
{
    int x=10;
	public static void main(String[] args)
	{
		Main myObj1=new Main();
		Main myObj2=new Main();
		myObj2.x=25;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}
}




public class Main
{
    String fname="John";
    String lname="Doe";
	int age=24;
	public static void main(String[] args)
	{
		Main myObj=new Main();
		System.out.println("Name: "+myObj.fname+" "+myObj.lname);
		System.out.println("Age: "+myObj.age);
	}
}




public class Main
{
    static void myMethod()
	{
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		myMethod();
	}
}




public class Main
{
    static void mStaticyMethod()
	{
		System.out.println("Static methods can be called without creating objects");
	}

	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	public static void main(String[] args) {
		mStaticyMethod();
		Main myObj = new Main();
		myObj.myPublicMethod();
	}
}




public class Main
{
    public void fullThrottle()
	{
		System.out.println("The car is going as fast as it can!");
	}
	
	public void speed(int maxSpeed)
	{
		System.out.println("Max speed is: "+maxSpeed);
	}
	public static void main(String[] args) {
		Main myCar = new Main();
		myCar.fullThrottle();
		myCar.speed(200);
	}
}




public class Main
{
    int x;

	//constructor
	public Main()
	{
		x=5;
	}
	public static void main(String[] args)
	{
		Main myObj = new Main();
		System.out.println(myObj.x);
	}
}




public class Main
{
    int x;

	//constructor
	public Main(int y)
	{
		x=y;
	}
	public static void main(String[] args)
	{
		Main myObj = new Main(5);
		System.out.println(myObj.x);
	}
}

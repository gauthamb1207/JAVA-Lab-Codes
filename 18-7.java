/* 18-07-2024 */
public class Main
{
public static void main(String[] args)
{
	int myInt=9;
	double myDouble=myInt;
	System.out.println(myInt);
	System.out.println(myDouble);
	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(sum3);
	/* String a="hello";
	int sum4=a+sum3;
	System.out.println(sum4); */ /* throws error error: incompatible types: String cannot be converted to int
        				int sum4=a+sum3; */
	int x,y;
	x=20;
	y=(x==1)?61:90;
	System.out.println("Value of y is: "+ y);
	y=(x==20)?61:90;
	System.out.println("Value of y is: "+y);
	String txt="abcdefghijklmnopqrstuvwxyz";
	System.out.println("The length og the txt string is: "+txt.length());
	String txt="Hello World";
	System.out.println(txt.toUpperCase());
	System.out.println(txt.toLowerCase());
	String text="Please locate where 'locate' occurs!";
	System.out.println(text.indexOf("locate"));
}
}

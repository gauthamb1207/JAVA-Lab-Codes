import java.util.StringTokenizer;
class Simple{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("my name is khan"," ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}



import java.util.StringTokenizer;
class Simple{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("my,name,is,khan");
        System.out.println("Next Token is: "+st.nextToken(","));
    }
}



import java.util.StringTokenizer;
class Srr{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Demonstrating methods from String Tokenizer class in Java Lab class held on Thursday at VIT Chennai during the afternoon"," ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}




import java.util.StringTokenizer;
class Srr{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Hello everyone I am  Java developer"," ");
        while (st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }
    }
}



import java.util.StringTokenizer;
class Srr{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Hello everyone have a nice day","");
        while (st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        }
    }
}



import java.util.StringTokenizer;
class Srr{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("Hello everyone have a nice day"," ");
        System.out.println("Total number of Tokens: "+st.countTokens());
    }
}



public class Array
{
    public static void main(String[] args)
    {
        int[] arr;
        arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element at index: "+i+": "+arr[i]);
        }
    }
}



class Student{ //Paremterized Constructor
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }
}

public class Array
{
    public static void main(String[] args)
    {
        Student[] arr;
        arr=new Student[5];
        arr[0]= new Student(1,"aman");
        arr[1]= new Student(2,"george");
        arr[2]= new Student(3,"pman");
        arr[3]=new Student(4,"mad");
        arr[4]=new Student(5,"yeda");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Index: "+i+" Roll no: "+arr[i].roll_no+" Name: "+arr[i].name);
        }
    }
}

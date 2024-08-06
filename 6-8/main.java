class Student // parametirzed constructor
{
    public String name;
    Student(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return name;
    }

}

public class Ex3
{
    public static void main(String[] args)
    {
        Student[] myStudents = new Student[]{new Student("Dharma"), new Student("sanvi"), new Student("Rupa"), new Student("Ajay")};
        for(Student m:myStudents)
        {
            System.out.println(m);
        }
    }
}




public class Ex3
{
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        System.out.println("trying to access element outside the size of array");
        System.out.println(arr[5]); 
    }
}




public class Ex3
{
    public static void main(String[] args)
    {
        int [][] arr = new int[10][20];
        arr[0][0]=1;
        System.out.println("arr[0][0] "+arr[0][0]);
    }
}




public class Ex3
{
    public static void main(String[] args)
    {
        int [][][] arr = new int[10][20][30];
        arr[0][0][0]=1;
        System.out.println("arr[0][0][0]= "+arr[0][0][0]);
    }
}





public class Ex3
{
    public static void main(String[] args)
    {
        int arr[]={3,1,2,5,4};
        sum(arr);
    }
    public static void sum(int[] arr)
    {
        int summ=0;
        int i=0;
        for(i;i<arr.length;i++)
        int summ=0;
        {
            summ+=arr[i];
        }
        System.out.println("sum of array values: "+summ);
    }
} /*error: Syntax error on token "i", ++ expected after this token
Syntax error, insert ". class" to complete Expression
Syntax error, insert "AssignmentOperator Expression" to complete Assignment
Syntax error, insert ";" to complete Statement
The left-hand side of an assignment must be a variable

at Ex3.sum(Ex3.java:12)
at Ex3.main(Ex3.java:6) */




public class Ex3
{
    public static void main(String[] args)
    {
        int arr[]=m1();
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }
    public static int[] m1()
    {
        return new int[] {1,2,3};
    }
} 



public class Ex3
{
    public static void main(String args[])
    {
        int intArray[]= new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
        String[] strArray = new String[3]; //array of strings

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    }
} 




public class Ex3
{
    public static void main(String args[])
    {
        int intArray[]= {1,2,3};
        int cloneArray[] = intArray.clone();

        //will print flase as deep copy is created
        //for 1d array
        System.out.println(intArray==cloneArray);
        for(int i=0;i<cloneArray.length;i++)
        {
            System.out.println(cloneArray[i]+" ");
        }
    }
} 




public class Ex3
{
    public static void main(String args[])
    {
        int intArray[][]= {{1,2,3},{4,5}};
        int cloneArray[][] = intArray.clone();
        
        System.out.println(intArray==cloneArray);
        System.out.println(intArray[0]==cloneArray[0]);
        System.out.println(intArray[1]==cloneArray[1]);
    }
} 

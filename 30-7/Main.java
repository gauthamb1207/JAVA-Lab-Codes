class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println(sb);
    }
}


class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1,"Java");
        System.out.println(sb);
    }
}


class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.replace(1,3,"Java");
        System.out.println(sb);
    }
}


class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello ");    
        sb.delete(1,3);
        System.out.println(sb);
    }
}


class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.reverse();
        System.out.println(sb);
    }
}



class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer(); //default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); //still 16 as hello fits in
        sb.append("java is my favourute kanguage");// //capacity exceeded so formula is applied
        System.out.println(sb.capacity()); //now (16*2)+2 = 34  i.e(OldCapacity*2)+2
    }
}



class Main
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer(); //default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); //still 16 as hello fits in
        sb.append("java is my favourute kanguage");// //capacity exceeded so formula is applied
        System.out.println(sb.capacity()); //now (16*2)+2 = 34  i.e(OldCapacity*2)+2
        sb.ensureCapacity(10); //now no change
        System.out.println(sb.capacity()); //now 34
        sb.ensureCapacity(50); //now (34*2)+2
        System.out.println(sb.capacity()); //now 70
    }
}



//ALL FUNCTIONS ABOVE DONE IN STRING BUILDER FORM
class Main
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(1,"java");
        System.out.println(sb);
        sb.replace(1,3,"java");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity()); //still 16 as hello fits in
        sb.append("java is my favourute kanguage");// //capacity exceeded so formula is applied
        System.out.println(sb.capacity()); //now (16*2)+2 = 34  i.e(OldCapacity*2)+2
        sb.ensureCapacity(10); //now no change
        System.out.println(sb.capacity()); //now 34
        sb.ensureCapacity(50); //now (34*2)+2
        System.out.println(sb.capacity()); //now 70


    }
}

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println(("Enter number of rows: "));
        row=sc.nextInt();
        System.out.println("Enter number of columns: ");
        col=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || i==row-1 || j==0 || j==col-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");

                }
                
                
            }
            System.out.println();
        }
    }
}

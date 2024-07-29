import java.util.*;
import java.math.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter integer 1: ");
        n1=sc.nextInt();
        System.out.println("Enter integer 2: ");
        n2=sc.nextInt();
        System.out.println();
        for(int j=n1+1;j<=n2;++j)
        {
            int y=j;
            int n=0;
            while(y!=0)
            {
                y/=10;
                ++n;
            }

            int power=0;
            y=j;
            while(y!=0)
            {
                int d=y % 10;
                power+=Math.pow(d,n);
                y/=10;
            }

            if(power==j)
            {
                System.out.println(j+" ");
            }
        }
    }
}

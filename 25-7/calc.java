import java.util.*;

class Main{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Calculator.");
        int flag=0;
        while(flag==0)
        {
            System.out.println("Press 1 to Add.");
            System.out.println("Press 2 to Subtract");            
            System.out.println("Press 3 to Multiply");
            System.out.println("Press 4 to Divide");
            System.out.println("Press 5 for Modulus");
            int choice;
            Scanner sc = new Scanner(System.in);
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                    int num1;
                    int num2;
                    System.out.println("Enter Number 1: ");
                    num1=sc.nextInt();
                    System.out.println("Enter Number 2: ");
                    num2=sc.nextInt();
                    int sum;
                    sum=num1+num2;
                    System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
                    break;
                    
                case 2:
                    int num3;
                    int num4;
                    System.out.println("Enter Number 1: ");
                    num3=sc.nextInt();
                    System.out.println("Enter Number 2: ");
                    num4=sc.nextInt();
                    int diff;
                    diff=num3-num4;
                    System.out.println("Difference of "+num3+" and "+num4+" is "+diff);
                    break;
            
               case 3:
                    int num5;
                    int num6;
                    System.out.println("Enter Number 1: ");
                    num5=sc.nextInt();
                    System.out.println("Enter Number 2: ");
                    num6=sc.nextInt();
                    int mul;
                    mul=num5*num6;
                    System.out.println("Product of "+num5+" and "+num6+" is "+mul);
                    
                    break;

                case 4:
                    int num7;
                    int num8;
                    System.out.println("Enter Number 1: ");
                    num7=sc.nextInt();
                    System.out.println("Enter Number 2: ");
                    num8=sc.nextInt();
                    int div;
                    div=num7/num8;
                    System.out.println("Division of "+num7+" and "+num8+" is "+div);
                    
                    break;
            }
                System.out.println("Do you want to coninue? Yes / No");
                String yn;
                yn=sc.nextLine();
                if(yn=="yes")
                {
                    continue;
                }
                else if(yn=="no")
                {
                    System.out.println("Thank you");
                    break;
                }
                
            
        }

                
        
        
    }
}

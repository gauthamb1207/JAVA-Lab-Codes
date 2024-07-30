import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("number of elements: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }
        }
        
        System.out.println(arr[n-3]);
        
        
    }

}

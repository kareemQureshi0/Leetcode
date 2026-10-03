import java.util.*;

public class RichestCustomerWealth
{
    public static void main(String args[])
    {
        int[][] arr = new int[3][3];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the values for the array: ");
        for(int rows = 0; rows<arr.length; rows++)
        {
            for(int column = 0; column <arr[rows].length;column++)
            {
                arr[rows][column]=in.nextInt();
            }
        }

        System.out.println("Your Array: ");

          for(int rows = 0; rows<arr.length; rows++)
        {
            for(int column = 0; column <arr[rows].length;column++)
            {
                System.out.print(arr[rows][column]+" ");
            } 
            System.out.println("");
        }




       int result = maxWealth(arr);
       System.out.println("A richest customer has wealth of " + result + "$")
        
    }  
    
    // Function that returns Max wealth
    static int maxWealth(int[][] arr)
    {
        int max=0;
        return max;
    }
}

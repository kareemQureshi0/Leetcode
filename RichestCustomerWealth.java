// 1672: You are given an m x n integer grid accounts where accounts[i][j] is the amount of
//  money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts.
//  The richest customer is the customer that has the maximum wealth.

// You can pass any test case to it


// I made it in 1ms 

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
       System.out.println("A richest customer has wealth of " + result + "$");
        
    }

    // Function that returns Max wealth
    static int maxWealth(int[][] arr)
    {
        
        int[] newArr = new int[arr.length];
        int sum = 0;
        int max=0;


        for(int rows = 0; rows<arr.length; rows++)
        {
            for(int column = 0; column <arr[rows].length;column++)
            {
                
                sum = sum+arr[rows][column];
                newArr[rows]=sum;
                
                if(column == (arr[rows].length)-1)
                {
                    sum = 0;
                }    
                    
            } 
        }

        for(int i=0;i<newArr.length;i++)
        {
            if(newArr[i]>max)
            {
                max = newArr[i];
            }
        }

        return max;
    }
}
// 1920: Given a zero-based permutation nums (0-indexed),
//  build an array ans of the same length where ans[i] = nums[nums[i]] 
// for each 0 <= i < nums.length and return it.

// A zero-based permutation nums is an array of distinct integers 
// from 0 to nums.length - 1 (inclusive).


// I submit it in runtime of 1ms 

import java.util.Arrays;

public class BuildArrayFromPermutation
{
    public static void main(String[] args) 
    {
        int[] arr = {1,5,8,6,3,9,7,5,2,6};

        int[] result = buildArrayFromPermutation(arr);
        System.out.println(Arrays.toString(result));
    }   
    
    static int[] buildArrayFromPermutation(int[] arr)
    {
        int[] ans = new int[arr.length];

        for(int i = 0;i<arr.length;i++)
        {

            ans[i] = arr[arr[i]];
        
        }
        return ans;
    }   
}

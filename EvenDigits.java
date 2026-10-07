// 1295 = Given an array nums of integers, return how many of them contain an even number
//  of digits.

// You can pass any test case to it 

public class EvenDigits 
{
    public static void main(String args[])
    {
        int[] nums = {12,345,2,6,7896};

        System.out.println(eventDigits(nums));
    }   


    static int eventDigits(int[] arr)
    {
        int count = 0;
        int even = 0;

        for(int num : arr)
        {
            while(num > 0)
            {
                num=num/10;
                count++;

            }

            if(count%2==0)
            {
                even++;
            }
            else
            {
                count = 0;
            }
        }
        return even;
    }
}




// It was submitted in runtime of 1ms
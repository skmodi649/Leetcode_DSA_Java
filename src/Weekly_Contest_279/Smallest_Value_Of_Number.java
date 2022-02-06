/*
In the given problem, one has to find the minimum number by rearranging the digits of the given number
 */



package Weekly_Contest_279;

public class Smallest_Value_Of_Number {
    public long smallestNumber(long num) {
        // Step 1 : finding the frequency of each digits of the number
        int[] freq = new int[10];
        // Step 2 : Now check if the number is positive or negative
        boolean is_pos = (num > 0)?true:false;
        num = Math.abs(num);
        // count frequency of each digit in the number
        while (num > 0)
        {
            int d = (int)(num % 10); // extract last digit
            freq[d]++; // increment counting
            num = num / 10; //remove last digit
        }

        long result = 0;

        // If it is positive Number then it should be smallest
        if(is_pos)
        {
            // Set the LEFTMOST digit to minimum expect 0
            for (int i = 1 ; i <= 9 ; i++)
            {
                if (freq[i] != 0)
                {
                    result = i;
                    freq[i]--;
                    break;
                }
            }

            // arrange all remaining digits
            // in ascending order
            for (int i = 0 ; i <= 9 ; i++)
                while (freq[i]-- != 0)
                    result = result * 10 + i;
        }
        else  // If negative then number should be Largest
        {
            // Set the Rightmost digit to maximum
            for (int i = 9 ; i >= 1 ; i--)
            {
                if (freq[i] !=0)
                {
                    result = i;
                    freq[i]--;
                    break;
                }
            }

            // arrange all remaining digits
            // in descending order
            for (int i = 9 ; i >=0 ; i--)
                while (freq[i]-- != 0)
                    result = result * 10 + i;

            // Negative number should be returned here
            result = -result;
        }
        return result;
    }
}

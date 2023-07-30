// Link: https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/
// Status: Own
// Explanation: Simply add the original number and reverse in the set, then return the size of the set
package Mathematics;

import java.util.HashSet;
import java.util.Set;

public class leet_2442 {
    public int reverse(int num){
        int reverse = 0;
        while(num > 0){
            int d = num % 10;
            reverse = reverse * 10 + d;
            num = num / 10;
        }
        return reverse;
    }
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            int num = nums[i];
            int rev = reverse(num);
            set.add(num);
            set.add(rev);
        }

        return set.size();
    }
    public static void main(String[] args){

    }
}

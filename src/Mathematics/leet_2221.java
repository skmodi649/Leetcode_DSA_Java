// Link: https://leetcode.com/problems/find-triangular-sum-of-an-array/description/
// Status: Mixed Own
// Explanation: Using Recursion
package Mathematics;

import java.util.Scanner;

public class leet_2221 {
    public static int solveRec(int[] nums){
        int n = nums.length;
        if(n == 1){
            return nums[0] % 10;
        }
        int[] temp = new int[n-1];
        int j = 0;
        for(int i = 0; i < n-1; i++){
            temp[j++] = (nums[i] + nums[i+1]) % 10;
        }
        return solveRec(temp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int ans = solveRec(nums);
        System.out.println(ans);
    }
}

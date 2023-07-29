// Problem Link: https://leetcode.com/problems/minimum-operations-to-make-array-equal/description/
// Status: Own Way
/* Explanation: 1. Find target value using target = sum(arr[n]) / n  ======> target = n
                2. Now traverse the array, value at given index 'i' will be 2*i+1
                3. minOps += (target-val) */

package Mathematics;

import java.util.Scanner;

public class leet_1551 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int target = n;

        System.out.println(target);
        int minOps = 0;

        for(int i = 0; i < n/2; i++){
            int val = 2*i + 1;
            int x = target - val;
            minOps += x;
        }

        System.out.println(minOps);
    }
}

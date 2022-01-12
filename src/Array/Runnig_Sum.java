package Array;

import java.util.Scanner;

public class Runnig_Sum {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans = runningSum(arr);
        System.out.println("Resultant array : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

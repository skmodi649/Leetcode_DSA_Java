/** Program Description :
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */



package Array;

import java.util.Scanner;

public class Shuffle_the_Array {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j = 0;
        for(int i = 0 ; i < 2*n && j < n ; i+=2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the values in the array : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        int[] ans = new int[2*n];
        ans = shuffle(arr , k);
        System.out.println("The resultant array  : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

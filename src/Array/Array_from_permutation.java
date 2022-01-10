/*
The solution presented is a optimal approach that uses O(1) space and O(n) time
There is another approach, brute force, in which we make use another array or arraylist
 */

package Array;
import java.util.Scanner;

public class Array_from_permutation {
    public static void buildArray(int[] nums) {
        int l = nums.length;
        for(int i=0;i<l;i++)
        {
            nums[i] = l*(nums[nums[i]]%l)+nums[i];
        }

        for(int i=0;i<l;i++)
        {
            nums[i] = nums[i]/l;
        }
    }
    public static void main(String[] arasdf)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();}
        buildArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
}

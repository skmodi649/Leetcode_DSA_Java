package Array;

import java.util.Scanner;

public class First_Last_in_Sorted_Array {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int n = nums.length;

        int first = 0 , last = n - 1;
        int mid = first + ((last  - first) / 2);
        while(first <= last){

            if(nums[mid] < target){
                last = mid - 1;
            }
            else if(nums[mid] > target){
                first = mid + 1;
            }
            else{
                break;
            }
            mid = first + ((last - first) / 2);
        }
        if (mid == -1) {
            arr[0] = -1;
            arr[1] = -1;
        } else {
            arr[0] = mid - 1;
            if(nums[mid - 1] == target)
                arr[1] = index;
            else
                arr[1] = -1;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[2];
        System.out.println("Enter the targe value : ");
        int target = sc.nextInt();
        ans = searchRange(arr , target);
        System.out.println("*********** Result *************");
        System.out.println(ans[0] + "," + ans[1]);
    }
}

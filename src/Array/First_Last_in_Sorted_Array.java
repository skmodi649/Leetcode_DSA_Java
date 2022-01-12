package Array;

import java.util.Scanner;

public class First_Last_in_Sorted_Array {
    public static int[] searchRange(int[] numbers, int target) {
        int[] arr = new int[2];
        int n = numbers.length;

        int low = 0, high = n - 1;
        // get the start index of target number
        int startIndex = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (numbers[mid] > target) {
                high = mid - 1;
            } else if (numbers[mid] == target) {
                startIndex = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        // get the end index of target number
        int endIndex = -1;
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (numbers[mid] > target) {
                high = mid - 1;
            } else if (numbers[mid] == target) {
                endIndex = mid;
                low = mid + 1;
            } else
                low = mid + 1;
        }

        arr[0] = startIndex;
        arr[1] = endIndex;


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

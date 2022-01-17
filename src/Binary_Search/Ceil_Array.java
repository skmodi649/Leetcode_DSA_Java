/*
The following program intends to find the ceiling of a target value from a given array using Binary Search technique
 */
/*
Ceiling is the smallest number in the array that is more than or equal to the target element of the array
Steps involved to find it are :
Step 1: First find elements that are greater than the target element
Step 2: Then simply return the smallest among those numbers
 */


package Binary_Search;

import java.util.Scanner;

public class Ceil_Array {
    public static int binary(int arr[] , int target){
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end - start) / 2);
            if(arr[mid] == target) return arr[mid];
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements in ascending order in the array :");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value whose ceiling is to be found :");
        int target = sc.nextInt();
        int ceiling = binary(arr , target);
        System.out.println("The ceiling value : " + ceiling);
    }
}

package Array;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0 ; i < n ; i++){
            int val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println("******** Array Elements ********");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

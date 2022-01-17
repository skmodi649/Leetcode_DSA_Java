package Recursion;

import java.util.Scanner;

public class Reverse_String {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println("Enter the character in the array :");
        char[] arr = new char[n];
        for(int i = 0 ; i < n ; i++){
            char ch = sc.next().charAt(0);
            arr[i] = ch;
        }
        reverseString(arr);
    }
}

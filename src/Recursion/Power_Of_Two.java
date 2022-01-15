package Recursion;

import java.util.Scanner;

public class Power_Of_Two {
    public static boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        else if(n == 1){
            return true;
        }
        else if(n % 2 != 0){
            return false;
        }
        else{
            return isPowerOfTwo(n / 2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean result = isPowerOfTwo(n);
        if(result)
            System.out.println(n + " is a power of 2");
        else
            System.out.println(n + " is not a power of 2");
    }
}

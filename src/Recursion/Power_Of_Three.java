package Recursion;

import java.util.Scanner;

public class Power_Of_Three {
    public static boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        else if(n == 1){
            return true;
        }
        else if(n % 3 != 0){
            return false;
        }
        else{
            return isPowerOfThree(n / 3);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean result = isPowerOfThree(n);
        if(result)
            System.out.println(n + " is a power of 3");
        else
            System.out.println(n + " is not a power of 3");
    }
}

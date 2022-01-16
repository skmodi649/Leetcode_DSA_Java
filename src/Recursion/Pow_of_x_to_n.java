package Recursion;

import java.util.Scanner;

public class Pow_of_x_to_n {
    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        else if(n > 0){
            return (x * myPow(x , n - 1));
        }
        else{
            return ((1 / myPow(x , -n)));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double x = sc.nextDouble();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();
        System.out.println(myPow(x , n));
    }
}

package Recursion;

import java.util.Scanner;

public class Number_Of_Steps_to_reduce_to_zero {
    public static int numberOfSteps(int num) {
        if(num == 0)
            return 0;
        else if(num % 2 == 0)
            return 1 + numberOfSteps(num / 2);
        else
            return 1 + numberOfSteps(num - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int steps = numberOfSteps(n);
        System.out.println("Number of steps : " + steps);
    }
}

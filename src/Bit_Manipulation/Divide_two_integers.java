/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
[−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient
is strictly less than -231, then return -231.

Difficulty : Medium
 */

package Bit_Manipulation;

import java.util.Scanner;

public class Divide_two_integers {
    public static int divide(int a, int b) {
        long dividend = a;
        long divisor = b;
        long sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

// remove sign of operands
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

// Initialize the quotient
        long quotient = 0, temp = 0;

// test down from the highest
// bit and accumulate the
// tentative value for
// valid bit
// 1<<31 behaves incorrectly and gives Integer
// Min Value which should not be the case, instead
        // 1L<<31 works correctly.
        for (int i = 31; i >= 0; --i)
        {

            if (temp + (divisor << i) <= dividend)
            {
                temp += divisor << i;
                quotient |= 1L << i;
            }
        }

//if the sign value computed earlier is -1 then negate the value of quotient
        if(sign==-1){
            quotient=-quotient;}
        if(quotient > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;}
        if(quotient < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;}
        return (int)quotient;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend and the divisor respectively : ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = divide(dividend , divisor);
        System.out.println("The quotient : " + quotient);
    }
}






/*
Own devised Brute Force approach(TLE) :

public int divide(int divid, int divis) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long dividend = divid;
        long divisor = divis;
        long count = 0;
        if(dividend > 0 && divisor > 0){
            while(dividend >= divisor){
                dividend = dividend - divisor;
                count++;
            }
        }
        else if(dividend < 0 && divisor < 0){
            dividend = -dividend;
            divisor = -divisor;
            while(dividend >= divisor){
                dividend = dividend - divisor;
                count++;
            }
        }
        else if(dividend > 0 && divisor < 0){
            divisor = -divisor;
            while(dividend >= divisor){
                dividend = dividend - divisor;
                count++;
            }
            count = -count;
        }
        else{
            dividend = -dividend;
            while(dividend >= divisor){
                dividend = dividend - divisor;
                count++;
            }
            count = -count;
        }
        if(count > max)
            return max;
        else if(count < min)
            return min;
        else
        return (int)count;
    }
 */


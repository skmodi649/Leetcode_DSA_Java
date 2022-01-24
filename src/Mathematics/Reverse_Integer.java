/*
We are assuming that we are allowed to store the 64bit integer using long
 */


package Mathematics;

import java.util.Scanner;

public class Reverse_Integer {
    public static int reverse(int x) {
        long reverse = 0;
        int num = x;
        num = (num < 0)?-num:num;
        while(num > 0){
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        if(x < 0)
            reverse = -reverse;
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE)
            return 0;
        else
            return (int)reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}

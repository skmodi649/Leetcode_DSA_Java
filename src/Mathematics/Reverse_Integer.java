package Mathematics;

import java.util.Scanner;

public class Reverse_Integer {
    public static int reverse(int x) {
        int high = Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;
        String highx = Integer.toString(high);
        String lowx = Integer.toString(low);
        int reverse = 0;
        int last = x % 10;
        String xint = Integer.toString(x);
        if(x > 0 && last > 2 && xint.length() == 10) {
            return 0;
        }
        if(x > 0 && xint.length() == 10) {
            String xintreverse = "";
            for (int i = xint.length() - 1; i >= 0; i--) {
                char ch = xint.charAt(i);
                xintreverse = xintreverse + ch;
            }
            for (int j = 0; j < 10; j++) {
                char ch1 = xintreverse.charAt(j);
                char ch2 = highx.charAt(j);
                int val1 = (int) ch1;
                int val2 = (int) ch2;
                if (val1 > val2)
                    return 0;
            }
        }
            if(x < 0 && xint.length() == 11){
                String xintreverse = "";
                for(int i = xint.length() - 1 ; i >= 0 ; i--){
                    char ch = xint.charAt(i);
                    xintreverse = xintreverse + ch;
                }
                for(int j = 1 ; j < 11 ; j++){
                    char ch1 = xintreverse.charAt(j);
                    char ch2 = lowx.charAt(j);
                    int val1 = (int)ch1;
                    int val2 = (int)ch2;
                    if(val1 > val2)
                        return 0;
                }
        }
        if(x < 0){
            x = x * (-1);
            while(x > 0){
                int d= x % 10;
                reverse = (reverse * 10) + d;
                x = x / 10;
            }
            reverse *= (-1);
        }
        else{
            while(x > 0){
                int d= x % 10;
                reverse = (reverse * 10) + d;
                x = x / 10;
            }
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}

// Link: https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/
// Status: Own algo
/* Explanation: 1. Calculate the number of beams for each row and store it in a arraylist
                2. Now just traverse the arraylist, calculate top and down
                3. ans = ans + (top * down)
                4. return the answer
 */
package Mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class leet_2125 {
    public static int count1s(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '1')
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] bank = new String[n];
        for(int i = 0; i < n; i++){
            bank[i] = sc.next();
        }

        if(n == 1){
            System.out.println(0);
            return;
        }
        ArrayList<Integer> laserCount = new ArrayList<>();
        for(String val : bank){
            laserCount.add(count1s(val));
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            int top = laserCount.get(i);
            if(top == 0)
                continue;
            for(int j = i+1; j < n; j++){
                int down = laserCount.get(j);
                if(down == 0){
                    continue;
                }
                else{
                    ans = ans + (top * down);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

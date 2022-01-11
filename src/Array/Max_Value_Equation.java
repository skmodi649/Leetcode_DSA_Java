// Difficulty : Hard
package Array;

import java.util.Scanner;

public class Max_Value_Equation {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max = -2147483648;
        int n = points.length;
        for(int i = 0 ; i < n-1 ; i++){
            int val = 0;
            int diff = points[i][0] - points[i+1][0];
            diff = (diff < 0)?-diff:diff;
            if(diff <= k){
                val = points[i][1] + points[i+1][1] + diff;
                if(val > max){
                    max = val;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] arr = new int[row][2];
        System.out.println("Enter the x and y co-ordinates of the respective points :");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of k :");
        int k = sc.nextInt();
        int val = findMaxValueOfEquation(arr , k);
        System.out.println(val);
    }
}

package Array;

import java.util.Scanner;

public class Diagonal_Sum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int k = n - 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == j){
                    sum = sum + mat[i][j];
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(i != k){
                sum = sum + mat[i][k];}
            k--;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter the values in the matrix : ");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of both the diagonals of the matrix is " + diagonalSum(mat));
    }
}

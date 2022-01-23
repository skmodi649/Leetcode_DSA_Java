package Strings;

import java.util.Scanner;

public class Longest_Common_Prefix_Brute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings in the array : ");
        for(int i = 0 ;i < n ; i++)
            strs[i] = sc.next();
        String smallest = strs[0];
        for(int i = 0 ;i < n ; i++){
            String str = strs[i];
            if(str.length() < smallest.length()){
                smallest = str;
            }
        }
        String lcp = "";
        for(int a = 0 ; a < smallest.length() ; a++){
            char ch = smallest.charAt(a);
            int val = 0;
            for(int j = 0 ; j < n ; j++){
                char ch1 = strs[j].charAt(a);
                if(ch1 == ch){
                    val++;
                }
            }
            if(val == n)
                lcp = lcp + ch;
            else
                break;
        }
        System.out.println("Longest Common Prefix : " + lcp);
    }
}

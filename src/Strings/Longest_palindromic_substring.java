package Strings;

import java.util.Scanner;

public class Longest_palindromic_substring {
    public static boolean palindrome(String st , int l){
        StringBuilder str = new StringBuilder(st);
        StringBuilder reversestr = str.reverse();
        if(str.equals(reversestr))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = 0 , end = str.length();
        String subpal1 = "";
        while(start < end){
            subpal1 = str.substring(start , end);
            if(palindrome(subpal1 , subpal1.length()))
                break;
            else {
                start++;
                end--;
            }
        }
        start = 0;
        end = str.length();
        String subpal2 = "";
        while(start < end){
            subpal2 = str.substring(start , end);
            if(palindrome(subpal2 , subpal2.length()))
                break;
            else {
                start++;
            }
        }
        start = 0;
        end = str.length();
        String subpal3 = "";
        while(start < end){
            subpal3 = str.substring(start , end);
            if(palindrome(subpal3 , subpal3.length()))
                break;
            else {
                end--;
            }
        }
        String maxsubstr = subpal1.length() > subpal2.length()?subpal1:subpal2;
        maxsubstr = maxsubstr.length() > subpal3.length()?maxsubstr:subpal3;
        System.out.println(maxsubstr);
    }
}

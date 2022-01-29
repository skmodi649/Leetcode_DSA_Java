/*
Link for the problem statement : https://leetcode.com/problems/string-to-integer-atoi/
Difficulty : Medium
Have presented two solutions over here, the commented is own devised algorithm and the other referred one
 */


package Strings;

import java.util.Scanner;

public class Atoi {
    public static int myAtoi(String s) {
        // Lets first remove all the whitespaces
     /*   String str = s.replaceAll("\\s", "");
        int l = str.length();
        String num = "";
        long val;
        char first = str.charAt(0);
        if(first == '+'){
            for(int i = 1 ; i < l ; i++){
                char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    num = num + ch;
                }
                else{
                    break;
                }
            }
            if(num.length() == 0)
                val = 0;
            else
                val = Long.parseLong(num);

    }
        else if(first != '+' && first != '-'){
               for(int i = 0 ; i < l ; i++){
                char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    num = num + ch;
                }
                else{
                    break;
                }
            }
            if(num.length() == 0)
                val = 0;
            else
                 val = Long.parseLong(num);
        }
        else{
            num = num + first;
              for(int i = 1 ; i < l ; i++){
                char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    num = num + ch;
                }
                else{
                    break;
                }
              }
            if(num.length() == 0)
                val = 0;
            else
                 val = Long.parseLong(num);
        }
        if(val < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(val > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else
            return (int)val; */



        long x = 10;
        long res = 0;
        boolean before = true;
        boolean neg = false;
        boolean pos = false;


        for(int i=0; i<s.length(); i++){

            if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122) || s.charAt(i) == 46){
                break;
            } else if(s.charAt(i) == '-' && before){
                neg = true;
                before = false;
            } else if(s.charAt(i) == '+' && before){
                pos= true;
                before = false;
            } else if((s.charAt(i) == ' ' && neg) || (s.charAt(i) == ' ' && pos) || (s.charAt(i) == '-' && pos) || (s.charAt(i) == '+' && pos) || (s.charAt(i) == '-' && neg) || (s.charAt(i) == '+' && neg) || (s.charAt(i) == '-' && !before) || (s.charAt(i) == '+' && !before) || (s.charAt(i) == ' ' && !before)){
                break;
            } else if(s.charAt(i) >= 48 && s.charAt(i) <= 57){

                res = (res * x) + Character.getNumericValue(s.charAt(i));

                if(neg){
                    if(res-1 > 2147483647){
                        res = -2147483648;
                        break;
                    }
                } else {
                    if(res > 2147483647){
                        res = 2147483647;
                        break;
                    }
                }

                before = false;

            } else if(res != 0){
                break;
            }
        }

        return (neg)? -(int)res : (int)res;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required string : ");
        String str = sc.next();
        System.out.println("The extracted number : " + myAtoi(str));

    }
}

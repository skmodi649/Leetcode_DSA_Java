package Stack;

import java.util.Stack;

class Remove_K_digits {
    public String removeKdigits(String num, int k) {

        // ********************** DIGITS ARE CONTIGUOUS *************************
     /*   int min = Integer.MAX_VALUE;
        String str = "";
        for(int i = 0 ; i < num.length() - k ; i++){
            String substr = num.substring(0 , i) + num.substring(i+k , num.length());
            int n = Integer.parseInt(substr);
            if(n < min){
                min = n;
                str = String.valueOf(min);
            }
        }
        if(str.length() == 0)
            return "0";
        else
            return str; */

        // **************** DIGITS ARE NOT CONTIGUOUS *************************

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < num.length() ; i++){
            char ch = num.charAt(i);
            while(stack.size() > 0 && k > 0 && stack.peek() > ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while(k > 0){
            stack.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        while(stack.size() > 0){
            str.append(stack.pop());
        }
        //removing 0's which will be in front
        while(str.length()>0 && str.charAt(str.length()-1)=='0'){
            str.deleteCharAt(str.length()-1);
        }

        if(str.length()==0)
            return "0";
        return str.reverse().toString();
    }
}
// Link: https://leetcode.com/problems/complex-number-multiplication/description/
// Status: New use of split method, then use own formula = (x1*x2 - y1*y2) + (x1*y2 + x2*y1)i;
// Explanation: 1. Split the complex numbers into real and imaginary part using split() method
//                2. Then just use the above mentioned formula

package Mathematics;

public class leet_537 {
    public String complexNumberMultiply(String num1, String num2) {
        // Let's split the given complex numbers into real and imaginary part using split() method
        String[] first = num1.split("\\+");
        String[] second = num2.split("\\+");

        int x1 = Integer.valueOf(first[0]);
        int y1 = Integer.valueOf(first[1].replace("i", ""));
        int x2 = Integer.valueOf(second[0]);
        int y2 = Integer.valueOf(second[1].replace("i", ""));

        String real = String.valueOf(x1*x2 - y1*y2);
        String img = String.valueOf(x1*y2 + x2*y1);

        String ans = real + "+" + img + "i";
        return ans;
    }
}

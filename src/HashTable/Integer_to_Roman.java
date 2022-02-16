// Program to convert an integer into roman numerals using TreeMap in Java
// Difficulty : Medium

package HashTable;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Integer_to_Roman {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        TreeMap<Integer , String> hash = new TreeMap<>();
        hash.put(1,"I");
        hash.put(2,"II");
        hash.put(3,"III");
        hash.put(4,"IV");
        hash.put(5,"V");
        hash.put(6,"VI");
        hash.put(7,"VII");
        hash.put(8,"VIII");
        hash.put(9,"IX");
        hash.put(10,"X");
        hash.put(50,"L");
        hash.put(100,"C");
        hash.put(500,"D");
        hash.put(1000,"M");
        hash.put(40,"XL");
        hash.put(90,"XC");
        hash.put(400,"CD");
        hash.put(900,"CM");

        /*
        Java.util.TreeMap.floorEntry() : It returns the greatest key less than or equal to the given key, or null if there is no such key.
        */

        StringBuilder result=new StringBuilder();
        while(num > 0){
            Map.Entry<Integer,String> entry= hash.floorEntry(num);
            String ch = entry.getValue();
            num-=entry.getKey();
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}

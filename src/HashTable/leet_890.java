// Link: https://leetcode.com/problems/find-and-replace-pattern/description/
// Status: New concept learned
// Explanation: Find the label of given string using hashmap



package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leet_890 {
    // Labeling the string
    public String getStringLabel(String str){
        int count = 0;
        String label = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch));
                label = label + Integer.toString(map.get(ch)) + " ";
            }
            else{
                count++;
                map.put(ch, count);
                label = label + Integer.toString(count) + " ";
            }
        }
        return label;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        String label_pattern = getStringLabel(pattern);
        System.out.println(label_pattern);

        for(String word : words){
            if(label_pattern.equals(getStringLabel(word))){
                ans.add(word);
            }
        }
        return ans;
    }
}

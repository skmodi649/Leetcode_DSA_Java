// Link: https://leetcode.com/problems/circular-permutation-in-binary-representation/description/
// Learning: Gray code generation for n-bit number
/*
* Explanation
* 1. Generating an arraylist of gray codes for given n
* 2. Rotating the arraylist such that the start becomes the first element
* 3. return the arraylist
* */

package Mathematics;

import java.util.ArrayList;
import java.util.List;

public class leet_1238 {
    public List<Integer> circularPermutation(int n, int start) {
        // Step 1: Generating the gray code for n-bits
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < (1 << n); i++){
            int val = (i ^ (i >> 1));
            list.add(val);
        }

        int idx = list.indexOf(start);

        System.out.println(idx);

        List<Integer> ans = new ArrayList<>();
        for(int i = idx; i < list.size(); i++){
            ans.add(list.get(i));
        }
        for(int i = 0; i < idx; i++){
            ans.add(list.get(i));
        }
        return ans;
    }
}

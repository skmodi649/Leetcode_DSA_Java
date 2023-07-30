// Link: https://leetcode.com/problems/gray-code/description/
// Status: Own
// Explanation: Gray code generator form problem: leetcode 1238

package Mathematics;

import java.util.ArrayList;
import java.util.List;

public class leet_89 {
    public List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<>();
        for(int i = 0; i < Math.pow(2,n); i++){
            int val = (i ^ (i >> 1));
            gray.add(val);
        }
        return gray;
    }
}

// Own devised algorithm using HashMap
// Link : https://leetcode.com/problems/majority-element-ii/
package Counting;

public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer , Integer> hash = new HashMap<>();
        int val = (int)(Math.floor(nums.length/3));
        for(int i = 0 ; i < nums.length ; i++){
            if(hash.containsKey(nums[i]))
                hash.put(nums[i],hash.get(nums[i])+1);
            else
                hash.put(nums[i],1);
        }
        for (Map.Entry<Integer, Integer> set :
                hash.entrySet()) {
            if(set.getValue() > val)
                ans.add(set.getKey());
        }
        return ans;
    }
}

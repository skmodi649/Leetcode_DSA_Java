package Array;

import java.util.ArrayList;
import java.util.List;

public class Partition_according_to_pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < pivot)
                left.add(nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > pivot)
                right.add(nums[i]);
        }
        int l = 0 , r = 0;
        for(int a = 0 ; a < nums.length ; a++){
            if(nums[a] < pivot){
                ans.add(nums[a]);
            }
        }
        for(int a = 0 ; a < nums.length ; a++){
            if(nums[a] == pivot){
                ans.add(nums[a]);
            }
        }
        for(int a = 0 ; a < nums.length ; a++){
            if(nums[a] > pivot){
                ans.add(nums[a]);
            }
        }
        for(int i = 0 ; i < ans.size() ; i++)
            nums[i] = ans.get(i);
        return nums;
    }
}

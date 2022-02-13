// Program to find all lonely numbers in an array
// Own devised alogrithm
// Concept : First finding the frequency of each array element, then checking for loneliness for those elements whose
//           frequency is equal to one



package Counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lonely_Numbers_in_array {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(hash.containsKey(nums[i]))
                hash.put(nums[i] , hash.get(nums[i])+1);
            else
                hash.put(nums[i] , 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int freq = hash.get(nums[i]);
            if(freq == 1){
                if(!hash.containsKey(nums[i]-1) && !hash.containsKey(nums[i]+1))
                    list.add(nums[i]);
            }
        }
        return list;
    }
}

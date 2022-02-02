/*
Difficulty : Medium
Link : https://leetcode.com/problems/container-with-most-water/
 */

// Own devised two pointer algorithm
// Only the necessary method is provided
package Array;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        // Simple two pointer approach
        int i = 0 , j = height.length - 1;
        int max = 0;
        while(i < j){
            int chotta = height[i] < height[j] ? height[i] : height[j];
            int area = (j - i) * chotta;
            if(area > max){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}

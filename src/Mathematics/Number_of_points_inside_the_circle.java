// Following is the problem to find the number of points inside of the circle
// Concept used : Equation of the circle with center at (x1 , y1) and radius r is (x - x1)^2 + (y - y1)^2 = r^2
// So for a points say (p,q) to be inside of the circle it has to follow the equation : (x - p)^2 + (y - q)^2 <= r^2
// Difficulty : Medium
// Own devised algorithm

// Link to problem : https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/


package Mathematics;

public class Number_of_points_inside_the_circle {
    public int[] countPoints(int[][] points, int[][] queries) {
        int rowC = queries.length;
        int[] arr = new int[rowC];
        int rowP = points.length;
        for(int i = 0 ; i < rowC ; i++){
            int count = 0;
            int radius = queries[i][2];
            radius = (int)Math.pow(radius , 2);
            for(int j = 0 ; j < rowP ; j++){
                int x = points[j][0];
                int y = points[j][1];
                int sum = (int)Math.pow(x-queries[i][0],2) + (int)Math.pow(y-queries[i][1],2);
                if(sum <= radius)
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}

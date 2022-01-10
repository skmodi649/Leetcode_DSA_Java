package Array;

import java.util.Scanner;

public class Sort_Colors {
    public static void sortColors(int[] nums) {
        int zero = 0 , one = 0 , two = 0;
        for (int num : nums) {
            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
            else
                two++;
        }
        int l = nums.length;
        int k , i;
        for(k = 0 ; k < zero ; k++){
            nums[k] = 0;}
        for(i = zero ; i < one+zero ; i++)
            nums[i] = 1;
        for(int j = one+zero ; j < l ; j++)
            nums[j] = 2;
    }
    public static void main(String[] asdfasdf){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        System.out.println("The array after the color based sorting :");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

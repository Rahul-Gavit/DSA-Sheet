package Arrays;

import java.util.Arrays;

public class Solution1 {

    public static int findSecondLargest(int n, int[] arr) {

        if(n < 2){
            return -1;
        }

        Arrays.sort(arr);

        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 8, 1, 7, 4, -1, 3};
        int n = arr.length;
        System.out.println(findSecondLargest(n, arr));
    }
}


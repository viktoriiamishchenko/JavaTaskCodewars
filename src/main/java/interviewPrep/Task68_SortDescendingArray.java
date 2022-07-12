package interviewPrep;

import java.util.Arrays;

public class Task68_SortDescendingArray {

    public static void main(String[] args) {

        int[] num21 = {1,2,4,0,0,5,0};
        System.out.println(Arrays.toString(sortDescending(num21)));

    }

    public static int[] sortDescending(int [] arr){

        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

/*
//68
//        input
//        int[] num21 = {1,2,4,0,0,5,0};
//        output
//                [5, 4, 2, 1, 0, 0, 0]
 */

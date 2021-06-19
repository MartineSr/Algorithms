package mergesort;

import java.util.Arrays;

public class Mergesort {

    // array = [12,4,0,9,4,10,11,7]
    public void mergesort(int[] array){
        System.out.println("public mergesort");
        partition(array,0,array.length-1);
    }

    /**
     * We put in:
     * array = [12,4,0,9,4,10,11,7]
     * 1st - [12,4,0,9]  and r = [4,10,11,7]
     * 2md - [12,4]
     * 3rd - [12] -> return -> [12], [4] -> merge
     *
     */

    void partition(int[] array, int start, int end){
        System.out.println("partition");
        int[] left;
        int[] right;
        int mid = 0;
        if(start == end) {
            System.out.println("Value of array is: " + array[start]);
        } else {
            mid = (end - start) / 2;
//            left =
            partition(array, start, mid); //12
            partition(array, mid+1, end); //4
            mergesort(array, start, mid+1, end); //mid = 0?
        }
    }

    void mergesort(int[] array, int index1, int index2, int index3){
        System.out.println("FIRST VALUES IN: " + array[index1] + " and " + array[index3]);
    }
}

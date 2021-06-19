package mergesort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Mergesort {

    // array = [12,4,0,9,4,10,11,7]
    public void mergesort(int[] array){
        partition(array,0,array.length-1);
    }

    /**
     * We put in:
     * array = [12,4,0,9,4,10,11,7]
     * 1st - [12,4,0,9]  and r = [4,10,11,7]
     * 2md - [12,4] and r = [0,9]
     * 3rd - [12] -> return -> [12], [4] -> [4,12]
     * then - [0] and r = [9]
     *
     */

    private void partition(int[] array, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            partition(array, start, mid); //12
            partition(array, mid+1, end); //4

            merge(array, start, mid, end);
        }
    }

    // Left subarray runs from start to mid
    // Right subarray from mid+1 to end
    private void merge(int[] array, int start, int mid, int end){
        System.out.println("Show: " + Arrays.toString(array) + " start: " + start + " mid: " + mid + " end: " + end);

        int lengthLeft = (mid - start) + 1;
        int lengthRight = (end - mid);

        int[] left = new int[lengthLeft];
        int[] right = new int[lengthRight];

        for(int i = 0; i < lengthLeft; ++i){
            left[i] = array[start + i];
        }
        for(int i = 0; i < lengthRight; ++i){
            right[i] = array[mid + 1 + i];
        }

        System.out.println("Left: " + Arrays.toString(left));
        System.out.println("Right: " + Arrays.toString(right));

        int i = 0, j = 0, k = start;

        while(i < lengthLeft && j < lengthRight){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < lengthLeft) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (i < lengthRight) {
            array[k] = right[i];
            i++;
            k++;
        }
    }
}

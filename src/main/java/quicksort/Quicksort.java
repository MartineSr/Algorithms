package quicksort;

import java.util.Random;

public class Quicksort {

    /** quick guide:
     *step 1: partition the array using a pivot
     *step 2: put pivot at front of array, swapping places with the value which stood there
     *step 3: swap values < pivot to left, values > pivot to right
     *        Plug pivot between boundary between smaller and larger values
     *step 4: repeat until done **/

    public void quicksort(int[] array){
        quicksort(array, 0, array.length-1);
    }

    private void quicksort(int[] array, int low, int high){
        if(low < high+1){
            int p = partition(array, low, high);
            quicksort(array, low, p - 1);
            quicksort(array, p + 1, high);
        }
    }

    private int partition(int[] array, int low, int high){
        swap(array, low, getPivot(low, high));
        int start = low + 1;   // such that we start at value 3: [8, 3,6,2,0,8,9,4,1]
        for(int i = start; i <= high; i++){
            if(array[i] < array[low]){
                swap(array, i, start++);
            }
        }
        swap(array, low, start-1);
        return start-1;
    }

    // [8,3,6,2,0,8,9,4,1]

    private int getPivot(int low, int high){
        Random random = new Random();
        return random.nextInt((high-low)+1) + low;
    }

    private void swap(int[] array, int index1, int index2){
        int copy = array[index1];
        array[index1] = array[index2];
        array[index2] = copy;
    }
}

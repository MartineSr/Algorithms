import mergesort.Mergesort;
import quicksort.Quicksort;
import java.util.Arrays;

public class Application {

    public static void main(String[] args){
//        int[] myQuicksortArray = {8,3,6,2,0,8,9,4,1};
//        System.out.println(Arrays.toString(myArray));
//        Quicksort qs = new Quicksort();
//        qs.quicksort(myArray);
//        System.out.println(Arrays.toString(myArray));

        int[] myMergesortArray = {12,4,0,9,4,10,11,7,5};
        System.out.println("Start array: " + Arrays.toString(myMergesortArray));
        Mergesort ms = new Mergesort();
        ms.mergesort(myMergesortArray);
        System.out.println("Sorted Array?: " + Arrays.toString(myMergesortArray));
    }
}

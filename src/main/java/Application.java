import quicksort.Quicksort;
import java.util.Arrays;

public class Application {

    public static void main(String[] args){
        int[] myArray = {8,3,6,2,0,8,9,4,1};
        System.out.println(Arrays.toString(myArray));
        Quicksort qs = new Quicksort();
        qs.quicksort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}

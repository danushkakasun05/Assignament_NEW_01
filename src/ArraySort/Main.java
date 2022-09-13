package ArraySort;

import ArraySort.arraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3};
            arraySort ars = new arraySort(arr);
            ars.sort();
            System.out.println(Arrays.toString(arr));
        }catch(Exception e){
            System.out.println("Error: "+e);
        }

    }
}

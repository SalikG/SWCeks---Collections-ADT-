import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // n = 5 = længden af listen
        int[] numbers = {3, 2, 8, 4};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort(int[] array){
        //array.length = n
        int i = 1;

        for(int outerIndex = 0; outerIndex < array.length - 1; outerIndex++){//  n - 1
            int smallestIndex = outerIndex;
            for(int innerIndex = outerIndex + 1; innerIndex < array.length; innerIndex++){ //  n * 0,5
                //Antallet af indre loops array[0] = 3, array[1] = 2, array[2] = 1, array[3] = 0
                //I gennemsnit = 2 gange
                // 2 / med antal i array = 0,5
                System.out.println(i);
                if(array[innerIndex] < array[smallestIndex]){
                    smallestIndex = innerIndex;
                }
            }
            i++;
            if (smallestIndex != outerIndex){
                swap(array, smallestIndex, outerIndex);
            }

            // (n-1)*(n*0,5) = 0,5n^2 - 0,5n
            // 0,5n^2 - 0,5n = O(n^2)
        }
    }

    public static void swap(int[] array, int indexA, int indexB){
        int temporary = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temporary;
    }
}

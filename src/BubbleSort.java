public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {2, 3, 1, 7, 5, 9, 8, 4, 6};
        for (int i = 0; i < intArray.length - 1; i++){
            for (int j = 1; j < intArray.length - i; j++){
                if(intArray[j-1] > intArray[j]){
                    int temporary = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temporary;
                }
            }
        }
        for (int i : intArray) {
            System.out.print(i + ", ");
        }
    }
}

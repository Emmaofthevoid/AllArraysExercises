import java.util.Arrays;

public class PrintArrayValues {
    public static void main(String[] args) {
        int [] arrayArray = { 1,2,3,4};
        printArray(arrayArray);
        System.out.println();
        System.out.println(Arrays.toString(arrayArray));
        int [] arrayExample = new int [] {1,2,3,4};
        int [] anotherArrayExample = {1,2,3,4};
    }
    public static void printArray (int [] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            if ( i == arrayToPrint.length -1) {
                System.out.print(arrayToPrint[i] + ".");
            }
            else {
                System.out.print(arrayToPrint[i] + ",");
            }
        }
    }
}

public class isContainedInTheArray {
    public static void main(String[] args) {
        int[] arrayArray = {1, 2, 3, 4};
        System.out.println("technically wrong method " + containsNumber( arrayArray, 1));
        System.out.println( "technically right  method " + technicallyRightMethod(arrayArray,3));
    }

    //the variables are an array to check if the n° is there and an int to give the number
    public static boolean containsNumber(int[] arrayToCheck, int number) {
        //this variable is initialised inside the loop because it wont change with outside inputs
        //IT WILL RETURN FALSE FOR EVERY NUMBER EXCEPT THE LAST ONE EVEN IF THEY ARE INDEED THERE BC THE BOOLEAN KEEPS
        // CHANGING UNTIL WE REACH THE END OF THE ARRAY
        boolean isContained = false;
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (number == arrayToCheck[i]) {
                isContained = true;

            } else {
                isContained = false;
            }
        }
        return isContained;
    }
    public static boolean technicallyRightMethod (int [] array, int numberToCheck) {

         for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == numberToCheck) {
                return true;
            }
            else {
                return false;
            }

        }
        return false;
    }
}

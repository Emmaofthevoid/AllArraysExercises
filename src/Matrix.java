public class Matrix {
    public static void main(String[] args) {
        generateMatrix(5);
    }

    public static double[][] generateMatrix(int size) {
        //initialize a new array to save the values, both klammern are as big as the size bc we need a quadrat
        double[][] arrayOfHell = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                //i and j will be the same once each round of i, when that happens, the value of
                //j, inside of i, will be 1.0
                if (j == i) {
                    arrayOfHell[i][j] = 1.0;
                }
                //we sout it inside of the j loop bc we want all the values and bc j doesnt exist outside of this loop
                System.out.print(arrayOfHell[i][j] + " ");
            }
            //this sout we write outside of the j loop but inside of the i loop bc we want it to happen once per row
            System.out.println();
        }
        return arrayOfHell;
    }
}

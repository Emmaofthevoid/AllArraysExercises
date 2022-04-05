package com.company;

public class ArrayKleinsteZahl {
    public static void main(String[] args) {
    int [] arrayOfHell = new int[] {23,56,864,32,2};
        int [] arrayOfHell2 = new int[] {2,6,8,32,24,-3};

        int [][] arrayOfSuperHell = new int[][] {{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};

        System.out.println(kleinsteZahl(arrayOfHell));
        System.out.println(kleinsteZahl(arrayOfHell2));
        System.out.println(summeGegenDiagonale(arrayOfSuperHell));
    }
    public static int kleinsteZahl (int [] arr) {
        // we assume the first number is the smaller one until we compare it with the next ones
        int klZ =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < klZ) {
                klZ = arr[i]; 
            }
        }
        return klZ ;
    }

    public static int summeGegenDiagonale (int [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length-i-1];
        }
        return sum;
    }

}

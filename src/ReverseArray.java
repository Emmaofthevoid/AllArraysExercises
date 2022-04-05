import java.util.Arrays;

public class ReverseArray {
    //de {1,2,3,4} a {4,3,2,1}
    public static void main(String[] args) {
        int[] arrayToReverse = {5, 6, 7, 8};
        System.out.println(Arrays.toString(reverse(arrayToReverse)));
        System.out.println(Arrays.toString(reversePalante(arrayToReverse)));
    }

    public static int[] reverse(int[] original) {
        int indiceJ = 0;
        int nuevoArray[] = new int[original.length];
        for (int indiceI = original.length - 1; indiceI >= 0; indiceI--) {
            nuevoArray[indiceJ] =original[indiceI];
            indiceJ++;
        }
        return nuevoArray;
    }

    public static int [] reversePalante (int [] original) {

        int indice = original.length -1 ;
        int nuevisimoArray [] = new int [original.length];
        for (int i = 0; i < original.length; i++) {
            nuevisimoArray[indice] = original[i];
            indice --;

        }
        return  nuevisimoArray;
    }
}

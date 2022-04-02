import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDArrayFirstContact {
    public static void main(String[] args) {
        int [][] tabelle = new int [4] [3];
        //alle werte sollen aie zahl 42 gesetzt werden
        //das ist die schleife für unsere Zeilen
        for (int zeile = 0; zeile < tabelle.length; zeile++) {
            //das ist die schleife für unsere spalten
            for (int spalte = 0; spalte< tabelle[zeile].length; ++spalte) {
                tabelle [zeile][spalte] = 42;
                System.out.println(tabelle[zeile] [spalte]);
            }
            System.out.println(Arrays.toString(tabelle[zeile]));
        }
    }
}
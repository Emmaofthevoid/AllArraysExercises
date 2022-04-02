import java.util.Arrays;

public class ArraySmartphones {
    public static void main(String[] args) {


        String[] smartphoneNamen = {"Samsung A51", "Iphone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7"};
        //eine Zeile steht für ein smartphone (each line stands for one smartphone)
        // jede spalte in der zeile steht für verkaufszahlen in den jeweiligen quartalen (each column in the line stands
        //for the number of sells in that quarter
        int[][] smartphoneVerkaufszahlen = {{1000, 3000, 4000, 5000}, {6000, 7000, 8000, 9000},
                {3560, 3700, 4800, 5200}, {6500, 2300, 3450, 3400}, {3400, 4500, 5850, 5600}};
        //ausgabe variante 1
        for (int sNr = 0; sNr < smartphoneNamen.length; sNr++) {
            System.out.println(smartphoneNamen[sNr] + "   " + sNr);
        }
        //ausgabe variante 2, die faule variante
        System.out.println(Arrays.toString(smartphoneNamen));
        System.out.println("***********");
        //schon wieder für faule
        System.out.println("----");
        //for each loop - schnellschreibvariante (wie möchten den Inhalt nicht verändern)
        //rechts vom ":" steht das array ( oder sonst was mehr daten beinhaltet
        //links faneben meine laufvariable die den type des Inhalts des arrays hat
        //(kann einen beliebigen namen haben - eine sogenannte "Hansi" variable)
        for (String smartphone : smartphoneNamen) {
            System.out.println(smartphone);
        }
        System.out.println("-----");
        //alle smartphone verkaufszahlen inklusive name ausgeben
        for (int sIndex = 0; sIndex < smartphoneVerkaufszahlen.length; sIndex++) {
            System.out.print(smartphoneNamen[sIndex] + ": ");
            for (int qIndex = 0; qIndex < smartphoneVerkaufszahlen[sIndex].length; qIndex++) {
                System.out.print(smartphoneVerkaufszahlen[sIndex][qIndex] + "   ");
            }
            //nach ausgabe aller Quartalszahlen ein in Zeilenumbruch bitte
            System.out.println();
            System.out.println();
        }
        System.out.println("---------");

        for (int i = 0; i < smartphoneNamen.length; i++) {
            //this is printing the names, we need only 1 variable bc it's the first array, or rows
            System.out.print(smartphoneNamen[i]);
            //this is printing the numbers, the second for loop is in the method
            System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, i));
        }
        System.out.println("!!!!!!");
        System.out.println(erfolgreichtesSmartphoneQuartal(smartphoneVerkaufszahlen,smartphoneNamen,1));

        System.out.println("!!!!!!!");

        System.out.println();
        System.out.println(hoferLoesung(smartphoneVerkaufszahlen, smartphoneNamen, 2));
        String sName = hoferLoesung(smartphoneVerkaufszahlen,smartphoneNamen,2);
        System.out.println(sName);
    }

    // Die folgende methode soll die über das jahr verkauften Zahlen smartphones zurückliefern
    //zahlen: unsere verkaufszahlen
    // welchesSmartphoneIndex : Index der Angibt an welche Smartphone wir interessiert sind (0 basiert)
    //weitere anforderung : wenn ungültiger wert auf welchesSmartphoneIndex angegeben wird bitte -1 zurückliefern
    public static int verkaufteAnzahlJahr(int[][] zahlen, int welchesSmartphone) {
        if (welchesSmartphone < 0 || welchesSmartphone > zahlen.length) {
            return -1;
        } else {
            int sum = 0;
            for (int q = 0; q < zahlen[welchesSmartphone].length; q++) {
                sum += zahlen[welchesSmartphone][q];
            }
            return sum;
        }
    }

    //Die Folgende methode soll uns den namen des smartphones liefern, das in einem bestimmten Quartal
    //am erfolgreichsten war
    //zahlen: unser verkaufszahlen
    //namen: unser smartphone namen
    //quartalNr: für welches quartal soll berechnet werden (zwischen 1 und 4) - sonst Rückgabewert leerer String
    public static String erfolgreichtesSmartphoneQuartal(int[][] zahlen, String[] namen, int quartalNr) {
        if (quartalNr < 1 || (quartalNr > 4)) {
            return " ";

        } else {
            int biggestNumber = zahlen[0][quartalNr]; //auxiliary variable for comparing numbers in a sequence
            int indexBiggestNumber = 0; //an auxiliary variable for determining the index of the name of the
            // telephone that has the highest sales in the requested quarter
            for (int i = 0; i < zahlen.length; i++) {
                int j = quartalNr;
                if (biggestNumber < zahlen[i][j]) {
                    biggestNumber = zahlen[i][j];
                    indexBiggestNumber = i;
                    //this if loop serves to get the largest number in the sequence
                }
            }
            return namen[indexBiggestNumber];
        }
    }
    public static String hoferLoesung (int [][] zahlen, String [] namen, int quartalNr) {
        if (quartalNr < 1 || quartalNr > 4) {
            return " ";
        }
        //spalten bleiben immer gleich
        // zahlen[][quartalNr -1]
        //nehmen wie an erste Zahl ist die groesste Zahl
        //(zugleich gehen wir auch davon aus, dass es immer zumindest eine Zahl im Array gibt)
        int indexGr = 0;
        int zahlGr = zahlen[0][quartalNr-1];
        for (int z = 0; z < zahlen.length; z++) {
            if (zahlen[0][quartalNr-1] > zahlGr) {
                zahlGr = zahlen[z][quartalNr-1];
                indexGr = z;
            }
        }

        //nach ender der schleife zahlGr groesste Zahl, indexGr Index der groesste Zahl
        return  namen[indexGr];
    }
}

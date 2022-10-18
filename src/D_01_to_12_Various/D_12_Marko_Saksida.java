package D_01_to_12_Various;

import java.util.Arrays;
import java.util.Scanner;

public class D_12_Marko_Saksida {
    public static void main(String[] args) {
        System.out.println("*** Unos imena u niz i ispis niza ***");
        unosIIspisImena();

        System.out.println("*** Unija nizova, bez ponavljanja ***");
        unijaNizova();
    }
    public static void unosIIspisImena() {
        System.out.println("Unesite broj imena koja zelite da unesete: ");
        Scanner scanner = new Scanner(System.in);
        int broj = scanner.nextInt();
        String[] nizImena = new String[broj];
        System.out.println("Unesite imena");
        for (int i = 0; i <broj; i++) {
            nizImena[i] = scanner.next();
        }
        System.out.println("Uneti niz imena je: " + Arrays.toString(nizImena));
        return;
    }

    public static String[] unijaNizova() {
        Scanner skener = new Scanner (System.in);
        System.out.print("Uneesite duzinu prvog niza: ");
        int duzinaPrvog = skener.nextInt();
        String[] niz1 = new String[duzinaPrvog];
        for (int i = 0; i < duzinaPrvog; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            String input = skener.next();
            niz1[i] = input;
        }
        System.out.print("Unesite duzinu drugog niza: ");
        int duzinaDrugog = skener.nextInt();
        String[] niz2 = new String[duzinaDrugog];
        for (int i = 0; i < duzinaDrugog; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            String input = skener.next();
            niz2[i] = input;

        }

        int brojDuplikata = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i].equalsIgnoreCase(niz2[j])) {
                    brojDuplikata++;
                }
            }
        }
        String[] niz3 = new String[niz1.length + niz2.length-brojDuplikata];
        int k = 0;
        for (int i = 0; i < niz1.length; i++) {
            boolean imena = false;
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i].equalsIgnoreCase(niz2[j])) {
                    imena = true;
                }
            }
            if (imena) {
                continue;
            }
            niz3[k] = niz1[i];
            k++;
        }
        for (int i = k, l = 0; i < niz3.length; i++, l++) {
            niz3[i] = niz2[l];
        }
        System.out.println("Unija nizova bez ponavljanja: ");
        System.out.print(Arrays.toString(niz3));

        return niz3;

    }

}


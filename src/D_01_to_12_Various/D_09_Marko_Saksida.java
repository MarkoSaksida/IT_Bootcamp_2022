package D_01_to_12_Various;//Марко Станковић
//  22:11
//Evo ga jos 1 za domaci, obrisite dva elementa iz niza. Dodatak za ovaj sa brisanjem
import java.util.Arrays;
import java.util.Scanner;

public class D_09_Marko_Saksida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");
        int duzina = scanner.nextInt();
        int[] niz1 = new int[duzina];
        for (int i = 0; i < duzina; i++) {
            System.out.print("Unesite " + (i + 1) + " element niza: ");
            niz1[i] = scanner.nextInt();
        }
        System.out.println("Niz koji ste uneli je: " + Arrays.toString(niz1));

        System.out.println("Unesite index prvog elementa niza koji zelite da obrisete: ");
        int index1 = scanner.nextInt();

        System.out.println("Unesite index drugog elementa niza koji zelite da obrisete: ");
        int index2 = scanner.nextInt();

        int[] niz2 = new int[niz1.length - 2];

        for(int i = 0, brojacDrugogNiza=0; i < niz1.length; i++) {
            if ((i != index1) && (i != index2)) {
                niz2[brojacDrugogNiza] = niz1[i];
                brojacDrugogNiza++;
            }

        }

        System.out.println(Arrays.toString(niz2));
    }
}
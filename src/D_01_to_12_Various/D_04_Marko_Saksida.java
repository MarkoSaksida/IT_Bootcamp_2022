package D_01_to_12_Various;// Istampati sve samoglasnike iz proizvoljnog stringa.

import java.util.Scanner;

public class D_04_Marko_Saksida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite neku rec: ");
        String rec = scanner.nextLine().toLowerCase();
        int duzinaReci = rec.length();
        char trazeniKarakter1 = 'a';
        char trazeniKarakter2 = 'e';
        char trazeniKarakter3 = 'i';
        char trazeniKarakter4 = 'o';
        char trazeniKarakter5 = 'u';

        for (int i = 0; i < duzinaReci; i++) {

            if (rec.charAt(i) == trazeniKarakter1) {
                System.out.println(trazeniKarakter1);
            } else if (rec.charAt(i) == trazeniKarakter2) {
                System.out.println(trazeniKarakter2);
            } else if (rec.charAt(i) == trazeniKarakter3) {
            System.out.println(trazeniKarakter3);
            } else if (rec.charAt(i) == trazeniKarakter4) {
                System.out.println(trazeniKarakter4);
            } else if (rec.charAt(i) == trazeniKarakter5) {
                System.out.println(trazeniKarakter5);
             }
        }
    }
}

package D_01_to_12_Various;

import java.util.Arrays;
import java.util.Scanner;

public class D_08_Marko_Saksida {
    public static void main(String[] args) {
        //region Init niza
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite " + (i + 1) + " element niza: ");
            niz[i] = scanner.nextInt();
        }
        //endregion
        System.out.println("Niz pre promene redosleda: " + Arrays.toString(niz));

        int[] obrnutiNiz = new int[duzinaNiza];

        for (int i = duzinaNiza - 1, j = 0; i >= 0; i--, j++) {
            obrnutiNiz[j] = niz[i];
        }
        System.out.println("Obrnuti redosled niza: " + Arrays.toString(obrnutiNiz));

        System.out.println("Izbacujemo parne brojeve ... ...");

        int[] bezParnih = new int[duzinaNiza];
        int brojac = 0;
        for (int i = 0; i < duzinaNiza; i++) {
            if (obrnutiNiz[i] % 2 == 0) {
                brojac++;
            } else {
                bezParnih[i] = obrnutiNiz[i];
            }
        }

        int[] bezParnihInula = new int[duzinaNiza - brojac];

        for (int i = 0, j = 0; i < bezParnih.length; i++) {
            if (bezParnih[i] != 0) {
                bezParnihInula[j] = bezParnih[i];
                j++;
            }

        }

        System.out.println("Obrnuti niz bez parnih brojeva: " + Arrays.toString(bezParnihInula));

    }
}
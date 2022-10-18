package D_01_to_12_Various;//Napraviti  program gde cete da unosite imena u neki niz.
//U istom tom programu dodati ispis za sva slova koja pocinju na 'M'.

import java.util.Scanner;

public class D_07_Marko_Saksida {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();
        String[] imena = new String[duzinaNiza];

        for (int i = 0; i < duzinaNiza ; i++) {

            System.out.print("Unesite ime: ");
            imena[i] = scanner.next();
            }

        System.out.println("Imena koja pocinju sa M su:");

        for (int i = 0; i < duzinaNiza ; i++) {

            if (imena[i].charAt(0) == ('M') || imena[i].charAt(0) == ('m')) {

                System.out.println(imena[i]);
            }
        }



    }


}

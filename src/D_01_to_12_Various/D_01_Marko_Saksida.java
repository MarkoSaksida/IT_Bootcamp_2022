package D_01_to_12_Various;

import java.util.Scanner;

public class D_01_Marko_Saksida {
    public static void main(String[] args) {

        Scanner godPoc = new Scanner(System.in);

        System.out.print("Unesi godinu kada si poceo da radis: ");

        int godinaPocetka = godPoc.nextInt();

        int godineStaza = 2022 - godinaPocetka;

        if (godineStaza > 0 && godineStaza <= 4) {
            System.out.println("Ti si Junior programer");
        } else if (godineStaza > 4 && godineStaza <= 8) {
            System.out.println("Ti si Senior programer");
        } else if (godineStaza > 8) {
            System.out.println("Vi ste direktor firme");
        } else {
            System.out.println("pogresan unos");
        }
    }
}

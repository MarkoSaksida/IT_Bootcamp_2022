package D_01_to_12_Various;

import java.util.Scanner;

public class D_03_Marko_Saksida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("unesite prvi broj: ");
        int x = scanner.nextInt();
        int cinilac1 = x;
        System.out.print("unesite drugi broj: ");
        int y = scanner.nextInt();
        int cinilac2 = y;

        int proizvod = 0;

        while (Math.abs(x) > 0) {
            //proizvod += y;
            proizvod = proizvod + Math.abs(y);
            x=Math.abs(x)-1;

        }

        if ((cinilac1 < 0) && (cinilac2 < 0)) { proizvod = proizvod; }
        else if (cinilac1 > 0 && cinilac2 < 0) {proizvod = -1 * proizvod;}
        else if (cinilac1 < 0 && cinilac2 > 0) {proizvod = -1 * proizvod;}
        else if ((cinilac1 > 0) && (cinilac2 > 0)) { proizvod = proizvod; }

        System.out.println("Proizvod brojeva "+ cinilac1 + " i " + cinilac2 + " je " + proizvod);
    }
}

package D_01_to_12_Various;

import java.util.Scanner;

public class D_10_Marko_Saksida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj za koji zelite da izracunate faktorijel: ");
        int x = scanner.nextInt();
        faktorijel(x);
    }

    public static int faktorijel(int x) {
        int y = 1;
        for (int i = 1; i<=x; i++) {
            y=y*i;
        }
        System.out.println(x + "! = " + y);
        return y;
    }
}

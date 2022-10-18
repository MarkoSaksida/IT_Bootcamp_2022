package D_01_to_12_Various;

import java.util.Scanner;

public class D_02_Marko_Saksida {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi velicinu majice u centimetrima: ");

        int velicina = scanner.nextInt();

        switch (velicina) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("L velicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("nepostojeca velicina");

        }

    }

}


package D_01_to_12_Various;

import java.util.Scanner;

public class D_11_Marko_Saksida {


    public static void main(String[] args) {

        reciIsteDuzine();
    }
    public static void reciIsteDuzine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prvu rec: ");
        String rec1 = scanner.next();
        System.out.print("Unesite drugu rec: ");
        String rec2 = scanner.next();
        if (rec1.length() == rec2.length()) {
            System.out.println("Ova dva Stringa su jednaka po duzini!");
            String spojeno = rec1.toLowerCase() + rec2.toLowerCase();
            System.out.println("Samoglasnici u njima su:");
            for (int i = 0; i < spojeno.length(); i++) {
                if (spojeno.charAt(i) == 'a' || spojeno.charAt(i) == 'e' || spojeno.charAt(i) == 'i'
                        || spojeno.charAt(i) == 'o' || spojeno.charAt(i) == 'u') {
                    System.out.println(spojeno.charAt(i));
                }

            }

        }
        else {
            System.out.println("Ova dva Stringa nisu jednaka po duzini!");
        }
    }
}

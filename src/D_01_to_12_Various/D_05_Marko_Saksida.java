package D_01_to_12_Various;/*Uneti string "ITBootCamp" i stampati sve karaktere
osim slova C. (Obratiti paznju na velicinu fonta)*/

public class D_05_Marko_Saksida {
    public static void main(String[] args) {

        String string = "ITBootCamp";

        char slovoC = 'C';

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != slovoC) {
                System.out.println(string.charAt(i));
            } else {
                continue;
            }
        }
    }
}

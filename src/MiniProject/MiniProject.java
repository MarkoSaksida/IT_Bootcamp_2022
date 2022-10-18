package MiniProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MiniProject {
    //0. zadatak:
    public static int[] unosIntNiza() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite " + (i + 1) + ". element niza: ");
            niz[i] = scanner.nextInt();
        }
        return niz;
    }

    //0. zadatak
    public static String[] unosStringNiza() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();
        String[] niz = new String[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite " + (i + 1) + ". element niza: ");
            niz[i] = scanner.next();
        }
        return niz;
    }

    //0. zadatak
    public static char[] unosCharNiza() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int duzinaNiza = scanner.nextInt();
        char[] niz = new char[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite " + (i + 1) + ". element niza: ");
            niz[i] = scanner.next().charAt(0);
        }
        return niz;
    }

    //1. zadatak
    public static int zbirCifara(int n) {
        int suma = 0;
        if (n < 10) {
            suma = n;
        } else {
            while (n >= 10) {
                suma = 0;
                String n1 = "";
                n1 = String.valueOf(n);
                for (int i = 0; i < n1.length(); i++) {
                    suma = suma + (n % 10);
                    n = n / 10;
                }
                n = suma;
            }
        }
        return suma;
    }

    //2. zadatak
    public static boolean stepenBroja(int n, int m) {
        boolean mJeStepenBrojaN = false;
        while (n % m == 0) {
            n = n / m;
            if (n % m == 0) {
                mJeStepenBrojaN = true;
            }
        }

        return mJeStepenBrojaN;
    }

    //3. zadatak
    public static int[] zbirIndexaNizaMeta(int[] niz, int meta) {
        int[] nizDvaIndexa = new int[2];
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (niz[i] + niz[j] == 5) {
                    nizDvaIndexa[1] = i;
                    nizDvaIndexa[0] = j;
                }
            }
        }
        return nizDvaIndexa;
    }

    //4. zadatak
    public static String toBinary(int n) {
        /*String s = "";
        while (n > 0)
        {
            if ((n % 2) == 0) {
                s = "0" + s;
            } else {s = "1" + s;}
            n = n / 2;
        }
        return s;*/
        String s = "";
        while (n > 0) {
            s = n % 2 + s;
            n = n / 2;
        }
        return s;
    }

    //5. zadatak
    public static int brojPonavljanja(String s, String recenica) {
        recenica = recenica.toLowerCase();
        recenica = recenica.replaceAll("\\s+", " ");
        recenica = recenica.replaceAll("\\p{Punct}", " ");
        String[] nizRecenica = recenica.split(" ", -2);
        int brPon = 0;
        for (int i = 0; i < nizRecenica.length; i++) {
            if (nizRecenica[i].equalsIgnoreCase(s)) {
                brPon += 1;
            }

        }
        return brPon;

    }

    //6. zadatak
    public static int[] pomeriNule(int[] niz) {
        int[] nizSaNulamaNaKraju = new int[niz.length];
        for (int i = 0, j = 0; i < niz.length; i++) {
            if (niz[i] == 0) {
                continue;
            } else {
                nizSaNulamaNaKraju[j] = niz[i];
                j++;
            }
        }
        return nizSaNulamaNaKraju;

    }

    //7. zadatak
    public static int[] izbaciDuplikate(int[] niz) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < niz.length; i++) {
            set.add(niz[i]);
        }
        int[] bezDuplikata = new int[set.size()];
        int j = 0;
        for (Integer a:set) {
            bezDuplikata[j++] = a;
        }
        return bezDuplikata;

    }

    //8. zadatak
    public static int[][] powerSet(int[] niz) {
        int[] bezDuplikata = izbaciDuplikate(niz); //izbaciDuplikat metoda iz zadatka br.7
        int[][] krajnjiNiz = new int[(int) Math.pow(2, bezDuplikata.length) - 1][];
        for (int i = 0; i < Math.pow(2, bezDuplikata.length) - 1; i++) {
            String indikatorNiz = toBinary(i); // toBinary metoda iz zadatka br.4
            while (indikatorNiz.length() < bezDuplikata.length) {
                indikatorNiz = "0" + indikatorNiz;
            }
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j < bezDuplikata.length; j++) {
                if (indikatorNiz.charAt(j) == '1') {
                    set.add(bezDuplikata[j]);
                }
            }
            int[] podNiz = new int[set.size()];
            int j = 0;
            for (Integer a : set) {
                podNiz[j++] = a;
            }
            krajnjiNiz[i] = podNiz;
        }
        return krajnjiNiz;
    }

    //9. zadatak
    public static boolean validatePhone(String num) {
        boolean formatSePoklapa;
        if (num.matches("^\\(\\d{3}\\) \\d{3}\\-\\d{4}$")) {
            formatSePoklapa = true;
        } else if (num.matches("^\\d{3}\\-\\d{3}\\-\\d{4}$")) {
            formatSePoklapa = true;}
        else {formatSePoklapa = false; }

        return formatSePoklapa;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(unosIntNiza()));
        System.out.println(Arrays.toString(unosStringNiza()));
        System.out.println(Arrays.toString(unosCharNiza()));
        System.out.println(zbirCifara(1234));
        System.out.println(stepenBroja(125, 5));
        System.out.println(Arrays.toString(zbirIndexaNizaMeta(new int[]{2, 7, 10, -2}, 5)));
        System.out.println(toBinary(10));
        System.out.println(brojPonavljanja("godina", "Na koliko neprestupnih Godina, dolazi jedna prestupna godina?"));
        System.out.println(Arrays.toString(pomeriNule(new int[]{1, 0, 0, 2, 3})));
        System.out.println(Arrays.toString(izbaciDuplikate(new int[]{3, 4, 3, 4, 3, 4, 5})));
        //8. zadatak:
        int[] niz = {1, 2, 3};
        int[][] podnizovi = powerSet(niz);
        for (int i = 0; i < podnizovi.length; i++) {
            System.out.print(Arrays.toString(podnizovi[i])+" ");
        }
        System.out.println();
        //9. zadatak:
        System.out.println(validatePhone("(123) 123-4567"));
        System.out.println(validatePhone("123-123-4567"));
        System.out.println(validatePhone("123 123 4567"));
    }
}

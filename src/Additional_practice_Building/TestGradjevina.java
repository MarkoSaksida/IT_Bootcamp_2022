package Additional_practice_Building;

import java.util.ArrayList;

public class TestGradjevina {
    public static void main(String[] args) {
        ArrayList<Radnik> radnici = new ArrayList<>();

        Radnik radnik1 = new Fizikalac(1, "Pera", 100, 1);
        Radnik radnik2 = new Fizikalac(2, "Mika", 105, 2);
        Radnik radnik3 = new Fizikalac(3, "Laza", 110, 3);
        Radnik radnik4 = new SefSmene(4, "Milan", 200, 1);
        Radnik radnik5 = new SefSmene(5, "Petar", 205, 2);
        Radnik radnik6 = new SefSmene(6, "Stefan", 210, 3);
        Radnik radnik7 = new Masinovodja(7, "Mica", 150, 1);
        Radnik radnik8 = new Masinovodja(8, "Todor", 155, 2);
        Radnik radnik9 = new Masinovodja(9, "Ivan", 160, 3);
        Radnik radnik10 = new Masinovodja(10, "Milutin", 160, 3);

        radnici.add(radnik1);
        radnici.add(radnik2);
        radnici.add(radnik3);
        radnici.add(radnik4);
        radnici.add(radnik5);
        radnici.add(radnik6);
        radnici.add(radnik7);
        radnici.add(radnik8);
        radnici.add(radnik9);

        Gradjevina g = new Gradjevina(radnici);

//        System.out.println(radnici);
//        for (Radnik nekiRadnik : radnici) {
//            nekiRadnik.povisica();
//        }
//        System.out.println(radnici);

//        System.out.println(radnici);
//        g.dajOtkazPrvojSmeniFizikalaca();
//        System.out.println(radnici);

//        System.out.println(g.jeRadnik(radnik10));
//
//        System.out.println(g.ukupnaPlataRadnikaDrugeSmene());

//        System.out.println(g.dobroPlaceni(200));
    }
}

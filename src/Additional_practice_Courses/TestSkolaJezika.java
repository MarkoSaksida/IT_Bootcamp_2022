package Additional_practice_Courses;

import java.util.ArrayList;

public class TestSkolaJezika {

    public static void main(String[] args) {

        ArrayList<Polaznik> polazniciEO = new ArrayList<>();
        ArrayList<Polaznik> polazniciES = new ArrayList<>();
        ArrayList<Polaznik> polazniciEN = new ArrayList<>();
        ArrayList<Polaznik> polazniciFO = new ArrayList<>();
        ArrayList<Polaznik> polazniciFS = new ArrayList<>();
        ArrayList<Polaznik> polazniciFN = new ArrayList<>();
        ArrayList<Kurs> kursevi = new ArrayList<>();

        Polaznik polaznik1 = new Polaznik("Ivan", 1990);
        Polaznik polaznik2 = new Polaznik("Maja", 1990);
        Polaznik polaznik3 = new Polaznik("Jovan", 1990);
        Polaznik polaznik4 = new Polaznik("Sasa", 1990);
        Polaznik polaznik5 = new Polaznik("Nadja", 1990);
        Polaznik polaznik6 = new Polaznik("Sara", 1990);
        Polaznik polaznik7 = new Polaznik("Jelena", 1990);
        Polaznik polaznik8 = new Polaznik("Marko", 1990);
        Polaznik polaznik9 = new Polaznik("Srdjan", 1990);
        Polaznik polaznik10 = new Polaznik("Ivica", 1990);
        Polaznik polaznik11 = new Polaznik("Ana", 1990);
        Polaznik polaznik12 = new Polaznik("Marija", 1990);

        polazniciEO.add(polaznik1);
        polazniciEO.add(polaznik2);
        polazniciES.add(polaznik3);
        polazniciES.add(polaznik4);
        polazniciES.add(polaznik5);
        polazniciEN.add(polaznik6);
        polazniciFO.add(polaznik7);
        polazniciFO.add(polaznik8);
        polazniciFO.add(polaznik9);
        polazniciFS.add(polaznik10);
        polazniciFN.add(polaznik11);
        polazniciFN.add(polaznik12);

        Kurs eO = new Kurs("engleski", "osnovni", polazniciEO);
        Kurs eS = new Kurs("engleski", "srednji", polazniciES);
        Kurs eN = new Kurs("engleski", "napredni", polazniciEN);
        Kurs fO = new Kurs("francuski", "osnovni", polazniciFO);
        Kurs fS = new Kurs("francuski", "srednji", polazniciFS);
        Kurs fN = new Kurs("francuski", "napredni", polazniciFN);

        kursevi.add(eO);
        kursevi.add(eS);
        kursevi.add(eN);
        kursevi.add(fO);
        kursevi.add(fS);
        kursevi.add(fN);

        SkolaJezika sJ = new SkolaJezika(kursevi);

        System.out.println(sJ.najnaprednijiJezik());

//        System.out.println(kursevi);
//        sJ.unaprediGrupu("engleski", "osnovni");
//        System.out.println(kursevi);

//        System.out.println(kursevi);
//        sJ.ukloni("engleski");
//        System.out.println();
//        System.out.println(kursevi);

    }
}

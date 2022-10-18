package D_16_Restaurant;

import java.util.ArrayList;

public class Restoran {

    private ArrayList<Zaposleni> zaposleni;

    public Restoran(ArrayList<Zaposleni> zaposleni) {
        this.zaposleni = zaposleni;
    }

    public ArrayList<Zaposleni> stampajKonobare(int nekaSmena) {
        ArrayList<Zaposleni> izlaznaLista = new ArrayList<>();
        for(Zaposleni k : this.zaposleni) {
            if (k.getSmena() == nekaSmena && k instanceof Konobar) {
                izlaznaLista.add(k);
            }
        }
        return izlaznaLista;
    }


    public void povecajCenuTrecojSmeni(ArrayList<Zaposleni> zaposleni) {
        for(Zaposleni z : this.zaposleni) {
            if(z.getSmena() == 3) {
                z.setDnevnica(z.getDnevnica() * 1.3);
            }
        }
    }



    public static void main(String[] args) {
        ArrayList<Zaposleni> zaposleni = new ArrayList<>();
        Zaposleni konobar1 = new Konobar("Milan", "konobar", 1993, 30, 8, 1);
        Zaposleni konobar2 = new Konobar("Ivana", "konobarica", 1995, 30, 8, 2);
        Zaposleni konobar3 = new Konobar("Stefan", "konobar", 1990, 30, 8, 3);
        Zaposleni kuvar1 = new Kuvar("Ana", "kuvarica", 1996, 20, 8, 1);
        Zaposleni kuvar2 = new Kuvar("Jovan", "kuvar", 1991, 20, 8, 2);
        Zaposleni kuvar3 = new Kuvar("Milica", "kuvarica", 1998, 20, 8, 3);
        zaposleni.add(konobar1);
        zaposleni.add(konobar2);
        zaposleni.add(konobar3);
        zaposleni.add(kuvar1);
        zaposleni.add(kuvar2);
        zaposleni.add(kuvar3);

        System.out.println("Lista svih zaposlenih u restoranu: ");
        System.out.println(zaposleni);
        System.out.println();

        int nekaSmena = 2;
        System.out.println("Lista svih konobara u restoranu koji rade u " + nekaSmena + "smeni");
        Restoran konobari = new Restoran(zaposleni);
        ArrayList<Zaposleni> konobariSmene = konobari.stampajKonobare(nekaSmena);
        System.out.println(konobariSmene);
        System.out.println();

        System.out.println("Lista svih zaposlenih nakon dizanja plata 30% onima koji rade u 3. smeni:");
        Restoran restoran  = new Restoran(zaposleni);
        restoran.povecajCenuTrecojSmeni(zaposleni);
        System.out.println(zaposleni);

    }

}

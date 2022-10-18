import java.util.ArrayList;

public class ZadaciAutomobili {

    //public ArrayList<Automobil> cenaManja(int svotaNovca) - metod koji ce da vraca sve Automobile koji imaju manju cenu od "svotaNovca"
    //public ArrayList<Automobil> sviBeli(ArrayList<Autmobil> automobili) - metod koji ce da stampa sve Automobile bele boje
    //Klasa Mercedes i BMW nasledjuju klasu Automobil

    public static ArrayList<Automobil> cenaManja(ArrayList<Automobil> automobili, int svotaNovca) {
        ArrayList<Automobil> izlaznaLista = new ArrayList<>();
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getCena() < svotaNovca) {
                izlaznaLista.add(automobili.get(i));
            }
        }
        return izlaznaLista;
    }

    public static ArrayList<Automobil> sviBeli(ArrayList<Automobil> automobili) {
        ArrayList<Automobil> izlaznaLista = new ArrayList<>();
        for (int i = 0; i < automobili.size(); i++) {
            if (automobili.get(i).getBoja() == "bela") {
                izlaznaLista.add(automobili.get(i));
            }
        }
        return izlaznaLista;
    }

    public static void main(String[] args) {
        Automobil mercedes1 = new Mercedes( "crvena", 123, 1990, 10000);
        Automobil mercedes2 = new Mercedes( "bela", 231, 1995, 12000);
        Automobil mercedes3 = new Mercedes( "bela", 321, 2020, 20000);
        Automobil bmw1 = new BMW("crna", 123, 1990, 10000);
        Automobil bmw2 = new BMW("bela", 231, 1995, 16000);
        Automobil bmw3 = new BMW("bela", 321, 2020, 20000);

        ArrayList<Automobil> automobili = new ArrayList<>();
        automobili.add(mercedes1);
        automobili.add(mercedes2);
        automobili.add(mercedes3);
        automobili.add(bmw1);
        automobili.add(bmw2);
        automobili.add(bmw3);

        System.out.println("Ulazna lista automobila je:");
        for(Automobil a : automobili) {System.out.println(a);}
        System.out.println();

        System.out.println("Automobili koji su old timeri imaju nove cene:");
        for(Automobil a : automobili) {
            a.oldTimer();
            System.out.println(a);}
        System.out.println();

        int zadajCenu = 15000;
        System.out.println("Automobili ispod zadate cene od " + zadajCenu + " su:");
        ArrayList<Automobil> autiIspod = cenaManja(automobili, zadajCenu);
        for(Automobil a : autiIspod) {System.out.println(a);}

        System.out.println();
        System.out.println("Automobili bele boje su:");
        ArrayList<Automobil> beliAuti = sviBeli(automobili);
        for(Automobil a : beliAuti) {System.out.println(a);}
    }

}


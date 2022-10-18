package D_18_Marko_Saksida_Groceries;

import java.util.ArrayList;

public class Korpa implements Racun {
    private ArrayList<Namirnica> namirnice = new ArrayList<>();

    public Korpa() {
    }

    @Override
    public void printNamirnice() {
        for (Namirnica namirnicaIzKorpe : namirnice) {
            System.out.println(namirnicaIzKorpe);
        }
    }

    @Override
    public double printRacun() {
        double suma = 0;
        for (Namirnica namirnicaIzKorpe : namirnice) {
            suma += namirnicaIzKorpe.getCena();
        }
        return suma;
    }

    @Override
    public boolean jeNaSpisku(Namirnica n) {
        for (Namirnica namirnicaIzKorpe : namirnice) {
            if (namirnicaIzKorpe.getNaziv().equals(n.getNaziv())){
             return true;
            }
        }
        return false;
    }

    public void dodajNamirnicu(Namirnica namirnica) {
        namirnice.add(namirnica);
    }
}

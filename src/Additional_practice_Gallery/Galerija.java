package Additional_practice_Gallery;

import java.util.ArrayList;
import java.util.Collections;

//Klasa Galerija sadrzi niz umetnika.
//
//Klasa takodje sadrzi sledece metode:
//metod koji vraca umetnika sa najstarijim delom,
//metod koji izracunava i ispisuje prosecnu vrednost dela svih umetnika,
//** void sortiraj() - sortiraj umetnike po vrednosti (od najmanjeg ka najvecem);
public class Galerija {
    private ArrayList<Umetnik> umetnici;

    public Galerija(ArrayList<Umetnik> umetnici) {
        this.umetnici = umetnici;
    }

    public String umetnikSaNajstarijimDelom() {
        String umetnikZaPoredjene = "";
        int najstarijeGodisteDela = Integer.MAX_VALUE;
        for(Umetnik umetnik : umetnici) {
            for (UmetnickoDelo godisteDelaKojeSePoredi : umetnik.getDela()) {
                if (godisteDelaKojeSePoredi.getGodinaNastanka() < najstarijeGodisteDela) {
                    najstarijeGodisteDela = godisteDelaKojeSePoredi.getGodinaNastanka();
                    umetnikZaPoredjene = umetnik.getIme();
                }
            }
        }
        return umetnikZaPoredjene;
    }

    public double prosecnaVrednostDela() {
        int brojac = 0;
        double sumaCenaDela = 0;
        for (Umetnik umetnik : umetnici) {
            brojac += umetnik.getBrojDela();
            for (UmetnickoDelo cena : umetnik.getDela()) {
                sumaCenaDela = sumaCenaDela + cena.getCena();

            }
        }
        return sumaCenaDela / brojac;
    }

    public void sortUmetniciPoVrednostiDela() {
        Collections.sort(umetnici);
    }

}

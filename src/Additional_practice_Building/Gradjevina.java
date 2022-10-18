package Additional_practice_Building;

import java.util.ArrayList;

//Klasa Gradjevina implementira interfejs Posao i ima:
//-ArrayList<Radnik> radnici
public class Gradjevina implements Posao {

    private ArrayList<Radnik> radnici;

    public Gradjevina(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    @Override
    public void dajOtkazPrvojSmeniFizikalaca() {
        for (int i = 0; i < radnici.size(); i++) {
            if (radnici.get(i) instanceof Fizikalac) {
                if (radnici.get(i).getSmena() == 1) {
                    radnici.remove(radnici.get(i));
                }
            }
        }
    }

    @Override
    public boolean jeRadnik(Radnik r) {
        for (Radnik nekiRadnik : radnici) {
            if (nekiRadnik.getIme().equalsIgnoreCase(r.getIme())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double ukupnaPlataRadnikaDrugeSmene() {
        double ukupnaPlataDrugeSmene =0;
        for (Radnik nekiRadnik : radnici) {
            if (nekiRadnik.getSmena() == 2) {
                ukupnaPlataDrugeSmene = ukupnaPlataDrugeSmene + nekiRadnik.getPlata();
            }
        }
        return ukupnaPlataDrugeSmene;
    }

    @Override
    public ArrayList<Radnik> dobroPlaceni(double suma) {
        ArrayList<Radnik> dobroPlaceniRadnici = new ArrayList<>();
        for (Radnik nekiRadnik : radnici) {
            if (nekiRadnik.getPlata() > suma) {
                dobroPlaceniRadnici.add(nekiRadnik);
            }
        }
        return dobroPlaceniRadnici;
    }
}

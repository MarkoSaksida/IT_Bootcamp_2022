package Additional_practice_Courses;
//Skola Jezika implementira interfejs Izmene i ima:
//-listaKurseva(ArrayList<Kurs>())
import java.util.ArrayList;

public class SkolaJezika implements Izmene {
    private ArrayList<Kurs> listaKurseva;

    public SkolaJezika(ArrayList<Kurs> listaKurseva) {
        this.listaKurseva = listaKurseva;
    }


    @Override
    public String najnaprednijiJezik() {
        int maxBrPolaznika = 0;
        String jezikMaxPolaznika = "";
        for (Kurs kurs : listaKurseva) {
           if (kurs.getNivo().equalsIgnoreCase("napredni")) {
               if (kurs.getPolaznici().size() > maxBrPolaznika) {
                   maxBrPolaznika = kurs.getPolaznici().size();
                   jezikMaxPolaznika = kurs.getJezik();
               }
           }
        }
        return jezikMaxPolaznika;
    }

    @Override
    public void unaprediGrupu(String jezik, String nivo) {
        for (Kurs kurs : listaKurseva) {
            if (kurs.getJezik().equalsIgnoreCase(jezik)) {
                if (kurs.getNivo().equalsIgnoreCase("osnovni") && nivo.equalsIgnoreCase("osnovni")) {
                    kurs.setNivo("srednji");
                }
                else if (nivo.equalsIgnoreCase("srednji") && nivo.equalsIgnoreCase("srednji")) {
                    kurs.setNivo("napredni");
                }
            }
        }
        for (int i = 0; i < listaKurseva.size()-1; i++) {
            for (int j = i+1; j < listaKurseva.size(); j++) {
                if (listaKurseva.get(i).getJezik().equals(listaKurseva.get(j).getJezik())) {
                    if (listaKurseva.get(i).getNivo().equals((listaKurseva.get(j).getNivo()))) {
                        System.out.println("Kurseve " + listaKurseva.get(i).getJezik() + listaKurseva.get(i).getNivo() + " treba spojiti.");
                    }
                }

            }



        }

    }

    @Override
    public void ukloni(String jezik) {
        ArrayList<Kurs> kurseviKlon = new ArrayList<>(listaKurseva);
        for (Kurs kurs : kurseviKlon) {
            if (kurs.getJezik().equalsIgnoreCase(jezik)) {
                listaKurseva.remove(kurs);
            }
        }
    }
}

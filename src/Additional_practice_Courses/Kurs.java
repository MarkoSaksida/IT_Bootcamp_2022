package Additional_practice_Courses;
//Klasom Kurs predstavljen je jedan kurs u skoli jezika. Ova klasa kao atribute ima
//
//jezik (String),
//nivo (String) - moze imati vrednosti osnovni, srednji i napredni (set metoda ne dozvoljava neku drugu vrednost, setuju se samo ispravne vrednosti, ili osnovni ako vrednost nije ispravna),
//polaznici(ArrayList<Polaznik>)
//
//Klasa jos sadrzi i
//
//konstruktor koji inicijalizuje sve atribute,
//get i set metode za svaki atribut,
//toString() metod.
import java.util.ArrayList;

public class Kurs {
    private String jezik;
    private String nivo;
    private ArrayList<Polaznik> polaznici;

    public Kurs(String jezik, String nivo, ArrayList<Polaznik> polaznici) {
        this.jezik = jezik;
        this.nivo = nivo;
        this.polaznici = polaznici;
    }

    //region getters setters
    public String getJezik() {
        return jezik;
    }

    public void setJezik(String jezik) {
        this.jezik = jezik;
    }

    public String getNivo() {
        return nivo;
    }

    public void setNivo(String nivo) {
        if ((nivo.equalsIgnoreCase("osnovni")) || (nivo.equalsIgnoreCase("srednji")) || (nivo.equalsIgnoreCase("napredni"))) {
            this.nivo = nivo;
        } else {this.nivo = "osnovni";}

    }

    public ArrayList<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(ArrayList<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    //endregion

    @Override
    public String toString() {
        return System.lineSeparator() + "{" +
                "jezik='" + jezik +
                ", nivo='" + nivo +
                ", polaznici=" + polaznici +
                '}';
    }
}

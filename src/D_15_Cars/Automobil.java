import java.util.ArrayList;

public class Automobil {
    private String marka;
    private String boja;
    private int brSasije;
    private int godiste;
    private int cena;

    public Automobil(String marka, String boja, int brSasije, int godiste, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.brSasije = brSasije;
        this.godiste = godiste;
        this.cena = cena;
    }

    //region getters
    public String getMarka() {
        return marka;
    }

    public String getBoja() {
        return boja;
    }

    public int getBrSasije() {
        return brSasije;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getCena() {
        return cena;
    }
    //endregion

    //region setters
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void setBrSasije(int brSasije) {
        this.brSasije = brSasije;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    //endregion

    //region toString
    @Override
    public String toString() {
        return "Automobil{" +
                "marka='" + marka + '\'' +
                ", boja='" + boja + '\'' +
                ", brSasije=" + brSasije +
                ", godiste=" + godiste +
                ", cena=" + cena +
                '}';
    }
    //endregion

    public void oldTimer() {

    }

}

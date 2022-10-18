package D_16_Restaurant;

public class Zaposleni {
    private String ime;
    private String pozicija;
    private int godiste;
    private double dnevnica;
    private int sati;
    private int smena; //1,2 ili 3

    public Zaposleni(String ime, String pozicija, int godiste, double dnevnica, int sati, int smena) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.godiste = godiste;
        this.dnevnica = dnevnica;
        this.sati = sati;
        this.smena = smena;
    }

    //region getters
    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodiste() {
        return godiste;
    }

    public double getDnevnica() {
        return dnevnica;
    }

    public int getSati() {
        return sati;
    }

    public int getSmena() {
        return smena;
    }
    //end region

    //region setters
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public void setDnevnica(double dnevnica) {
        this.dnevnica = dnevnica;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }
    //endregion

    @Override
    public String toString() {
        return System.lineSeparator() + "Ime zaposlenog: " + ime + ", pozicija: " + pozicija + ", godiste: " + godiste + ", dnevnica: " + dnevnica + "eur, sati: " + sati + ", smena: " + smena;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Zaposleni)) {
            return false;
        }

        Zaposleni zaposleni = (Zaposleni) object;

        return this.getIme().equals(zaposleni.getIme()) &&
                this.getPozicija().equals(zaposleni.getPozicija()) &&
                this.getGodiste() == zaposleni.getGodiste() &&
                this.getDnevnica() == zaposleni.getDnevnica() &&
                this.getSati() == zaposleni.getSati() &&
                this.getSmena() == zaposleni.getSmena();

    }

}

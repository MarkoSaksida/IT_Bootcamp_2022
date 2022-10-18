public class Voce {
    private String ime;
    private String sezona;
    private double cenaZaKilogram;
    private String boja;

    public Voce(String ime, String sezona, double cenaZaKilogram, String boja) {
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
    }

    //region getters
    public String getIme() {
        return ime;
    }

    public String getSezona() {
        return sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }

    //endregion
    //region setters
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setSezona(String sezona) {
        this.sezona = sezona;
    }

    public void setCenaZaKilogram(double cenaZaKilogram) {
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    //endregion

    public boolean jeSezona(String sezona) {
        boolean daLiJeSezona = false;
        if (sezona.equalsIgnoreCase(getSezona())) {
            daLiJeSezona = true;
        }
        return daLiJeSezona;
    }

    public int sumaVoca(double pare) {
        int kolicinaVoca = (int) (pare / getCenaZaKilogram());
        return kolicinaVoca;
    }

    public void promenaCene() {

    }


}

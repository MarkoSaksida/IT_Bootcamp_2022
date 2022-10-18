package Additional_practice_Gallery;
//Klasom UmetnickoDelo se opisuje jedno umetnicko delo u prodajnoj galeriji. Svako delo odredjuju njegov naziv (String), godina nastanka (int) i cena (double, u evrima).
//Klasa sadrzi i konstruktor koji inicijalizuje sva polja, get metode i toString() metod.
public class UmetnickoDelo {
    private String naziv;
    private int godinaNastanka;
    private double cena;

    public UmetnickoDelo(String naziv, int godinaNastanka, double cena) {
        this.naziv = naziv;
        this.godinaNastanka = godinaNastanka;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaNastanka() {
        return godinaNastanka;
    }

    public void setGodinaNastanka(int godinaNastanka) {
        this.godinaNastanka = godinaNastanka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "UmetnickoDelo{" +
                "naziv='" + naziv + '\'' +
                ", godinaNastanka=" + godinaNastanka +
                ", cena=" + cena +
                '}';
    }
}

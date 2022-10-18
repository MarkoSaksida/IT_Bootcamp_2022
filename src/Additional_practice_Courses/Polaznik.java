package Additional_practice_Courses;
//Klasa Polaznik:
//-ime (String)
//- godiste(int)
public class Polaznik {
    private String ime;
    private int godiste;

    public Polaznik(String ime, int godiste) {
        this.ime = ime;
        this.godiste = godiste;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + '{' +
                "ime = " + ime +
                ", godiste =" + godiste +
                '}';
    }
}

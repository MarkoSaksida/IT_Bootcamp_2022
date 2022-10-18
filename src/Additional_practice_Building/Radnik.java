package Additional_practice_Building;
//Napraviti klasu Radnik
//-int id
//-String ime
//-double plata
//-int smena
//
//Klasa takodje definise metod:
//void povisica()
public class Radnik {
    public int id;
    public String ime;
    public double plata;
    public int smena;

    public Radnik(int id, String ime, double plata, int smena) {
        this.id = id;
        this.ime = ime;
        this.plata = plata;
        this.smena = smena;
    }
    //region getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getSmena() {
        return smena;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }
    //endregion

    @Override
    public String toString() {
        return System.lineSeparator() +
                "id=" + id +
                ", ime='" + ime +
                ", plata=" + plata +
                ", smena=" + smena +
                '}';
    }

    public void povisica() {
    };

}

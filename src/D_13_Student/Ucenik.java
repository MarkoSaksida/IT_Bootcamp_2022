package D_13_Student;

public class Ucenik {
    private String ime;
    private String prezime;
    private int godine;
    private int[] ocene;

    public Ucenik(String ime, String prezime, int godine, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ocene = ocene;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public int[] getOcene() {
        return ocene;
    }

    public void setOcene(int[] ocene) {
        this.ocene = ocene;
    }

    public static String notifikacija(int[] ocene) {
        String upozorenje = "";
        int brojacJedinica = 0;
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1) {
                brojacJedinica++;
                upozorenje = "D_13.Ucenik ima jedinice, i to " + brojacJedinica;
            }

        }
        return upozorenje;

    }

    public static double prosek(int[] ocene) {
        double suma = 0;
        for (int i = 0; i < ocene.length; i++) {
            suma = suma + ocene[i];
        }
        return suma / ocene.length;
    }

    public static void main(String[] args) {
        Ucenik milan = new Ucenik("Milan", "Milankovic", 17, new int[]{2, 3, 1, 1, 4});
        System.out.println(notifikacija(milan.getOcene()));
        System.out.println("Ucenikov prosek je: " + prosek(milan.getOcene()));
    }

}

public class Jagoda extends Voce {
    public Jagoda(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }
    @Override
    public void promenaCene() {
        if(getSezona() != "prolece") {
            setCenaZaKilogram(getCenaZaKilogram()*1.2);
        }
    }

    public static void main(String[] args) {
        Jagoda jagoda = new Jagoda("jagode", "prolece", 200, "crvena");

        assert jagoda.jeSezona("prolece") == true;
        assert jagoda.jeSezona("leto") == false;

        assert jagoda.sumaVoca(400) == 2;

        System.out.println(jagoda.getCenaZaKilogram());
        jagoda.setSezona("jesen");
        jagoda.promenaCene();
        System.out.println(jagoda.getCenaZaKilogram());

        System.out.println("Testovi za jagodu uspesno prosli");

    }

}

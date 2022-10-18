public class Breskva extends Voce {
    public Breskva(String ime, String sezona, double cenaZaKilogram, String boja) {
        super(ime, sezona, cenaZaKilogram, boja);
    }

    @Override
    public void promenaCene() {
        if(getBoja() == "zelena") {
            setCenaZaKilogram(getCenaZaKilogram()*0.85);
        }
    }

    public static void main(String[] args) {
        Breskva breskva = new Breskva("breskva", "leto", 100, "crvena");

        assert breskva.jeSezona("prolece") == false;
        assert breskva.jeSezona("leto") == true;

        assert breskva.sumaVoca(300) == 3;

        System.out.println(breskva.getCenaZaKilogram());
        breskva.setBoja("zelena");
        breskva.promenaCene();
        System.out.println(breskva.getCenaZaKilogram());

        System.out.println("Testovi za breskvu uspesno prosli");
    }




}

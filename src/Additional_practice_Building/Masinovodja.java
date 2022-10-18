package Additional_practice_Building;
//Klasa Masinovodja nasledjuje Radnik i dobija povisicu 25% ako radi 1 smenu
public class Masinovodja extends Radnik {
    public Masinovodja(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);


    }
    @Override
    public void povisica() {
        if(getSmena() == 1) {

            setPlata(getPlata() * 1.25);
        }

    }
}

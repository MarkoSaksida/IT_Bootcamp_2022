package Additional_practice_Building;
//Klasa Fizikalac nasledjuje Radnik i dobija povisicu od 20% ako radi 2 smenu
public class Fizikalac extends Radnik {

    public Fizikalac(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica() {
        if(getSmena() == 2) {

            setPlata(getPlata() * 1.2);
        }

    }
}

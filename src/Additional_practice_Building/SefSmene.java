package Additional_practice_Building;
//Klasa SefSmene nasledjuje Radnik, i dobija povisicu od 30% ukoliko radi 3 smenu
public class SefSmene extends Radnik {
    public SefSmene(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica() {
        if(getSmena() == 3) {

            setPlata(getPlata() * 1.3);
        }

    }
}

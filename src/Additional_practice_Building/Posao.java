package Additional_practice_Building;

import java.util.ArrayList;

//Interfejs posao definise metode:
//
//void dajOtkazPrvojSmeniFizikalaca() - izbacuje sa liste sve fizikalce koji rade prvu smenu
//
//boolean jeRadnik(Radnik r) - koji vraca true ako se radnik nalazi na spisku radnika
//
//double ukupnaPlataRadnikaDrugeSmene() - stampa ukupnu sumu novca koju zaradjuju svi radnici u drugoj smeni
//
// ArrayList<Radnik> dobroPlaceni(double suma) - vratiti listu radnika koji imaju platu vecu od suma
public interface Posao {

    void dajOtkazPrvojSmeniFizikalaca();

    boolean jeRadnik(Radnik r);

    double ukupnaPlataRadnikaDrugeSmene();

    ArrayList<Radnik> dobroPlaceni(double suma);
}

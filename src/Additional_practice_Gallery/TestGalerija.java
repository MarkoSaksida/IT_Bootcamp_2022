package Additional_practice_Gallery;

import java.util.ArrayList;

public class TestGalerija {
    public static void main(String[] args) {
        ArrayList<UmetnickoDelo> dela1 = new ArrayList<>();
        ArrayList<UmetnickoDelo> dela2 = new ArrayList<>();
        ArrayList<UmetnickoDelo> dela3 = new ArrayList<>();
        UmetnickoDelo delo1 = new UmetnickoDelo("galeb", 1986, 150);
        UmetnickoDelo delo2 = new UmetnickoDelo("livada", 1995, 160);
        UmetnickoDelo delo3 = new UmetnickoDelo("zamak", 2000, 190);
        UmetnickoDelo delo4 = new UmetnickoDelo("groteska", 1999, 200);
        UmetnickoDelo delo5 = new UmetnickoDelo("dama", 2001, 170);
        UmetnickoDelo delo6 = new UmetnickoDelo("gospodin", 2005, 140);
        UmetnickoDelo delo7 = new UmetnickoDelo("enterijer", 1998, 145);
        UmetnickoDelo delo8 = new UmetnickoDelo("japanska tresnja", 2004, 210);
        UmetnickoDelo delo9 = new UmetnickoDelo("lav", 1997, 195);
        dela1.add(delo1);
        dela1.add(delo2);
        dela1.add(delo3);
        dela2.add(delo4);
        dela2.add(delo5);
        dela3.add(delo6);
        dela3.add(delo7);

        ArrayList<Umetnik> umetnici = new ArrayList<>();
        Umetnik umetnik1 = new Umetnik("Salvador", dela1,  7);
        Umetnik umetnik2 = new Umetnik("Frida", dela2,  2 );
        Umetnik umetnik3 = new Umetnik("Pablo", dela3,  6 );
        umetnici.add(umetnik1);
        umetnici.add(umetnik2);
        umetnici.add(umetnik3);

        Galerija g = new Galerija(umetnici);

        System.out.println(umetnik1);
        System.out.println(umetnik1.izlozi(delo8));
        System.out.println(umetnik1);

        System.out.println(umetnik2);
        System.out.println(umetnik2.izlozi(delo9));
        System.out.println(umetnik2);

        System.out.println(umetnik3.vrednost());

        System.out.println(g.umetnikSaNajstarijimDelom());

        System.out.println(g.prosecnaVrednostDela());

        System.out.println(umetnici.toString());
        g.sortUmetniciPoVrednostiDela();
        System.out.println(umetnici.toString());




    }
}

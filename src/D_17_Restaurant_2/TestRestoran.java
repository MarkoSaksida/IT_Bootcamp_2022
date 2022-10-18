package D_17_Restaurant_2;

import java.util.ArrayList;

public class TestRestoran {
    public static void main(String[] args) {
        Jelo jelo1 = new Jelo("snicla", 800, "domaca");
        Jelo jelo2 = new Jelo("cevapi", 700, "domaca");
        Jelo jelo3 = new Jelo("pljeskavica", 700, "domaca");
        Jelo jelo4 = new Jelo("spagete", 800, "italijanska");
        Jelo jelo5 = new Jelo("lazanja", 900, "italijanska");
        ArrayList<Jelo> meni = new ArrayList<>();
        meni.add(jelo1);
        meni.add(jelo2);
        meni.add(jelo3);
        meni.add(jelo4);
        meni.add(jelo5);

        Restoran restoran1 = new Restoran("Bootcamp", meni, 3);

        System.out.println("Najskuplje jelo u restoranu " + restoran1.getNaziv() + " je:");
        System.out.println(restoran1.najskuplje());
        System.out.println();

        System.out.println("Broj slobodnih stolova pre rezervacije je: " + restoran1.getBrSlobodnihStolova());
        restoran1.rezervisiSto();
        restoran1.rezervisiSto();
        restoran1.rezervisiSto();
        restoran1.rezervisiSto();
        System.out.println("Broj slobodnih stolova posle rezervacije je: " + restoran1.getBrSlobodnihStolova());
        System.out.println();

        String vrstaJela = "italijanska";
        System.out.println("Jela iz odabrane vrste su:");
        restoran1.StampajNaziveJela(vrstaJela);

    }


}

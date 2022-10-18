package D_18_Marko_Saksida_Groceries;


public class TestKorpa {

    public static void main(String[] args) {
        Namirnica n1 = new Namirnica("mleko", 140);
        Namirnica n2 = new Namirnica("Coca Cola", 100);
        Namirnica n3 = new Namirnica("hleb", 60);
        Namirnica n4 = new Namirnica("zvake", 60);

        Korpa korpa = new Korpa();
        korpa.dodajNamirnicu(n1);
        korpa.dodajNamirnicu(n2);
        korpa.dodajNamirnicu(n3);

        System.out.println("Lista svih namirnica u korpi:");
        korpa.printNamirnice();
        System.out.println();

        System.out.println("Ukupan iznos racuna svih namirnica u korpi:");
        System.out.println(korpa.printRacun());
        System.out.println();

        System.out.println("Da li se namirnica " + n1.getNaziv() + " nalazi u korpi?");
        System.out.println(korpa.jeNaSpisku(n1));
        System.out.println("Da li se namirnica " + n4.getNaziv() + " nalazi u korpi?");
        System.out.println(korpa.jeNaSpisku(n4));
    }
}

package D_17_Restaurant_2;

import java.util.ArrayList;

public class Restoran implements Guzva {
    private String naziv;
    private ArrayList<Jelo> meni;
    private int brSlobodnihStolova;

    public Restoran(String naziv, ArrayList<Jelo> meni, int brSlobodnihStolova) {
        this.naziv = naziv;
        this.meni = meni;
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    //region getters setters
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Jelo> getMeni() {
        return meni;
    }

    public void setMeni(ArrayList<Jelo> meni) {
        this.meni = meni;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        this.brSlobodnihStolova = brSlobodnihStolova;
    }
    //endregion

    @Override
    public String toString() {
        return "Restoran{" +
                "naziv='" + naziv + '\'' +
                ", meni=" + meni +
                ", brSlobodnihStolova=" + brSlobodnihStolova +
                '}';
    }


    @Override
    public Jelo najskuplje() {
        double maxCena = 0;
        Jelo najskupljeJelo = null;
        for (Jelo a : this.meni) {
            if (a.getCena() > maxCena){
                maxCena = a.getCena();
                najskupljeJelo = a;
            }
        }
        return najskupljeJelo;
    }

    @Override
    public void rezervisiSto() {
        if (brSlobodnihStolova > 0) {
            brSlobodnihStolova -= 1;
            System.out.println("Sto je rezervisan.");
        } else if (brSlobodnihStolova == 0) {
            System.out.println("Nema slobodnih stolova.");
        }

    }

    @Override
    public void StampajNaziveJela(String vrsta) {
        for (Jelo a : this.meni) {
            if (a.getVrsta().equalsIgnoreCase(vrsta)) {
                System.out.println(a.getNaziv());
            }
        }

    }
}

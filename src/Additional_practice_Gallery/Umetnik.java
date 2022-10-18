package Additional_practice_Gallery;
//Klasa Umetnik opisuje jednog umetnika njegovim imenom (String), nizom njegovih dela i njihovim ukupnim brojem (int).
//Sva polja klase su privatna pa i za njih treba realizovati get metode. Osim toga treba kreirati konstruktor koji kao argumente prima ime umetnika kao i maksimalan broj dela koje on moze da
//izlozi u galeriji, i sledece metode:
//
//public boolean izlozi (UmetnickoDelo d) - dodaje delo u niz (ako ima mesta) i povecava se ukupan broj njegovih dela za 1.
//Logicka vrednost koju metod vraca je signal da je dodavanje uspelo ili nije.
//
//public double vrednost() - vraca vrednost izlozenih dela umetnika tako sto sabira vrednosti svih dela.

import java.util.ArrayList;

public class Umetnik implements Comparable<Umetnik> {
    private String ime;
    private ArrayList<UmetnickoDelo> dela;
    private int brojDela;
    private int maxBrojDela;


    public Umetnik(String ime, ArrayList<UmetnickoDelo> dela, int maxBrojDela) {
        this.ime = ime;
        this.dela = dela;
        this.brojDela = dela.size();
        this.maxBrojDela = maxBrojDela;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<UmetnickoDelo> getDela() {
        return dela;
    }

    public void setDela(ArrayList<UmetnickoDelo> dela) {
        this.dela = dela;
    }

    public int getBrojDela() {
        return brojDela;
    }

    public void setBrojDela(int brojDela) {
        this.brojDela = brojDela;
    }

    public int getMaxBrojDela() {
        return maxBrojDela;
    }

    public void setMaxBrojDela(int maxBrojDela) {
        this.maxBrojDela = maxBrojDela;
    }

    public boolean izlozi (UmetnickoDelo d) {
        boolean izlozeno = false;
        if (brojDela < maxBrojDela) {
            dela.add(d);
            brojDela++;
            izlozeno = true;
        }
        return izlozeno;
    }

    public double vrednost() {
        double suma = 0;
        for (UmetnickoDelo deloCena : dela) {
            suma += deloCena.getCena();
        }
        return suma;
    }

    @Override
    public int compareTo(Umetnik umetnikSaKojimSePoredi) {
        return Double.compare(this.vrednost(), umetnikSaKojimSePoredi.vrednost());
    }

    @Override
    public String toString() {
        return System.lineSeparator() +  "Ime umetnika: " + ime + ", umetnickaDela: " + dela + ", brojUmetnickihDela: " + brojDela;
    }

}


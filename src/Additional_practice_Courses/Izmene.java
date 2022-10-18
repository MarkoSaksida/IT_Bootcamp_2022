package Additional_practice_Courses;
//Jezik najnaprednijiJezik() - vraca jezik na cijem naprednom kursu ima najvise polaznika. Ako ima vise takvih jezika, metod vraca prvi na koji je naisao.
//void unaprediGrupu(String jezik, String nivo) - za zadati jezik i nivo povecava nivo kursa za jedan stepen (osnovni u srednji, srednji u napredni). Ukoliko je zadati nivo napredni,
//	ili ne postoji kurs sa unetim parametrima, metoda ne radi nista.
//	Ukoliko nakon povecanja postoje dva kursa za isti jezik i nivo, potrebno je ispisati poruku da je potrebno spojiti te dve grupe.
//void ukloni(String jezik) - ukloni odredjeni jezik iz liste
public interface Izmene {
    String najnaprednijiJezik();

    void unaprediGrupu(String jezik, String nivo);

    void ukloni (String jezik);
}

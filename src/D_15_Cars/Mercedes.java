import java.time.LocalDateTime;

public class Mercedes extends Automobil{
    public Mercedes(String boja, int brSasije, int godiste, int cena) {
        super("Mercedes", boja, brSasije, godiste, cena);
    }
    public void oldTimer() {
            if (LocalDateTime.now().getYear() - getGodiste() > 20) {
                setCena((int)(getCena() * 0.8));
            }
    }
}

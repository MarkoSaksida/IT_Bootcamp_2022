import java.time.LocalDateTime;

public class BMW extends Automobil{
    public BMW(String boja, int brSasije, int godiste, int cena) {
        super("BMW", boja, brSasije, godiste, cena);
    }
    public void oldTimer() {
        if (LocalDateTime.now().getYear() - getGodiste() > 25) {
            setCena((int)(getCena() * 0.7));
        }
    }
}

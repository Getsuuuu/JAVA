import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Zapis zap = new Zapis();
        zap.zapis("ala.txt");
        // Tutaj jest tak że podajecie nazwe pliku do jakiego ma zapisać
        Wczytywanie wcz = new Wczytywanie();
        wcz.wczytywanie("ala.txt");
        // Tutaj jest tak że wczytuje z pliku tekst i go wyświetla tam nadole w konsoli
    }
}

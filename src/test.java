import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Zapisksiazki zap = new Zapisksiazki();
        //zap.zapisz();
        // Tutaj jest tak że po zrobieniu metody zapisz podajesz dane i dodaje ci do pliku ksiazki.txt co wpisałeś
        Wczytajksiazki wcz = new Wczytajksiazki();
        wcz.szukaj("3");
        // Tutaj jest tak że wczytuje z pliku ale tylko po id bo nie mam pojęcia jak zrobić żeby czytało norlamnie np po kategori ale cofało się na sam początem tej lini
        // i pisało wszystko tak jak teraz
    }
}
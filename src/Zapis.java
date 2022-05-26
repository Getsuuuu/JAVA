import java.io.*;
import java.util.Scanner;

public class Zapis{
    public void zapis(String nazwa) throws IOException {
        FileWriter zapis = new FileWriter("pliki/"+nazwa);
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz tekst ktory zapiszesz w pliku");
        String tekst= scan.nextLine();
        zapis.write(tekst);
        zapis.close();
        System.out.println("Udało się zapisać do pliku");
    }
}
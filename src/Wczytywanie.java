import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wczytywanie {
    public void wczytywanie(String nazwa) throws FileNotFoundException {
        File file = new File("pliki/"+nazwa);
        Scanner in = new Scanner(file);
        String zdanie = in.nextLine();
        System.out.println("W twoim pliku znajduje się");
        System.out.println(zdanie);
    }
}

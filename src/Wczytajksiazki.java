import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wczytajksiazki {
    private static Scanner x;
    public static void szukaj(String znajdz){
        boolean znalazlo= false;
        String id = ""; String autor= "";String nazwa = "";String kategoria = "";String status = "";

        try{
            x = new Scanner(new File("pliki/ksiazki.txt"));
            x.useDelimiter("[,\n]");

            while (x.hasNext() && !znalazlo){
                id = x.next();
                autor = x.next();
                nazwa = x.next();
                kategoria = x.next();
                status = x.next();

                if (id.equals(znajdz)){
                    znalazlo = true;
                }
            }

            if (znalazlo){
                System.out.println("id: "+id+"\nautor: "+autor+"\nnazwa: "+nazwa+"\nkategoria: "+kategoria+"\nstatus: "+status);
            }
            else{
                System.out.println("Nie znaleziono");
            }
        }
        catch (Exception E){
            System.out.println("Error");
        }
    }
}

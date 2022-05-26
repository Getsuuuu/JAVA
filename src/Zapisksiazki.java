import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zapisksiazki {
    public static void zapisz(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj id");
        String id = scan.nextLine();
        System.out.println("Podaj autora");
        String autor = scan.nextLine();
        System.out.println("Podaj Nazwe");
        String nazwa = scan.nextLine();
        System.out.println("Podaj Kategorie");
        String kategoria = scan.nextLine();
        System.out.println("Podaj status");
        String status = scan.nextLine();
        dodaj(id,autor,nazwa,kategoria,status);
    }
    public static void dodaj(String id,String autor,String nazwa,String kategoria,String status){
        try{
            FileWriter fw = new FileWriter("pliki/ksiazki.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(id+","+autor+","+nazwa+","+kategoria+","+status);
            pw.flush();
            pw.close();

            System.out.println("Dodano książkę");
        }
        catch(Exception E){
            System.out.println("Nie udało się dodac książki");
        }
    }
}
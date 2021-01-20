import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String al_imie = sc.next();
        System.out.print("Podaj nazwisko: ");
        String al_nazwisko = sc.next();
        System.out.println("Imię ma " + al_imie.length() + " liter, a nazwisko ma " + al_nazwisko.length() + " liter.");
    }
}
import java.util.Scanner;
import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Hasło ma składać się z:\n1 - liter\n2 - liter i liczb\n3 - liter, liczb i znaków specjalnych");
        int al_wybor = sc.nextInt();
        System.out.print("Długość hasła: ");
        int al_dlugosc = sc.nextInt();
        String al_alfabet = "abcdefghijklmnopqrstuvwxyz";
        String al_numery = "123456790";
        String al_znaki_specjalne = "!@#$%^&*(){}|;'<>?";
        String al_haslo = "";
        if(al_wybor == 1) {
            for(int i=0;i<al_dlugosc - 1;i++){
                int al_numer = rand.nextInt(24);
                al_haslo = Character.toString(al_alfabet.charAt(al_numer));
            }
        } else if (al_wybor == 2) {
            for(int i=0;i<al_dlugosc - 1;i++){
                int al_numer = rand.nextInt(10);
                al_haslo = Character.toString(al_numery.charAt(al_numer));
            }
        } else if (al_wybor == 3) {
            for(int i=0;i<al_dlugosc - 1;i++){
                int al_numer = rand.nextInt(19);
                al_haslo = Character.toString(al_znaki_specjalne.charAt(al_numer));
            }
        }
        System.out.println("Wygenerowane hasło: " + al_haslo);
    }
}
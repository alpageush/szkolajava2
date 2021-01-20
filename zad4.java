import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String al_slowo = sc.next();
        System.out.println(al_slowo.charAt(0) + " " + al_slowo.charAt(al_slowo.length() - 1));
    }
}
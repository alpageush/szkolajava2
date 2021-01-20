import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String al_zdanie = sc.nextLine();
        for(int i=0; i<al_zdanie.length(); i++) System.out.println(al_zdanie.charAt(i));
    }
}
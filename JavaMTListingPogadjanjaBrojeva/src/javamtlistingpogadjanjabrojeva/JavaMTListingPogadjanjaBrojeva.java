package javamtlistingpogadjanjabrojeva;

import java.util.Scanner;

public class JavaMTListingPogadjanjaBrojeva {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ponovo;  // indikator nastavka igre

        System.out.println("Ovo je igra pogadjanja brojeva.");
        System.out.println("ZXamisljen je broj izmedju 1 i 100");
        System.out.println("Pogodite koji je to broj: ");

        do {
            pogodiBroj(); // poziv metoda za pogadjanje broja
            System.out.println("Zelite li ponovo da igrate (d/n)?");
            ponovo = input.nextLine();
        } while (ponovo.equals("d"));
        System.out.println("Hvala i dovidjenja");

    }

    private static void pogodiBroj() {
        int zamisljenBroj; // broj koji je program izabrao
        int pokusanBroj; // broj koji je pokusan
        Scanner input = new Scanner(System.in);
        zamisljenBroj = (int) (100 * Math.random()) + 1;
        System.out.println("Pokusajte da ga pogodite\n");

        do {
            System.out.println("Pogodite broj: ");
            pokusanBroj = input.nextInt();
            if (pokusanBroj < zamisljenBroj) {
                System.out.println("Zamisljeni broj je veci od pokusanog broja");
            } else if (pokusanBroj > zamisljenBroj) {
                System.out.println("Zamisljeni broj je manji od pokusanog broja");
            } else {
                System.out.println("Bravo pogodili ste broj!!!!!");
            }

        } while (pokusanBroj != zamisljenBroj);

    }

}

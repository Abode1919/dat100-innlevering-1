package no.hvl.dat100;

public class O1 {

    public static void main(String[] args) {
        // Array med poengsummer for 10 studenta (inkluderer ugyldige)
        int[] poengsummer = {85, 105, -10, 67, 49, 38, 95, 61, 77, 89};

        for (int i = 0; i < poengsummer.length; i++) {
            int poeng = poengsummer[i];

            // Sjekk om poengsummen er gyldig, om ikkje, be om ny poengsum
            while (poeng < 0 || poeng > 100) {
                System.out.println("Student " + (i + 1) + " hadde ugyldig poengsum (" + poeng + "). Skriv inn en ny poengsum: ");
                poeng = 66; 
            }

            // Karakterberegning basert på gyldig poengsum
            System.out.print("Student " + (i + 1) + " - Poengsum: " + poeng + ", Karakter: ");

            if (poeng >= 90) {
                System.out.println("A");
            } else if (poeng >= 80) {
                System.out.println("B");
            } else if (poeng >= 60) {
                System.out.println("C");
            } else if (poeng >= 50) {
                System.out.println("D");
            } else if (poeng >= 40) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
        }
    }
}

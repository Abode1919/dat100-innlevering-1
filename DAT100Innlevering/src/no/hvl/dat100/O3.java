package no.hvl.dat100;

public class O3 {
    public static void main(String[] args) {

        int n = 6; // Du kan endre verdien her til kva  som helst positivt heiltall

        // Sjekk at n er større enn 0
        if (n <= 0) {
            System.out.println("Feil: n må være større enn 0.");
        } else {
            // Beregn fakultetet
            long fakultet = beregnFakultet(n);

            // Skriv ut resultatet
            System.out.println(n + "! = " + fakultet);
        }
    }

    // Funksjon for å beregne fakultet
    public static long beregnFakultet(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }
}


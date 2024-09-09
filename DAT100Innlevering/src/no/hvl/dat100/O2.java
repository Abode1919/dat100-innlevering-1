package no.hvl.dat100;

public class O2 {

    public static void main(String[] args) {
        int inntekt = 1350100;  // Eksempel på bruttoinntekt 
        double trinnskatt = 0; // Variabel for å lagre den totale beregnede trinnskatten

        // Trinn 5: Inntekt over 1 350 000 kr
        if (inntekt > 1350000) {
            trinnskatt += (inntekt - 1350000) * 0.176;  // Beregn 17,6 % av beløpet som overstiger 1 350 000 kr
            inntekt = 1350000; // Oppdater inntekten til maks for dette trinnet
        }
        
        // Trinn 4: Inntekt mellom 937 901 kr og 1 350 000 kr
        if (inntekt > 937900) {
            trinnskatt += (inntekt - 937900) * 0.166;  // Beregn 16,6 % av beløpet som overstiger 937 900 kr
            inntekt = 937900; // Oppdater inntekten til maks for dette trinnet
        }
        
        // Trinn 3: Inntekt mellom 670 001 kr og 937 900 kr
        if (inntekt > 670000) {
            trinnskatt += (inntekt - 670000) * 0.136;  // Beregn 13,6 % av beløpet som overstiger 670 000 kr
            inntekt = 670000; // Oppdater inntekten til maks for dette trinnet
        }
        
        // Trinn 2: Inntekt mellom 292 851 kr og 670 000 kr
        if (inntekt > 292850) {
            trinnskatt += (inntekt - 292850) * 0.04;  // Beregn 4,0 % av beløpet som overstiger 292 850 kr
            inntekt = 292850; // Oppdater inntekten til maks for dette trinnet
        }
        
        // Trinn 1: Inntekt mellom 208 051 kr og 292 850 kr
        if (inntekt > 208050) {
            trinnskatt += (inntekt - 208050) * 0.017;  // Beregn 1,7 % av beløpet som overstiger 208 050 kr
        }

        // Sjekk om det blei beregnet noke trinnskatt
        if (trinnskatt == 0) {
            System.out.println("Ingen trinnskatt");  // Om ingen skatt ble beregnet, skriv ut at det ikkje er trinnskatt
        } else {
            // Skriv ut det totale beløpet som skal betales i trinnskatt
            System.out.printf("Trinnskatt å betale: %.2f kroner\n", trinnskatt);
        }
    }
}

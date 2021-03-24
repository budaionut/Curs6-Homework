package ro.fasttrackit.curs6.homework;

import java.util.Arrays;
import java.util.Random;

public class HomeworkExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String fraza = "Prima propozitie.A doua propozitie.A treia propozitie.";

        System.out.println("---1. Functia care primeste un sir de numere intregi si returneaza suma lor---");
        System.out.println("Suma numerelor este: " + sumNumbers(numbers));

        System.out.println("---2. Functia care primeste un sir de numere intregi si returneaza numarul de elemente impare---");
        System.out.println("Sirul are un numar de " + elementeImpare(numbers) + " elemente impare");

        System.out.println("---3. Functia care primeste un sir de numere intregi si un alt numar intreg si returneaza toate numerele mai mari decat numarul primit");
        int[] numarMare = comparedElements(numbers, 4);
        for (int nr : numarMare) {
            if (nr > 0) {
                System.out.println(nr);
            }
        }

        System.out.println("4. O functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.");
        System.out.println("Felicitari, s-a ajuns la suma de " + sumDonatii(7000));

        System.out.println("5. Functia 4 rescrisa cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta se termina, campania se va incheia");
        System.out.println(nrDonatii(8000, 7));

        System.out.println("6. Scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua");
        propozitiiFraza(fraza);
    }

    public static int sumNumbers(int[] numere) {
        int suma = 0;
        for (int numar : numere) {
            suma = suma + numar;
        }
        return suma;
    }

    public static int elementeImpare(int[] numere) {
        int nrImpar = 0;
        for (int i = 0; i < numere.length; i++) {
            if (i % 2 != 0) {
                nrImpar++;
            }
        }
        return nrImpar;
    }

    public static int[] comparedElements(int numere[], int numarComparat) {
        int[] numereComparate = new int[numere.length];
        int j = 0;

        for (int i = 0; i < numere.length; i++) {
            if (numere[i] > numarComparat) {
                numereComparate[j] = numere[i];
                j++;
            }
        }
        int[] numereReturnate = Arrays.copyOf(numereComparate, j);
        return numereReturnate;
    }


    public static int sumDonatii(int targetDonatii) {
        int sumDonatie = 0;
        Random random = new Random();

        while (sumDonatie < targetDonatii) {
            int donatie = random.nextInt(1000);
            System.out.println("Suma donata este: " + donatie);
            sumDonatie = sumDonatie + donatie;
        }
        return sumDonatie;

    }

    public static int nrDonatii(int targetDonatii, int nrDonatii) {
        int sumDonatie = 0;
        Random random = new Random();
        int i = 0;

        while (sumDonatie < targetDonatii && i < nrDonatii) {
            int donatie = random.nextInt(1000);
            System.out.println("Suma donata este: " + donatie);
            sumDonatie = sumDonatie + donatie;
            i++;
        }
        if (sumDonatie < targetDonatii) {
            System.out.println("Suma donata este " + sumDonatie + ". Ne pare rau, nu s-a ajuns la suma dorita");
        } else {
            System.out.println("Felicitari, suma donata este : " + sumDonatie);
        }
        return sumDonatie;
    }

    public static void propozitiiFraza(String text) {
        String[] propozitii = text.split("\\.");
        for (String propozitie : propozitii) {
            System.out.println(propozitie + ".");
        }
    }
}

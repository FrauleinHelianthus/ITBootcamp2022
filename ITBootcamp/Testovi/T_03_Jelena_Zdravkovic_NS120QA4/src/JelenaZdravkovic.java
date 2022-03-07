import java.util.Arrays;
import java.util.Scanner;

/**
 * IT BOOTCAMP QA Novi Sad, 2021
 * Java, TEST 1
 * Oblasti: grananja, promenljive, petlje, nizovi, metode
 *
 * 1. Napraviti novi Java projekat u vasem IDE-u.
 * 2. U src folderu napravite klasu ImePrezime (npr. JovanJovanovic)
 * 3. Prekopirajte sadrzaj klase koju ste dobili u klasu koju ste napravili u koraku 2
 * 4. Promenite ime klase u vase ImePrezime
 * 5. Kada ste zavrsili rad kopirajte source code file ImePrezime.java na google drive itbootcamp-a u folder koji se zove JAVATEST1
 * Link do ankete gde stavljate file: https://forms.gle/TMoFnWqphsSWLZp27
 *
 *
 * Svaki od zadataka nosi isti broj poena. Maksimalan broj poena je 5, a mininalan 0.
 * Predvidjeno vreme za rad: 90 minuta.
 *
 * SRECNO!
 *
 * VAZNO: Ime vase klase mora biti formata CamelCase: ImePrezime {...}, npr: PeraPeric
 * NAPOMENA: Nemojte menjati potpise (parametre, return type i imena metoda).
 *           Metode koje budeti implementirali ce ocenjivati automatska skripta prema test case-vima,
 *           te je iz tog razloga bitno da ostanu ista.
 */
public class JelenaZdravkovic {

    /**
     * ZADATAK_1
     * Napisati funkciju koja ocenje zadati test latinicnim ocenama A, B, C, D, E, F u odnosu na broj poena na testu.
     * Funckija se ponasa na sledeci nacin:
     *
     * [0-50] : F
     * [51-60] : E
     * [61-70] : D
     * [71-80] : C
     * [81-90] : B
     * [91-100] : A
     *
     * @param brojPoena broj poena
     * @return ocena od A do F
     */
    public static String oceniTest(int brojPoena) {

        String ocenaOdADoF = "";

        if(brojPoena>=0 && brojPoena<=50) {
            ocenaOdADoF = "F";
        }
        else if (brojPoena>=51 && brojPoena <= 60) {
            ocenaOdADoF = "E";
        }
        else if (brojPoena>=61 && brojPoena <= 70) {
            ocenaOdADoF = "D";
        }
        else if (brojPoena>=71 && brojPoena <= 80) {
            ocenaOdADoF = "C";
        }
        else if (brojPoena>=81 && brojPoena <= 90) {
            ocenaOdADoF = "B";
        }else if (brojPoena>=91 && brojPoena <= 100) {
            ocenaOdADoF = "A";
        } else {
            System.out.println("Broj poena koji ste uneli nije validan.");
        }

        return ocenaOdADoF; //TODO
    }

    /**
     * ZADATAK_2
     * Napisi funckiju koja nalazi najveci broj u nizu.
     * Funckija se ponasa na sledeci nacin:
     * {1 ,2 ,3 ,4, 5} -> 5
     * {-100, 0, 100, 5} -> 100
     * {10} -> 10
     * {2, 1} -> 2
     *
     * @param array niz
     * @return najveci broj u nizu
     */
    public static int nadjiNajveciBroj(int[] array) {
        int najveciBrojUNizu = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > najveciBrojUNizu) {
                najveciBrojUNizu =array[i];
            }
        }
        return najveciBrojUNizu; //TODO
    }

    /**
     * ZADATAK_3
     * Napisi funkciju koja obrce string.
     * Funckija se ponasa na sledeci nacin:
     * -> itbootcamp : pmactoobti
     * -> hi : ih
     * -> abcd -> dcba
     *
     * hint: moze biti od koristi metoda String.join("", niz)
     * npr: niz = {"T", "e", "s", "t"}; String.join("", niz) -> "Test";
     *
     * @param s string kao parametar
     * @return obrnuti string
     */
    public static String obrniString(String s) {

        String[] noviS = s.split("");
        String[] noviObrnutiS = new String[noviS.length];
        // t-0 e-1 s-2 t-3
        for (int i = 0; i < noviS.length; i++) {
            noviObrnutiS[noviS.length -1 - i] = noviS[i];

        }
        String obrnutiString = String.join("",noviObrnutiS);

        return obrnutiString; //TODO
    }

    /**
     * ZADATAK_4
     * Napisi funkciju koja racuna sumu cifara broja
     * Funkcija se ponasa na sledeci nacin:
     * 1 -> 1
     * 12 -> 1 + 2 = 3
     * 123 -> 1 + 2 + 3 = 6
     * 1234 -> 1 + 2 + 3 + 4 = 10
     * 12345 -> 1 + 2 + 3 + 4 + 5 = 15
     *
     * @param n ceo broj
     * @return suma cifara brojeva
     */
    public static int sumaCifaraBroja(int n) {
        int sum = 0;
        String broj = n + "";
        String[] brojKaoNizStringova = broj.split("");
        for (int i = 0; i < brojKaoNizStringova.length; i++) {
            int brojInt = Integer.parseInt(brojKaoNizStringova[i]);
            sum = sum + brojInt;
        }



        return sum; //TODO
    }

    /**
     * ZADATAK_5
     * Napisi funckiju koja nalazi razliku nizova A i B, odnosno vraca niz svih elemenata u A koji se ne nalaze u B.
     * Funckija se ponasa na sledeci nacin:
     * {1 ,2 ,3}, {2, 3} -> 1
     * {7, 5, 90, -100}, {-100, 7, 5} -> 90
     * {7, 5}, {7, 5, 9} -> {} //prazan niz
     *
     * @param nizA niz A
     * @param nizB niz B
     * @return razlika A/B
     */
    public static int[] nadjiRazlikuNizova(int[] nizA, int[] nizB) {
        int[] razlikaAB = new int[nizA.length - nizB.length];
        System.out.println(Arrays.toString(razlikaAB));

        if(nizA != nizB) {
            System.out.println("Nizovi nisu jednaki.");
            for (int i = 0; i < nizA.length; i++) {
                for (int j = 0; j < nizB.length; j++) {
                    if (nizA[i] == nizB[j]) {
                        System.out.println("Broj" + nizA[i] + " se nalazi u nizuB.") ;
                    } else
                    {
                        System.out.println("Broj" + nizA[i] + " se ne nalazi u nizuB.");
                    }
                }
            }
        } else {
            System.out.println("Nizovi su jednaki.");
        }





        return nizA; // TODO
    }


    /**
     * Ovde mozete testirati svoj kod pozivajuci funkcije.
     * Kod koji budete pisali u main() metodi sluzi da potvrdi da vasa metoda radi kao sto je predvidjeno.
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println(oceniTest(100));
        System.out.println(nadjiNajveciBroj(new int[] {1, 2, 3}));
        System.out.println(obrniString("test"));
        System.out.println(sumaCifaraBroja(12345));
        System.out.println(Arrays.toString(nadjiRazlikuNizova(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 5})));

    }
}
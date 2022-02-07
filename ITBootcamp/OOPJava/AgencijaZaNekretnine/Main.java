package AgencijaZaNekretnine;

public class Main {
    public static void main(String[] args) {

        Ugovor ugovor = new Ugovor();
        FizickoLice prodavac = new Prodavac("Petar Petrovic", "25894613", "54856", true);
        FizickoLice kupac = new Kupac("Milos Milosevic", "5489312546", "45862", false);

        System.out.println(ugovor.procenatZarade());

    }
}

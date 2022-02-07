package PlatnaKartica;

public class Main {
    public static void main(String[] args) {


        PlatnaKartica pk = new PlatnaKartica(15000, "1542-58479-58467", 2022, 12);
        pk.stampaj();

        PlatnaKartica Visa = new VisaKartica(16000, "29348723-039457", 2022,4, "Petronije");
        PlatnaKartica Master = new MasterKartica(58111, "473295-6585-76565", 2021,5);

        Visa.stampaj();
        Master.stampaj();

        Visa.dodajSredstva(500);
        Visa.stampaj();
        Visa.izvrsiTransakciju(800);
        Visa.stampaj();


    }
}

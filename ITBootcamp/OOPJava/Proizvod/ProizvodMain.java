package Proizvod;

public class ProizvodMain {
    public static void main(String[] args) {
        ClanskaKarta kartica = new ClanskaKarta(10, "NS125638");

        Kupac kupac = new Kupac(kartica);
        kupac.setImeIPrezime("Milan Jovanovic");

        Proizvod starke = new Proizvod();
        starke.setNaziv("Starke");
        starke.setCenaIzrade(1000);
        starke.setKupac(kupac);

        starke.stampaj();
    }
}

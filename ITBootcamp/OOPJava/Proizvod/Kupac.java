package Proizvod;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta clanskaKarta;

    public Kupac(String imeIPrezime, ClanskaKarta clanskaKarta) {
        this.imeIPrezime = imeIPrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public Kupac(ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + " - " + this.clanskaKarta.getBrojKartice());
    }
}



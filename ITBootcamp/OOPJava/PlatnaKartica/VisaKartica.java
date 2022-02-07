package PlatnaKartica;

public class VisaKartica extends PlatnaKartica{
    private String ovlascenoLice;

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;

    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double novac) {
        double provizija = novac * 1.8 / 100;
        if(provizija <= 4) {
            this.suma = this.suma - novac - 4;
        } else {
            this.suma = this.suma - novac -provizija;
        }

    }
    @Override
    public void stampaj() {
        System.out.println("Visa card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + ", " + this.suma);
    }
}

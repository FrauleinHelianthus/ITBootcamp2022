package PlatnaKartica;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double novac) {
        double provizija = novac * 1.5 / 100;
        this.suma = this.suma - novac -provizija;
    }

    public void naplatiOdrzavanje() {
        this.suma = this.suma - 2;
    }

    @Override
    public void stampaj() {
        System.out.println("Master card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + ", " + this.suma);
    }
}

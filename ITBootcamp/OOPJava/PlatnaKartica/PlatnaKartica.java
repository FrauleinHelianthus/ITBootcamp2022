package PlatnaKartica;

public class PlatnaKartica {
    protected double suma;
    protected String brojKartice;
    protected int godina;
    protected int mesec;

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double dodajSredstva(double novac) {
        suma = suma + novac;
        return suma;
    }

    public void izvrsiTransakciju(double novac) {
        this.suma = this.suma - novac;

    }

    public void stampaj() {
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", " + this.suma);
    }

}

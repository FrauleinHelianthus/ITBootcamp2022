package AgencijaZaNekretnine;

public class Ugovor {
    private String adresa;
    private double cena;
    private int godina;
    private int dan;
    private int mesec;
    private Prodavac prodavac;
    private Kupac kupac;

    public Ugovor () {

    }

    public Ugovor(String adresa, double cena, int godina, int dan, int mesec, Prodavac prodavac, Kupac kupac) {
        this.adresa = adresa;
        this.cena = cena;
        this.godina = godina;
        this.dan = dan;
        this.mesec = mesec;
        this.prodavac = prodavac;
        this.kupac = kupac;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public Prodavac getProdavac() {
        return prodavac;
    }

    public void setProdavac(Prodavac prodavac) {
        this.prodavac = prodavac;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double procenatZarade() {
        double procenat = 0.03;
        if(kupac.isPrethodnoKupovao()) {
            procenat = 0.02;
        }
        return procenat;
    }

    public void racunajZaraduAgencije() {
        double zaradaAgencije = 1000 + this.cena * procenatZarade();
    }


}

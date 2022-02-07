package Proizvod_ice_point;

public class Dodatak {
    private String naziv;
    private int cena;

    public Dodatak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void stampaj() {
        System.out.println("Naziv: " + this.naziv + ", cena: " + this.cena);
    }
}

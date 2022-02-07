package Racun;

public class Racun {
    private String racun;
    private String imePrezime;
    private double stanjeNaRacunu;

    public Racun (String racun, String imePrezime, double stanjeNaRacunu) {
        this.racun = racun;
        this.imePrezime = imePrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getRacun() {
        return racun;
    }
     public void setRacun () {
        this.racun = racun;
     }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }


    public void stampaj() {
        System.out.println(this.imePrezime + " - " + this.racun);
        System.out.println("Stanje na racunu je " + this.stanjeNaRacunu + " rsd.");
    }

    public double promenaStanja(double novac) {
        if(this.stanjeNaRacunu > 0) {
            this.stanjeNaRacunu = this.stanjeNaRacunu + novac;
        }
        return this.stanjeNaRacunu;
    }
}

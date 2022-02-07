package Atleticar;

public abstract class Atleticar {

    private String punoIme;
    protected double rezultat;

    public Atleticar() {

    }

    public Atleticar(String punoIme, double rezultat) {
        this.punoIme = punoIme;
        this.rezultat = rezultat;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme() {
        this.punoIme = punoIme;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat() {
        this.rezultat = rezultat;
    }

    public abstract boolean daLiJeBoljiAtleticar(Atleticar a);// abstraktna zato sto ne znamo kojeg tipa atleticara se poree rezultati

    public void stampaj() {
        System.out.println(this.punoIme + ", " + this.rezultat);
    }

}

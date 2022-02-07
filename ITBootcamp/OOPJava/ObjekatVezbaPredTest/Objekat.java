package ObjekatVezbaPredTest;

public abstract class Objekat implements Comparator, Comparable<Objekat>{
    private String adresa;
    private double povrsina;
    private int zona;
    private double porez = 0.0;

    public Objekat(String adresa, double povrsina, int zona, double porez) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
        this.porez = porez;
    }

    public Objekat(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public Objekat() {

    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getPorez() {
        return porez;
    }

    public void setPorez(double porez) {
        this.porez = porez;
    }

    public double koeficijent() {
        if(this.zona == 1) {
            return 1.4;
        } else if (zona == 2) {
            return  1.1;
        } else return 1.05;
    }

    public abstract double racunajPorez();

    @Override
    public String toString() {
        return "Objekat{" +
                "adresa='" + adresa + '\'' +
                ", povrsina=" + povrsina +
                ", zona=" + zona +
                ", porez=" + porez +
                '}';
    }

    public int compare(Object o1, Object o2) {
        Objekat objekat1 = (Objekat) o1;
        Objekat objekat2 = (Objekat)  o2;

        return (int) (objekat1.getPorez() - objekat2.getPorez());
    }

    public int compareTo(Objekat objekat) {
        return (int) (objekat.getPorez() - this.getPorez());
    }
}

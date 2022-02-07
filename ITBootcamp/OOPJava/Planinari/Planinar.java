package Planinari;

public abstract class Planinar {
    protected String id;
    protected String imePrezime;

    public Planinar(String id, String imePrezime) {
        this.id = id;
        this.imePrezime = imePrezime;
    }

    public String getId() {
        return id;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);


}

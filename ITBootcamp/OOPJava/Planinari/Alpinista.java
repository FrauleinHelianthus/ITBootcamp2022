package Planinari;

public class Alpinista  extends Planinar{
    private int poeni;

    public Alpinista(String id, String imePrezime, int poeni) {
        super(id, imePrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, ");
        System.out.println("id: " + getId());
        System.out.println("ime: " + getImePrezime());
        System.out.println("Broj poena: " + getPoeni());
    }



    @Override
    public double clanarina() {
        return 1500 - getPoeni() * 50;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if(planina.getVisinaPlanine() <= 4000) {
            System.out.println("Uspesan uspon.");
            return true;
        }
        else return false;
    }
}

package Proizvod_ice_point;

public class IcePoint extends Proizvod{
    private String tip;
    private boolean mali;

    public IcePoint(String tip, boolean mali) {
        this.tip = tip;
        this.mali = mali;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public boolean isMali() {
        return mali;
    }

    public void setMali(boolean mali) {
        this.mali = mali;
    }

    @Override
    public int ukupnaCena() {
       if(this.mali == true) {
           return this.cenaDodataka() + 100;
       } else {
           return this.cenaDodataka() + 130;
       }
    }

    @Override
    public void stampaj() {

        System.out.println("ICE POINT: " + this.tip);
        if (this.mali == true) {
            System.out.println("Mali");
        } else {
            System.out.println("Veliki");
        }
        for (int i = 0; i < this.dodaci.size(); i++) {
            this.dodaci.get(i).stampaj();
        }
        System.out.println("Ukupna cena je: " + this.ukupnaCena());

    }
}

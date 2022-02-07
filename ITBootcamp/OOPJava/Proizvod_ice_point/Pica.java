package Proizvod_ice_point;

public class Pica extends Proizvod{
    private int cenaPodloge;

    public int getCenaPodloge() {
        return cenaPodloge;
    }

    public void setCenaPodloge(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int ukupnaCena() {
        return this.cenaDodataka() + this.cenaPodloge;
    }

    @Override
    public void stampaj() {
        System.out.println("PIZZA: " );
        System.out.println("Cena podloge: " +  this.cenaPodloge);

        for (int i = 0; i < this.dodaci.size(); i++) {
            this.dodaci.get(i).stampaj();
        }
        System.out.println("Ukupna cena je: " + this.ukupnaCena());
    }
}

package Planinari;

public class RekreativniPlaninar extends Planinar {
    protected int tezinaOpreme;
    protected  String  okrug;
    protected double maxUspon;

    public RekreativniPlaninar(String id, String imePrezime, int tezinaOpreme, String okrug, double maxUspon) {
        super(id, imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, ");
        System.out.println("id: " + getId());
        System.out.println("ime: " + getImePrezime());
        System.out.println("Okrug: " + getOkrug());
    }

    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if((getMaxUspon() - (getTezinaOpreme() * 50)) > planina.getVisinaPlanine())
        {

            System.out.println("Uspesan uspon.");
            return true;
        }
        else { System.out.println("Probajte sledeci put.");
        return false;
        }
    }
}

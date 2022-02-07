package Racun;

public class MainRacun {
    public static void main(String[] args) {
        Racun racun1 = new Racun("45689572", "Marko Markovic", 45000);
        Racun racun2 = new Racun("6845972", "Sofronije Dodic", 90000);

        racun1.stampaj();
        racun2.stampaj();

        System.out.println(racun1.promenaStanja(5000));
        racun1.stampaj();

        racun1.getStanjeNaRacunu();



    }




}

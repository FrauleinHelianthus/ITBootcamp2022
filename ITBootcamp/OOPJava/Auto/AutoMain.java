package Auto;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Jelena Zdravkovic", "VW", 5, 6, 80, "NS568421", true);
        Auto auto2 = new Auto("Milos Zdravkovic", "VW", 5, 6, 45, "INNS4587", false);

        auto1.stampaj();
        System.out.println();
        auto2.stampaj();

        System.out.println(auto1.daLiJeBrzinaPrekoracena(50));
        System.out.println();
        System.out.println("Vasa kazna je " + auto1.kazna(50) + ".");
        System.out.println(auto2.daLiJeBrzinaPrekoracena(60));
        System.out.println("Vasa kazna je " + auto2.kazna(50) + ".");

        auto1.dodajGas();
        auto1.koci();
        System.out.println("Trenutna potrosnja je: " + auto1.potrosnja());

        auto2.dodajGas();
        auto2.koci();
        System.out.println("Trenutna potrosnja je: " + auto2.potrosnja());

        auto1.setGodinaProizvonje(1945);
        auto2.setGodinaProizvonje(1980);

        auto2.jesteOldTimer();
        auto1.jesteOldTimer();

        auto1.setMesecRegistracije(4);
        auto2.setMesecRegistracije(11);
        System.out.println(auto1.daLiJeIsteklaRegistracija(5));
        System.out.println(auto2.daLiJeIsteklaRegistracija(12));

        auto1.setKubikaza(2005);
        auto2.setKubikaza(1500);
        System.out.println(auto1.cenaRegistracije());
        System.out.println(auto2.cenaRegistracije());




    }
}

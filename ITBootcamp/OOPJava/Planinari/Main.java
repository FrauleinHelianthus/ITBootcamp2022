package Planinari;


import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Planina tara = new Planina("Tara", "Srbija", 1544);
        Planina triglav = new Planina("Triglav", "Slovenija", 2864);
        Planina elbrus = new Planina("Elbrus", "Rusija", 5642);


        ArrayList<Planinar> planinari = new ArrayList<>();

        planinari.add(new RekreativniPlaninar("RP12334", "Bosko Boskovic", 54, "Cajetina", 1540));
        planinari.add(new RekreativniPlaninar("RP12354", "Petar Petrovic", 30, "Novi Sad", 2850));
        planinari.add(new RekreativniPlaninar("RP15634", "Marko Markovic", 25, "Subotica", 950));

        planinari.add(new Alpinista("A15687", "Milan Milanovic", 15));
        planinari.add(new Alpinista("A56874","Jovan Jovanovic", 11));
        planinari.add(new Alpinista("A58946", "Vidak Vidakovic", 9));

        planinari.get(0).uspesanUspon(elbrus);
        planinari.get(1).uspesanUspon(tara);
        planinari.get(2).uspesanUspon(tara);
        planinari.get(3).uspesanUspon(triglav);
        planinari.get(4).uspesanUspon(elbrus);
        planinari.get(5).uspesanUspon(triglav);

        double suma = 0.0;
        for (int i = 0; i < planinari.size(); i++) {
            suma = suma + planinari.get(i).clanarina();
        }
        System.out.println("Ukupna clanarina je: " + suma);



    }
}

package Racun;

import java.util.ArrayList;

public class Transakcija {
    private String idTranskacije;
    private String racunSa;
    private String racunNa;
    private ArrayList<Racun> racuni = new ArrayList<Racun>();

    public Transakcija() {
    }

    public Transakcija(String idTranskacije, String racunSa, String racunNa) {
        this.idTranskacije = idTranskacije;
        this.racunSa = racunSa;
        this.racunNa = racunNa;
    }


    public String getIdTranskacije() {
        return idTranskacije;
    }

    public void setIdTranskacije(String idTranskacije) {
        this.idTranskacije = idTranskacije;
    }

    public String getRacunSa() {
        return racunSa;
    }

    public void setRacunSa(String racunSa) {
        this.racunSa = racunSa;
    }

    public String getRacunNa() {
        return racunNa;
    }

    public void setRacunNa(String racunNa) {
        this.racunNa = racunNa;
    }

   public void racuni(String korisnik, String imePrezime, double stanjeNaRacunu) {
        this.racuni.add(new Racun(korisnik, imePrezime, stanjeNaRacunu));
   }

    private double provizija(double novac) {
        double provizija;
        if(novac < 4500) {
            provizija = 0.45;
        }else {
            provizija = 0.01;
        }
        return provizija;
    }

//    public void izvrsiTransakciju(double novac) {
//         if (this.racuni.get(0).getStanjeNaRacunu() > 0 && this.racuni.get(0).getStanjeNaRacunu() > novac) {
//             this.racunSa = this.racuni.get(0).getRacun();
//             double novoStanjeRacunaSa = this.racuni.get(0).getStanjeNaRacunu() - novac -provizija(novac);
//             this.racuni.get(0).getStanjeNaRacunu() = novoStanjeRacunaSa;
//
//         }
//    }

//    public double izvrsiTransakciju(double novac) {
//        if(this.racunSa > 0 && this.racunSa > novac) {
//            this.racunSa = this.racunSa - novac - provizija(novac);
//            this.racunNa = racunNa + novac;
//        }
//        return racunNa;
//    }

    public void stampaj() {
        System.out.println("Racun sa: " );
    }
}

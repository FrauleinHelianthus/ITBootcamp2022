package Proizvod_ice_point;

import java.util.ArrayList;

public abstract class Proizvod {

   protected ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();

   public void dodajDodatak(Dodatak dodatak) {
       this.dodaci.add(dodatak);
   }

   public void dodajDodatak(String naziv, int cena) {
       this.dodaci.add(new Dodatak(naziv, cena)); // mogu i ovako odmah direktno da dodajem novi objekat
   }

   public int cenaDodataka() {
       int suma = 0;
       for (int i = 0; i < this.dodaci.size(); i++) {
           suma += this.dodaci.get(i).getCena();
       }
       return suma;
   }

   public abstract int ukupnaCena();// abstraktna jer ne znamo kako se koja cena racuna
   public abstract void stampaj();

}

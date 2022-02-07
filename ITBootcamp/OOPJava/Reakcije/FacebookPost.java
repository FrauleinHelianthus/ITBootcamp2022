package Reakcije;

import java.util.ArrayList;

public class FacebookPost {
    private String autor;
    private String tekst;
    private ArrayList<Reakcija> reakcija = new ArrayList<Reakcija>();

    public FacebookPost(String autor, String tekst) {
        this.autor = autor;
        this.tekst = tekst;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void reaguj(Reakcija reakcija) {
        this.reakcija.add(reakcija);
    }

    public void reaguj(String korisnik, String tip) {
        this.reakcija.add(new Reakcija(tip, korisnik));
    }

// public static int brojPonavaljanja(int[] niz,  int k) {
// for (0, niz.length) {
// if (niz[i] == k)
//    counter++
// return counter;
// }

    private  int brojPonavljanja(String reakcija) {
        int counter = 0;
        for(int i = 0; i < this.reakcija.size(); i++) {
            if(this.reakcija.get(i).getTip().equals(reakcija)) {
                counter ++;
            }
        }
        return counter;


    }

    public void stampaj() {
        System.out.println(this.autor);
        System.out.println(this.tekst);
        System.out.print("Smajli" + this.brojPonavljanja("Smajli") + " | ");
        System.out.print("Lajk" + this.brojPonavljanja("Lajk") + " | ");
        System.out.print("Srce" + this.brojPonavljanja("Srce") + " | ");

    }

}

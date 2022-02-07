package ObjekatVezbaPredTest;

public class Zgrada extends Objekat{
    public int brojStanova;

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }



    @Override
    public double racunajPorez() {
        double porez = getPovrsina() * getBrojStanova() * this.koeficijent();
        return porez;
    }


}




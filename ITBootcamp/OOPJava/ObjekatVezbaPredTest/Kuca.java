package ObjekatVezbaPredTest;

public class Kuca extends  Objekat{
    public int brojClanova;

    public Kuca() {
        super();

    }



    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }


    @Override
    public double racunajPorez() {
        double porez = getPovrsina() * this.koeficijent();
        return porez;
    }


}

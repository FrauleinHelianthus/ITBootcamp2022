package ObjekatVezbaPredTest;

public class Lokal  extends Objekat{
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }

    public Lokal() {
    }

    @Override
    public double racunajPorez() {
        double porez = getPovrsina() * this.koeficijent() * 1.3;
        return  porez;
    }
}

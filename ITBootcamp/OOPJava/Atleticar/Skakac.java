package Atleticar;

public class Skakac extends Atleticar{
    public Skakac() {
    }

    public Skakac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean daLiJeBoljiAtleticar(Atleticar a) {
        if(this.rezultat < a.rezultat) {
            return true;
        }else {
            return false;
        }
    }

}

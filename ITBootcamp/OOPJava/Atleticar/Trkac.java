package Atleticar;

public class Trkac extends Atleticar{
    public Trkac() {

    }

    public Trkac(String punoIme, double rezultat) {
        super(punoIme, rezultat);
    }

    @Override
    public boolean daLiJeBoljiAtleticar(Atleticar a) {
//        return this.rezultat < a.rezultat;
            if(this.rezultat < a.rezultat) {
                return true;
            }else {
                return false;
            }
    }


}

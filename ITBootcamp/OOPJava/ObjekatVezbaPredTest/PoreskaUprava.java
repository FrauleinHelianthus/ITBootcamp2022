package ObjekatVezbaPredTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PoreskaUprava {
    private String grad;
    ArrayList<Objekat> nizObjekata = new ArrayList<>();

    public PoreskaUprava(String grad, ArrayList<Objekat> nizObjekata) {
        this.grad = grad;
        this.nizObjekata = nizObjekata;
    }

    public PoreskaUprava(String grad) {
        this.grad = grad;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void setNizObjekata(ArrayList<Objekat> nizObjekata) {
        this.nizObjekata = nizObjekata;
    }

    public ArrayList<Objekat> getNizObjekata() {
        return nizObjekata;
    }

    public void dodajObjekat(Objekat objekat) {
        nizObjekata.add(objekat);
    }

    public Objekat objekatSaNajvecimPorezom() {
        double max = nizObjekata.get(0).getPorez();
        Objekat objekatSaNajvecimPorezom = nizObjekata.get(0);
        for (int i = 0; i < nizObjekata.size(); i++) {
            if (nizObjekata.get(i).getPorez() > max) {
                max = nizObjekata.get(i).getPorez();
                objekatSaNajvecimPorezom = nizObjekata.get(i);
            }
        } return objekatSaNajvecimPorezom;
    }

    public Objekat objekatSaNajmanjimPorezom() {
        double min = nizObjekata.get(0).getPorez();
        Objekat objekatSaNajmanjimPorezom = nizObjekata.get(0);
        for (int i = 0; i < nizObjekata.size(); i++) {
            if (nizObjekata.get(i).getPorez() < min) {
                min = nizObjekata.get(i).getPorez();
                objekatSaNajmanjimPorezom = nizObjekata.get(i);
            }
        } return objekatSaNajmanjimPorezom;
    }

    public double ukupanPorez() {
        double sum = 0.0;
        for (Objekat objekat : nizObjekata) {
            sum += objekat.getPorez();
        } return sum;

    }

    @Override
    public String toString() {
        return "PoreskaUprava{" +
                "grad='" + grad + '\'' +
                ", nizObjekata=" + nizObjekata +
                '}';
    }

    public void sortirajObjekte() {
        Collections.sort(nizObjekata);
    }
}

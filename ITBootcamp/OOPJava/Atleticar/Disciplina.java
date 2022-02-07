package Atleticar;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String naziv;
    private String tip;
    private List<Atleticar> atlete = new ArrayList<Atleticar>();

    public Disciplina(String naziv, String tip) {
        this.naziv = naziv;
        this.tip = tip;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void dodajAtleticara(Atleticar a) {
        this.atlete.add(a);
    }

    public void diskvalifikuj(String punoIme) {
        for(int i= 0; i < this.atlete.size(); i++) {
            if(this.atlete.get(i).getPunoIme().equals(punoIme)) {
                this.atlete.remove(i);
            }
        }
    }
        public Atleticar nadjiNajboljeg() {
        Atleticar najbolji = this.atlete.get(0);
        for (int i = 0; i < this.atlete.size(); i++) {
            if (this.atlete.get(i).daLiJeBoljiAtleticar(najbolji)) {
                najbolji = this.atlete.get(i);
            }
        }
        return najbolji;
    }

    public void stampajPobednika() {
        Atleticar najbolji = this.nadjiNajboljeg();
        najbolji.stampaj();
    }


}




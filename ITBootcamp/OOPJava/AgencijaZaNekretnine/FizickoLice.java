package AgencijaZaNekretnine;

public class FizickoLice {
    private String imePrezime;
    private String jmbg;
    private String lk;
    private boolean prethodnoKupovao;

    public FizickoLice(String imePrezime, String jmbg, String lk, boolean prethodnoKupovao) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.lk = lk;
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getLk() {
        return lk;
    }

    public void setLk(String lk) {
        this.lk = lk;
    }

    public boolean isPrethodnoKupovao() {
        return prethodnoKupovao;
    }

    public void setPrethodnoKupovao(boolean prethodnoKupovao) {
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public void stampaj() {
        System.out.println(getImePrezime() + ", " + getLk());
    }
}

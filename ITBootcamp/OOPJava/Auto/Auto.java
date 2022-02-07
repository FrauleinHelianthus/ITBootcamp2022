package Auto;

public class Auto {
    private String imeIPrezime;
    private String marka;
    private int brojVrata;
    private double potrosnja;
    private double trenutnaBrzina;
    private String registracija;
    private boolean daLiJeUkljucenaKlima;
    private int godinaProizvonje;
    private int mesecRegistracije;
    private  int kubikaza;


    public Auto(String imeIPrezime, String marka, int brojVrata, double potrosnja, double trenutnaBrzina, String registracija, boolean daLiJeUkljucenaKlima) {
        this.imeIPrezime = imeIPrezime;
        this.marka = marka;
        this.brojVrata = brojVrata;
        this.potrosnja = potrosnja;
        this.trenutnaBrzina = trenutnaBrzina;
        this.registracija = registracija;
        this.daLiJeUkljucenaKlima = daLiJeUkljucenaKlima;
    }

    public int getGodinaProizvonje() {
        return godinaProizvonje;
    }

    public void setGodinaProizvonje(int godinaProizvonje) {
        this.godinaProizvonje = godinaProizvonje;
    }

    public int getMesecRegistracije() {
        return mesecRegistracije;
    }

    public void setMesecRegistracije(int mesecRegistracije) {
        this.mesecRegistracije = mesecRegistracije;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public boolean isDaLiJeUkljucenaKlima() {
        return daLiJeUkljucenaKlima;
    }

    public void setDaLiJeUkljucenaKlima(boolean daLiJeUkljucenaKlima) {
        this.daLiJeUkljucenaKlima = daLiJeUkljucenaKlima;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime() {
        this.imeIPrezime = imeIPrezime;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public double getPotrosnja() {
        return potrosnja;
    }

    public void setPotrosnja(double potrosnja) {
        this.potrosnja = potrosnja;
    }

    public double getTrenutnaBrzina() {
        return trenutnaBrzina;
    }

    public void setTrenutnaBrzina(double trenutnaBrzina) {
        this.trenutnaBrzina = trenutnaBrzina;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " - " + this.brojVrata + " -ro vrata.");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km.");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina.");
    }

    public boolean daLiJeBrzinaPrekoracena(double ogranicenje) {
        if (this.trenutnaBrzina >= ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public double kazna(double ogranicenje) {
        double iznosKazne = (this.trenutnaBrzina - ogranicenje) * 1000.0;

        if (iznosKazne > 0) {
            return iznosKazne;
        } else {
            return 0;
        }
    }

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
        System.out.println("Trenutna brzina je " + this.trenutnaBrzina);
    }

    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (this.trenutnaBrzina < 0) {
            trenutnaBrzina = 0;
        }
        System.out.println("Trenutna brzina je " + this.trenutnaBrzina);

    }


    public double potrosnja() {
        double faktorKlime = 1.0;
        if (daLiJeUkljucenaKlima) {
            faktorKlime =1.2;
        }
        double potrosnja = (this.trenutnaBrzina/100.0 * this.potrosnja) * faktorKlime;
        return potrosnja;

    }

    public boolean jesteOldTimer() {
        boolean jesteOldTimer = false;

        if (this.godinaProizvonje < 1950){
            jesteOldTimer =true;
            System.out.println("Jeste oldtimer.");
        }
        return jesteOldTimer;
    }

    public boolean daLiJeIsteklaRegistracija(int trenutniMesec) {
        if (trenutniMesec < this.mesecRegistracije) {
            return false;
        }
        else return true;
    }

    public double cenaRegistracije() {
        double cenaRegistracije = 0;
        if(this.kubikaza <= 2000) {
            cenaRegistracije = this.kubikaza * 100;
        } else {
            cenaRegistracije = (this.kubikaza * 100 + (this.kubikaza * 100) * 0.3);
        }
        return cenaRegistracije;
    }
}

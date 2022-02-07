package Proizvod;

public class ClanskaKarta {
    public double popust;
    public String brojKartice;

    public ClanskaKarta() {

    }


    public ClanskaKarta(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }


}

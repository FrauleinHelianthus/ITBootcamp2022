package ZeleniKarton;

public class ZeleniKarton {
    private String imePrezimeStudent;
    private String brojIndexa;
    private String predmet;
    private String imePrezimeProfesor;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String imePrezimeStudent, String brojIndexa, String predmet, String imePrezimeProfesor, int ocena) {
        this.imePrezimeStudent = imePrezimeStudent;
        this.brojIndexa = brojIndexa;
        this.predmet = predmet;
        this.imePrezimeProfesor = imePrezimeProfesor;
        this.ocena = ocena;
    }

    public String getImePrezimeStudent() {
        return imePrezimeStudent;
    }

    public void setImePrezimeStudent(String imePrezimeStudent) {
        this.imePrezimeStudent = imePrezimeStudent;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getImePrezimeProfesor() {
        return imePrezimeProfesor;
    }

    public void setImePrezimeProfesor(String imePrezimeProfesor) {
        this.imePrezimeProfesor = imePrezimeProfesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean ispitPolozen() {
        if (this.ocena > 5) {
            return true;
        } else return false;
    }

    public void stampaj() {
        System.out.println("(" + this.predmet + ") - (" + this.ocena + ")");
        System.out.println("Student: " + this.imePrezimeStudent + ", " + this.brojIndexa);
        System.out.println("Profesor: " + this.imePrezimeProfesor);
        System.out.println();
    }

}

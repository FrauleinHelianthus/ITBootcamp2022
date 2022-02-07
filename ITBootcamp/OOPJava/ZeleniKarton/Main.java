package ZeleniKarton;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> zelenikartoni = new ArrayList<ZeleniKarton>();
        ZeleniKarton zk1 = new ZeleniKarton("Petar Petrovic", "QA123", "softversko testiranje-osnove", "Vidoje Peric", 10);
        ZeleniKarton zk2 = new ZeleniKarton("Miloje Petrovic", "QA124", "softversko testiranje1", "Vidoje Peric", 9);
        ZeleniKarton zk3 = new ZeleniKarton("Ljubosav Petrovic", "QA125", "softversko testiranje2", "Vidoje Peric", 8);
        ZeleniKarton zk4 = new ZeleniKarton("Petar Jovanovic", "QA126", "softversko testiranje-osnove", "Vidoje Peric", 5);
        ZeleniKarton zk5 = new ZeleniKarton("Petar Mutic", "QA127", "softversko testiranje5", "Vidoje Peric", 10);
        ZeleniKarton zk6 = new ZeleniKarton("Ljubosav Minic", "QA128", "softversko testiranje - java", "Vidoje Peric", 7);
        ZeleniKarton zk7 = new ZeleniKarton("Milisav Petrovic", "QA126", "softversko testiranje-sql", "Vidoje Peric", 9);

        zelenikartoni.add(zk1);
        zelenikartoni.add(zk2);
        zelenikartoni.add(zk3);
        zelenikartoni.add(zk4);
        zelenikartoni.add(zk5);
        zelenikartoni.add(zk6);
        zelenikartoni.add(zk7);


        for (ZeleniKarton zk : zelenikartoni) {
            zk.stampaj();
        }

        int zbirOcena = 0;
        for (int i = 0; i < zelenikartoni.size(); i++) {
            zbirOcena += zelenikartoni.get(i).getOcena();

        }
        double prosecnaOcena = zbirOcena / zelenikartoni.size();
        System.out.println("Prosecna ocena je " + prosecnaOcena);


        int suma = 0;
        for (int i = 0; i < zelenikartoni.size(); i++) {
            if(zelenikartoni.get(i).getOcena() > 5) {
                suma += zelenikartoni.get(i).getOcena();
            }

        }
        double prosecnaOcenaPolozenih = suma / zelenikartoni.size();
        System.out.println("Prosecna ocena polozenih ispita je " + prosecnaOcenaPolozenih);


    }
}

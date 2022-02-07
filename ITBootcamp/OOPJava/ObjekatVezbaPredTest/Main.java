package ObjekatVezbaPredTest;

public class Main {
    public static void main(String[] args) {
        Kuca k = new Kuca("Adresa", 100.2, 2, 5);
        Zgrada z = new Zgrada("Adresa 2", 500.5, 1, 10);
        Lokal l = new Lokal("Adresa 3", 50, 3);

        PoreskaUprava pu = new PoreskaUprava("Novi Sad");

        pu.dodajObjekat(k);
        pu.dodajObjekat(z);
        pu.dodajObjekat(l);

        k.setPorez(k.racunajPorez());//posto imam povrsinu, setujem porez tako sto pozivam metodu za racunanje poreza
        z.setPorez(z.racunajPorez());
        l.setPorez(l.racunajPorez());

        System.out.println(pu.objekatSaNajmanjimPorezom());
        System.out.println();
        System.out.println(pu.objekatSaNajvecimPorezom());
        System.out.println();
        System.out.println(pu.ukupanPorez());
        System.out.println(pu.getNizObjekata());
        pu.sortirajObjekte();
        System.out.println(pu.getNizObjekata());

        System.out.println(k);
        System.out.println(z);
        System.out.println(l);

        k.racunajPorez();
        z.racunajPorez();
        l.racunajPorez();
        System.out.println(k.getPorez());
        System.out.println(l.getPorez());
        System.out.println(z.getPorez());

        Kuca k1 = new Kuca ("Strasse Inn 15", 90.8, 3, 4);
        PoreskaUprava pu1 = new PoreskaUprava("Innsbruck");
        pu1.dodajObjekat(k1);

        Lokal l1 = new Lokal("Strasse Frau 17", 50, 2);
        pu1.dodajObjekat(l1);

        System.out.println(pu1.getNizObjekata());
        pu1.sortirajObjekte();
        System.out.println(pu1.getNizObjekata());


    }
}

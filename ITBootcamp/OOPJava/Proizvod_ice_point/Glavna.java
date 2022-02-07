package Proizvod_ice_point;

public class Glavna {
    public static void main(String[] args) {

        Proizvod sladoled = new IcePoint("vanila", true);
        Proizvod pica = new Pica(100);

        sladoled.dodajDodatak("krembananice", 50);
        sladoled.dodajDodatak("plazma", 30 );
        sladoled.dodajDodatak("cokolada", 40);
        sladoled.dodajDodatak("sumsko voce", 10);

        sladoled.stampaj();


        pica.dodajDodatak("kajmak", 100);
        pica.dodajDodatak("masline", 30);

        pica.stampaj();


    }

}

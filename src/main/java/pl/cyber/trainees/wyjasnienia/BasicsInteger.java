package pl.cyber.trainees.wyjasnienia;

public class BasicsInteger {
    //metoda, ktora wyswietli liczbe z podanego parametru
    public void Metoda1(Integer wyswietlMetoda1) {
        System.out.println(wyswietlMetoda1);
    }

    public Integer Metoda2() {
        return (12314);
    }
    //metoda, ktora wyswietli liczbe z podanego parametru
    //wprowadzona liczba to 12314

    //utworzyc metode, ktora przyjmie 3 parametry String, Integer, Integer
    //String -> Wynik dodawania:
    // Integer -> liczba, ktora bedziemy dodawac

    Integer L1 = 5;
    Integer L2 = 4;

    public void Napis() {
        String napis = "Dodawanie";
        System.out.println(napis + " " + L1 + ", " + L2);

    }

    public void L3() {
        Integer L3 = L1 + L2;
        System.out.println(L3);
    }

    public void WyswietlenieSumy(String txt, Integer a, Integer b) {
        System.out.println(txt + a + b);
        System.out.println(a + b);
    }

    public void DodawanieIntegerow() {
        Integer c = 5;
        Integer d = 4;
        System.out.println(c+d);

    }

    public Integer DodawanieInegerow2(Integer e, Integer f) {
        return e + f;
    }
    // utworzyc metode ktora zwraca wynik dodawania dwoch Integerow
    // W klasie SimpleApp powinnismy przekazac ten wynik do metody Basics.wyswietlText(xxx);


    /*
 Warte zapamiętania
 konstrukcja klasy

public class NazwaKlasy {

}


Konstrukcja metody w klasie

 public class NazwaKlasy {

 public void nazwaMetody() {

 }

}


Błędne konstrukcje metod: TAK NIE PISAĆ

 public class NazwaKlasy {

public String metodaA();  
 -- brak rozpoczęcia i zakończenia metody przez {}
 i metody nie posiadają ;

String public metodaB() {
--najpierw modyfikator następnie zwracany typ danych
}

public metodaC() {
-- brak typu danych
-- nawias zamykający


  public String metodaD() {
   public String metodaE(){
   }
  }

}


*/


}

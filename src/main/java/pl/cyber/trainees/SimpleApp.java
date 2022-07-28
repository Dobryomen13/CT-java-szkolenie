//1. Konstrukcja klass i metod

package pl.cyber.trainees;  // oreślenie pakietu wramach projektu, gdzie
// znajduje się nasza klasa.
//pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiedniej strukturze
//katalogów tj src/main/java/......
//w naszym przykładzie src/main/java/pl.cyber.trainees

//region miejsce na importy

import pl.cyber.trainees.wyjasnienia.Basics;
import pl.cyber.trainees.wyjasnienia.BasicsInteger;
import pl.cyber.trainees.wyjasnienia.InstrukcjeWarunkowe;
import pl.cyber.trainees.zadania.Zadanie29T;

import javax.websocket.RemoteEndpoint;
import java.io.File; //importy zazwyczaj dodają się same ewemtualnie można je dodać poprzez Ctrl + Enter
//poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie
//endregion

import java.math.*; // z * mówimy że chcemy zaimportować wszystkie biblioteki wramach pakietu (package) w tym przypadku java.math
//endregion

//Linia public class SimpleApp. Opisuje definicję klasy o nazwie SimpleApp.
//modyfikator dostępu klasy public / private
//class - słowo kluczowe określające definicję klasy

//SimpleApp - nazwa klasy tutaj nazwa może być dowolna, aby była zgodna z dwoma warunkami:
//1) Nazwa pliku i nazwa klasy musi się równać
//2) Nazwy klas zawsze piszemy CamelCase'm z zastrzeżeniem że pierwsza litera i każda kolejna nowego wyrazu jest pisana
//z wielkiej litery

//Cały kod w klasie powinien być zapisany w jej ramach które określone są poprzez nawiasy {} poza klasą
//nie może być żadnego kodu, natomiast przed klasą możemy jedynie pisać import'y oraz package.
public class SimpleApp {
    //w ramach klasy deklarujemy zmienne globalne

    public static String SEPARATOR_SPACJA = " "; //zmienna globalna dostepna w calej klasie
    //konstrukcja zmiennych globalnych
    //modyfikator dostępu
    //słowo kluczowe static - określa że nasza zmienna jest statyczna
    //TypDanych
    //nazwa zmiennej. Dobrą praktyką jest aby nazwa zmiennej globalnej była pisana wyłącznie z wielkich liter a kolejne słowa
    //oddzielone zostały znakiem '_'
    //następnie przypisanie wartości


    //Deklaracja metod
    //W przypadku metody uruchomieniowej powinna ona występować tylko raz w całym projekcie
    //Konstrukcja metory uruchomieniowej:
    //modyfikator dostępu zawsze jako public
    //słowo kluczowe static
    //typ metody zawsze void
    //nazwa metody zawsze main
    //parametry wejściowe metody, może ich nie być
    // ale z reguły powinna być to tablica args (tj. String[] args)
    public static void main(String[] args) {

        System.out.println("POCZATEK ZADANIA 29T");
        System.out.println();
        Zadanie29T zadanie29T = new Zadanie29T();
        String wiek = "31";
        zadanie29T.MojWiek(wiek);

        String imie = "Karolina";
        zadanie29T.MojeImie(imie);

        zadanie29T.CzyParzysta(2);
        zadanie29T.CzyPodzielna(3,5);
        zadanie29T.CzyPodzielna2(3,5);
        zadanie29T.CzyPodzielna3(3,5);
        zadanie29T.Potega(3);
        System.out.println();
        System.out.println("KONIEC ZADANIA 29T");
        System.out.println();







        BasicsInteger basicsInteger8 = new BasicsInteger();
        basicsInteger8.Metoda1(basicsInteger8.DodawanieInegerow2(7,13));

        InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
        instrukcjeWarunkowe.Cos(5);






        BasicsInteger basicsInteger7 = new BasicsInteger();
        basicsInteger7.DodawanieIntegerow();

        BasicsInteger basicsInteger6 = new BasicsInteger();
        String txt = "wynik dodawania ";
        Integer a = 12;
        Integer b = 13;
        basicsInteger6.WyswietlenieSumy(txt, a, b);

        BasicsInteger basicsInteger4 = new BasicsInteger();
        basicsInteger4.Napis();

        BasicsInteger basicsInteger5 = new BasicsInteger();
        basicsInteger5.L3();





        Basics testKonstr = new Basics(124);

        BasicsInteger basicsInteger = new BasicsInteger();
        basicsInteger.Metoda1(54);

        BasicsInteger basicsInteger2 = new BasicsInteger();
        basicsInteger2.Metoda1(basicsInteger2.Metoda2());

        //UWAGA należy pilnować {} metody aby nie pisac tzw. metodyw metodzie
        // w ramach metody uruchomieniowej możemy deklarować zmienne oraz pisac kod,
        //natomiast dobra praktyka jest aby metoda uruchomieniowa wywolywala konkretne klasy
        // z kodem, ktory chcemy uruchomic

        //pierwsze rozwiązanie
        Basics basics = new Basics();
        basics.wyswietlTekst1("Jakiś tekst do wyświetlenia");

//drugie rozwiązanie
        Basics basics2 = new Basics(" Nowy tekst do wyświetlenia ");
        basics2.wyswietlTekst2("Jakiś tekst do wyświetlenia");


//trzecie rozwiązanie
        Basics basics3 = new Basics("tekst1", "tekst2", " tekst3");
        basics3.wyswietlTekst3("Jakiś tekst do wyświetlenia");

    }


    //Należy pamiętać, że metody funkcjonalne deklarujemy w taki sposób:
    //nie mają słowka static
    //modyfikator dostępu może być public /private / protected/ default
    //Typ zwracajych informacji, aczkolwiem może metoda nic nie zwracać.
    //void - jeśli metoda nic nie zwraca
    //String/Integer/BigDecimal/Model/........ jeśli chcemy aby nasza metoda zwracała
    //konkretny typ danych i była możliwa bo użycia w innym miejscu np. klasy lub projektu
    public String nazwaMetody() {
        return ""; //return zawsze musi sie pojawic jesli nasza metoda jest inna niz void
    }

    public void wyswietlTekst(String tekst) {
        System.out.println(tekst);
    }

    private Integer kolejnaMetoda() {

        // wtym miejscu mozliwe jest deklarowanie zmiennych
        //uzywanie instrukcji warunkowych
        //uzywanie petli
        //uzywanie innych metod lub odwolanie innych klas poprzez wczesniejsza deklaracje

        return 0;
    }



    // w tym miejscu mozemy deklarowac kolejne metody ich ilosc jest dowolna
    //zalecana wielkosc klay nie powinna przekroczyc 200 linii pliku
}



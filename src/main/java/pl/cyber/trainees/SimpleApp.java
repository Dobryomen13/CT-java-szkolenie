//1. Konstrukcja klass i metod

package pl.cyber.trainees;  // oreślenie pakietu wramach projektu, gdzie
// znajduje się nasza klasa.
//pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiedniej strukturze
//katalogów tj src/main/java/......
//w naszym przykładzie src/main/java/pl.cyber.trainees

//region miejsce na importy
import pl.cyber.trainees.dziedziczenie.Tablice;
import pl.cyber.trainees.dziedziczenie.Wyjatki;
import pl.cyber.trainees.wyjasnienia.Obiekty;
import pl.cyber.trainees.wyjasnienia.bankomat.BankomatService;
import spotkania.Petle;

import java.io.File; //importy zazwyczaj dodają się same ewemtualnie można je dodać poprzez Ctrl + Enter
   //poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie
//endregion
//region miejsce na importy
import java.io.File;
//importy zazwyczaj dodają się same ewemtualnie można je dodać poprzez Ctrl + Enter/poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie

import java.io.IOException;
import java.math.*; // z * mówimy że chcemy zaimportować wszystkie biblioteki wramach pakietu (package) w tym przypadku java.math
//endregion


public class SimpleApp {
    public static void main(String[] args)  {
    /*    Petle petle = new Petle();
        petle.Lista();

        petle.choinkaRozbudowana(7);
        petle.SzukajPodzielnych();

        InstrukcjeWarunkowe instrukcjeWarunkowe = new InstrukcjeWarunkowe();
        instrukcjeWarunkowe.uruchom();
        instrukcjeWarunkowe.Wyswietl();
        petle.PierwszyProgram();
        petle.sumaLiczbZForIWhile();
        petle.silnia();
        petle.silniaRekurencyjna(4);
*/
        /*
        Tablice tablice = new Tablice();
        tablice.tablica();
        tablice.tablica2();
        tablice.Lista();
        */
     //   Wyjatki wyjatki = new Wyjatki();
     //   wyjatki.uruchom();

    //    Obiekty obiekty = new Obiekty();
     //   obiekty.uruchom();

        BankomatService service = new BankomatService();
        service.uruchomRozwiazanie2();



    }

}

// Unit
//Spook / Groovy



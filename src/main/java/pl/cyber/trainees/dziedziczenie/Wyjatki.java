package pl.cyber.trainees.dziedziczenie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Wyjatki {
    //IndexOutOfBoundsExeption
    //IOExeption
    //IllegalArgumentExeption

    //throw

    //wywolanie (rzucenie) wyjatku w kodzie
    //throw new IOExeption();

    //mamy dostepne 2 rodzaje wyjatkow checked i unchecked
    /*
    Wyjatki chcecked musimy obsluzyc inaczej program sie nie skompiluje oraz nie uruchomi.
    Przykladem wyjatku checked jest wyjatek IOExeption, poniewaz dziedziczy (extends) on po klasie Exeption
    Tego typu wyjatek i wiele mu podobnych musimy zawsze obsluzyc


    Wyjatki typu unchecked to sa wyjatki niezagrazajace dzialaniu aplikacji
    moze zostac on rzucony natomiast aplikacja bedzie dzialala niezaleznie od niego
    Przykladem wyjatku unchecked jest IndexOutOfBoundsExeption, poniewaz dziedziczy (extendes) on po klasie RuntimeExeption

     */


    /*
    Obsluga wyjatkow.
    poprzez slowo kluczowe throws, ktore zwykle piszemy po deklaracji metody a przed nawiasem { otwierajacym metode.
    np.

    private void dzielenieLiczb(Integer a, Integer b) throws IOExeption {

    dzieki slowy throws nasz wyjatek zostanie przekazany do metody wyzej, jesli bedzie ta konstrukcja uzyta przy metodzie main
    to wtedy nasz wyjatek checked zostanie wyswietlony w konsoli

    StackTrace - czyli wyswietlone informacje o wyjatku dostepne z konsoli

     */

    public void uruchom()  {
     //   dzielenieLiczb();
        dzielenieLiczb2();
    }

    private void dzielenieLiczb() throws IOException {
        //uzyc scannera aby pobrac 2 zmienne od uzytkownika i wykonac dzielenie liczb

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a :");
        Integer a = scanner.nextInt();
        System.out.println("Podaj liczbe b :");
        Integer b = scanner.nextInt();


        System.out.println("a podzielone przez b daje " + a/b);
        // throw powoduje rzucenie wyjatku. Dzieki temu mozemy rzucic wyjatkiem w dowolnym miejsc kodu
        throw new IOException("test");

    }

    /* obsluga wyjatkow w zalecany sposob
    uzywamy konstrukcji try / catch

    try {
    throw new IOException("test");
    } catch (IOExeption ex){

    // konstrukcja obslugi bledu. W tym miejscu podajemy informacje na konsole, ewentualnie mozemy wykonac inne dzialania

    System.out.println("Wiadomosc");
    }

    try{
        System.out.println("a podzielone przez b daje " + a/b);
        } catch (ArithmeticException ex) {
        System.out.println("Niedozwolona operacha dzielenia przez 0. Zostanie wykonane dzielenie przrz 1");
        }


     */
    private void dzielenieLiczb2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a :");
        Integer a = scanner.nextInt();
        System.out.println("Podaj liczbe b :");
        Integer b = scanner.nextInt();
        try{
            System.out.println("a podzielone przez b daje " + a/b);
        } catch (ArithmeticException ex) {
            System.out.println("Niedozwolona operacha dzielenia przez 0. Zostanie wykonane dzielenie przez 1");
            System.out.println(a/1);
        }


    }
    private void pobierzInformacjeZPliku() throws FileNotFoundException {

        Scanner scan = new Scanner(
                new File("src/main/java/resources/test.txt")
        );
        System.out.println(scan.nextLine());
    }

}

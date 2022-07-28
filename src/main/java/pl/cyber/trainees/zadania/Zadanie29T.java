package pl.cyber.trainees.zadania;

import java.util.Scanner;

public class Zadanie29T {
    public void MojWiek(String wiek) {
        System.out.println("Mam " + wiek + " lat.");
    }
    public void MojeImie(String imie) {
        System.out.println("Nazywam sie " + imie );
    }

    Scanner keyboard = new Scanner(System.in);

    public void CzyParzysta(Integer wybranaLiczba) {
        System.out.println("Wprowadz dowolna liczbe");
        int liczba = keyboard.nextInt();

        if (liczba%wybranaLiczba == 0) {
            System.out.println("Liczba " + liczba + " jest podzielna przez " + wybranaLiczba);

        } else {
            System.out.println("Liczba " + liczba + " nie jest podzielna przez " + wybranaLiczba);
        }

    }
    public void CzyPodzielna(Integer i1, Integer i2) {

        int liczba1 = 15;
        boolean naszaLiczba;

        naszaLiczba = liczba1 % i1 == 0 && liczba1 % i2 == 0;

        System.out.println("Czy liczba " + liczba1 + " jest podzielna przez " + i1 +" oraz " + i2 + ": " + naszaLiczba);
        }
    public void CzyPodzielna2(Integer i1, Integer i2) {

        System.out.println("Wprowadz dowolna liczbe");

        int liczba = keyboard.nextInt();
        boolean naszaLiczba;

        naszaLiczba = liczba % i1 == 0 && liczba % i2 == 0;

        System.out.println("Czy liczba " + liczba + " jest podzielna przez " + i1 +" oraz " + i2 + ": " + naszaLiczba);

    }

    public void CzyPodzielna3(Integer i1, Integer i2) {

        System.out.println("Wprowadz dowolna liczbe");
        int liczba1 = keyboard.nextInt();

        boolean naszaLiczba;

        if (liczba1%i1==0){
            naszaLiczba = true;
            System.out.println("Liczba " + liczba1 + " jest podzielna przez " + i1 + ": " + naszaLiczba);
        } else {
            if (liczba1%i2==0){
                naszaLiczba = true;
                System.out.println("Liczba " + liczba1 + " jest podzeielna przez " + i2 + ": " + naszaLiczba);
            } else {
                System.out.println("Liczba " + liczba1 + " nie jest podzielna przez: " + i1 + " i " + i2 );
            }
        }

        naszaLiczba = liczba1 % i1 == 0 && liczba1 % i2 == 0;

        System.out.println("Czy liczba " + liczba1 + " jest podzielna przez " + i1 +" oraz " + i2 + ": " + naszaLiczba);
    }
    public void Potega(Integer p1){
        System.out.println("Wprowadz dowolna liczbe");
        int liczba = keyboard.nextInt();
        double potega = Math.pow(liczba, p1);
        double pierwiastek = Math.sqrt(liczba);

        System.out.println("Liczba " + liczba + " podniesiona do potegi " + p1 + " daje " + potega);
        System.out.println("Pierwiastek kwadratowy z liczby " + liczba + " to " + pierwiastek);

    }





/*    1. Napisz metodę, która zwróci Twój aktualny wiek.
            2. Napisz metodę, która zwróci Twoje imię,
            3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
    parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2
    np. 2 % 2
            4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
            5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
np. Math.pow(2,3)
        6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
Math.sqrt(number)

 */
}

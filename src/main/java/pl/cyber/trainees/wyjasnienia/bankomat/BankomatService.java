package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankomatService {

    Scanner scanUser = new Scanner(System.in);
    private Bankomat bankomat;

    public BankomatService(){
        this.bankomat =  new Bankomat();

    }

    public BankomatService(final Bankomat bankomat) {
        this.bankomat = bankomat;
    }

    private boolean menu(final int pozycja) {

        Integer kwota = 0;
        try {
            switch (pozycja) {
                case 1:
                    System.out.println("Wplacam gotowke");
                    System.out.print("Podaj kwote wplaty: ");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzaneKwoty(kwota);

                    bankomat.wplacGotowke(kwota);
                    break;
                case 2:
                    System.out.println("Wyplacam gotowke");
                    System.out.print("Podaj kwote wyplaty");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzaneKwoty(kwota);

                    bankomat.sprawdzWyplate(kwota);
                    bankomat.wyplacGotowke(kwota);
                    break;
                case 3:
                    System.out.println("Stan konta");
                    System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                    break;
            }
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidlowej liczby odoszacej sie do wplaty/wyplaty");
        }

        return pozycja != 4;
    }

    private void sprawdzWprowadzaneKwoty(final Integer kwota) {
        List<Integer> lista = List.of(10, 20, 50, 100, 200, 500);
        if (!lista.contains(kwota)) {
            throw new BusinessException("Wprowadz poprawna kwote z zakresu " + lista);
        }
    }

    public void uruchomRozwiazanie1() {

        boolean czyKontynuowac;

        do {

            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Przerwij Operację");

            Integer userInfo = 4;
            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidlowej liczby z menu.");
            }

            czyKontynuowac = menu(userInfo);


        } while (czyKontynuowac);

    }

    public void uruchomRozwiazanie2() {

        List<Karta> karty = List.of(
                new Karta(12345678, 1234, 1000),
                new Karta(33345678, 9876, 2000)
        );

        boolean czyKontynuowac;
        boolean czyPrawidlowaKarta = false;
        Karta karta = null;

        System.out.println("Wloz karte");
        Integer nrkarty = scanUser.nextInt();
        System.out.println("Wprowadz pin dla karty");
        Integer pinKarty = scanUser.nextInt();

        for (Karta el : karty) {
            if (el.getNrKarty().equals(nrkarty)) {
                el.sprawdzNrPin(pinKarty);
                czyPrawidlowaKarta = true;
                karta = el;
            }
        }
        if (!czyPrawidlowaKarta || karta == null) {
            throw new BusinessException("Wprowadzono bledne dane karty");
        }

        /* ALTERNATYWA DO FORA
        karta = karty.stream()
                .filter(Objects::nonNull) // .filter(element -> Objects.nonNull(element)
        //wewnatrz stremow np. w metodzie filter uzywamy tzw wyrazenia lambda (->)
         //       .allMatch(karta1 -> karta1 instanceof Karta);
                .filter(element -> element.getNrKarty().equals(nrkarty))
                .findFirst()
                .orElseThrow(()-> {
                    throw new BusinessException("Wprowadzono bledne dane karty");
                });

        */
        /*
 l114
 List<Karta> karty = List.of(null, new Karta(12345678, 1234, 1000), new Karta(33345678, 9876, 2000));

 l115
 List<Karta> karty = List.of(new Karta(12345678, 1234, 1000), new Karta(33345678, 9876, 2000));


 przykład1 użytkownik podał 12345678 [
 List<Karta> karty = List.of(new Karta(12345678, 1234, 1000));

 l115
 new Karta(12345678, 1234, 1000)
 ]

 przykład2 użytkownik podał 45678 [
 List<Karta> karty = List.of();

 l115
 zwróci exception

 l116
 przejmuje kontrolę oraz rzuci wyjątek typu BusinessException z opisem Wprowadzono bledne dane karty

         */


        do {

            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Sprawdź stan konta karty");
            System.out.println("0. Przerwij Operację");

            Integer userInfo = 0;
            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidlowej liczby z menu.");
            }

            czyKontynuowac = menu2(userInfo, karta);


        } while (czyKontynuowac);

    }

    private boolean menu2(final Integer pozycja, Karta karta) {

        Integer kwota = 0;

        try {
            switch (pozycja) {
                case 1:
                    System.out.println("Wpłacam gotówkę");

                    System.out.print("Proszę podać kwotę wpłaty: ");
                    kwota = scanUser.nextInt();
                    dokonajWplaty(kwota, karta);

                    break;

                case 2:
                    System.out.println("Wypłacam gotówkę");
                    System.out.print("Proszę podać kwotę wypłaty: ");
                    kwota = scanUser.nextInt();
                    dokonajWyplaty(kwota, karta);
                    break;

                case 3:
                    System.out.println("Stan konta");
                    System.out.println("Bankomant posiada: " + bankomat.stanKonta());
                    break;
                case 4:
                    System.out.println("Saldo karty");
                    System.out.println("Na karcie posiadasz: " + karta.stanKonta());
                    break;
            }
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty.");
        } return pozycja!=0;
    }

    private void dokonajWplaty(final Integer kwota, Karta karta){
        sprawdzWprowadzaneKwoty(kwota);

        bankomat.wplacGotowke(kwota);
        karta.wplacGotowke(kwota);

    }
    private void dokonajWyplaty(final Integer kwota, Karta karta){
        sprawdzWprowadzaneKwoty(kwota);

        bankomat.sprawdzWyplate(kwota);
        karta.sprawdzWyplate(kwota);
        bankomat.wyplacGotowke(kwota);
        karta.wyplacGotowke(kwota);

    }
}

package pl.cyber.trainees.wyjasnienia.bankomat
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class KartaSpec extends Specification {
    private Karta underTest

    static def nrKartyStub = 12345678
    @Shared
    def pinKartyStub = 1234
    static def saldoStub = 0

    void setup() {
    //    underTest = new Karta(1241,123,12)
    }

    def "Subject"(){
        given: //sekcja w ktorej robimy mokowanie obiektow, inicjalizujemy zmienne lokalne dla przypadku testowego
        // sekcja given jest sekcja nieobowiazkowa

        when: //sekcja w ktorej wykonujemy nasz przypadek testowy i zazwyczaj powinnismy deklarowac w tym miejscu
        //parametr, ktory bedzie naszym wynikiem

        def result = "test"

        then: // sekcja w ktorej weryfikujemy nasze zalozenia w ramach przypadku testowego
        noExceptionThrown() // metoda, ktora stosujemy zawsze, jesli moj przypadek testowy nie powinien rzucac Exceptiona
        result == "test"

        /*
        where: //sekcja w ktorej bedziemy deklarowali wiele parametrow wejsciowych oraz przewidywane ich wyniki
        ___________________________________________________________________________
        struktura:

        where:
        parametr1 | paramert2 || wynik
        1241 | 1515 || 988651

         */


    }
    def "Przyklad niezwiazany z obiektem Karta"(){
        given:

        def zmienna1 = 2
        def zmienna2 = 5

        when:

        def result = zmienna1 + zmienna2
        printf(result as String) //printf() metoda. ktora ma za zadanie wyswietlanie wartosci na konsole
        //result as String -> przez okreslenie as String mowimy ze nasz wynik ma byc castowany na Stringa

        then:
        noExceptionThrown()


    }
    @Unroll //adnotacja ktorej uzywamy zwykle przy tworzeniu testow z wykorzystaniem where
    //pozwala na rozbicie (w oknie run) przypadku testowego na oddzielne testy
    def "Przyklad niezwiazany z obiektem Karta z wykorzystaniem where"(){

        when:

        def result = zmienna1 + zmienna2

        then:
        noExceptionThrown()
        result == expectedResult

        where:
        zmienna1   | zmienna2    || expectedResult
        1          | 1           || 2
        10         | 100         || 110
        -10        | 10          || 0
        -100       | -100        || -200


    }

    def "Powinien prawidlowo utworzyc obiekt karta przez konstruktor oraz zweryfikowac jego parametry"(){

        when:
            def result = new Karta(nrKartyStub,pinKartyStub, saldoStub)
        then:
        noExceptionThrown()
        result !=null
        result.nrKarty==nrKartyStub
        result.pinKarty==pinKartyStub
        result.saldo==saldoStub

    }

    def "Powinien prawidlowo utworzyc obiekt karta przez konstruktor oraz zweryfikowac czy uzytkownik podal prawidlowo nr Pin. Happy Path"(){
        given:
        def pinFormUser = 1234
        underTest = new Karta(nrKartyStub,pinKartyStub,saldoStub)
        when:
        underTest.sprawdzNrPin(pinFormUser)

        then:
        noExceptionThrown()


    }

    def "Powinien prawidlowo utworzyc obiekt karta przez konstruktor oraz zweryfikowac czy uzytkownik podal prawidlowo nr Pin. not Happy Path"(){
        given:
        underTest = new Karta(nrKartyStub,pinKartyStub,saldoStub)
        when:
        underTest.sprawdzNrPin(pinFormUser)

        then:
        def err = thrown(expected)
        err.message == expectedMessage

        where:
        pinFormUser || expected         | expectedMessage
        8888        || KartaException   | "Niepoprawny pin"
        9999        || KartaException   | "Niepoprawny pin"
        1010        || KartaException   | "Niepoprawny pin"
        7567        || KartaException   | "Niepoprawny pin"

    }

    def "powinno wyswietlic saldo karty"(){
        given:
        underTest = new Karta(nrKartyStub,pinKartyStub,saldoStub)
        when:
        def result = underTest.stanKonta()


        then:
        noExceptionThrown()
        result == saldoStub

    }

    def "powinno wplacic oraz wyplacic gotowke oraz wyswietlic saldo karty"(){
        given:
        underTest = new Karta(nrKartyStub,pinKartyStub,saldoStub)
        when:

        underTest.wplacGotowke(100)
        def result = underTest.stanKonta()


        then:
        noExceptionThrown()
        result == 100

    }



    // test na sprawdzenie wyplaty happy path i exception
    // testy na klasy

}

// TDD - Test Driven Development
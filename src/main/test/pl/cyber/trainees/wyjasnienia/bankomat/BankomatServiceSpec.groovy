package pl.cyber.trainees.wyjasnienia.bankomat


import spock.lang.Specification

class BankomatServiceSpec extends Specification {
    private BankomatService underTest = new BankomatService()
    private  Bankomat  bankomat
    void setup(){
        bankomat = Mock()
    }

    def "Sprawdzam wybrana poz nr 0 tj. przerwij operacje"() {

        when:
        def result = underTest.menu2(0,null)

        then:
        noExceptionThrown()
        //result == false
        !result
    }

    def "Powinien dokonac wplaty gotowki"(){
        given:
            bankomat.stanKonta() >> 50
            def karta = new  Karta(1234,1234,1000)

        when:
        underTest.dokonajWplaty(50,karta)

        then:
        noExceptionThrown()
        bankomat.stanKonta() == 50
        karta.stanKonta() == 1050
    }
    def "Powinien dokonac wyplaty gotowki"(){
        given:
        def karta = new  Karta(1234,1234,1000)
        def bankomat = new Bankomat()
        underTest = new BankomatService(bankomat)
        bankomat.wplacGotowke(1000)

        when:
        underTest.dokonajWyplaty(50,karta)

        then:
        noExceptionThrown()
        karta.stanKonta() == 950
    }

    def "Wyswietlanie pozycji 3 z menu2"(){
        given:
        def karta = new  Karta(1234,1234,1000)
        def bankomat = new Bankomat()
        underTest = new BankomatService(bankomat)
        bankomat.wplacGotowke(1000)

        when:
        underTest.menu2(3,karta)

        then:
        noExceptionThrown()
        bankomat.stanKonta() == 1000
    }

}

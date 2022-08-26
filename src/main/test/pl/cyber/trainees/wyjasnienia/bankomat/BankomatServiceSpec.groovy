package pl.cyber.trainees.wyjasnienia.bankomat


import spock.lang.Specification

class BankomatServiceSpec extends Specification {
    private BankomatService underTest = new BankomatService()

    def "Sprawdzam wybrana poz nr 0 tj. przerwij operacje"() {

        when:
        def result = underTest.menu2(0,null)

        then:
        noExceptionThrown()
        //result == false
        !result
    }

}

package pl.cyber.trainees.dziedziczenie;

//klasa okreslajaca marke pojazdu
public class Pojazd {

    private String marka;
    private String rocznik;
    private String naped;

    public Pojazd() {
        marka = "";
        rocznik = "";
        naped = "";
    }
// ALT + Insert - wywolanie menu kontekstowego -> wybieramy Constructor

    public Pojazd(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }

    public String toString() {
        return "Marka: " + this.marka
                + "rocznik: " + this.rocznik
                + "naped: " + this.naped;
    }

    // get - metody, ktorych zadaniem jest pobieranie info z pol klasy
    // do dalszego przetwarzania
    public String getMarka() {
        return marka;
    }
    public String getRocznik() {
        return rocznik;
    }
        public String getNaped() {
            return naped;
        }

}

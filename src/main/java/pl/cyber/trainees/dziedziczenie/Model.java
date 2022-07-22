package pl.cyber.trainees.dziedziczenie;

//extends - slowo kluczowe stosowane przy dziedziczenu klas
//zapisujemy po klasie

public class Model extends Pojazd {

    private String nazwa;
    private Integer przebieg;
    private Double pojemonscSilnika;
    private Kolor kolor;

    public Model() {
        //klasa powyzej powinna pozostac pusta
        // super - slowo kluczowe odnosi sie do konstruktora klasy nadrzednej
        super();
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemonscSilnika = 0.0;
        this.kolor = null;
    }

    public Model(
            final String marka, final String rocznik,
            final String naped, final String nazwa,
            final Integer przebieg,
            final Double pojemonscSilnika,
            final Kolor kolor) {
        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemonscSilnika = pojemonscSilnika;
        this.kolor = kolor;
    }
    //przyslanianie metod - nadawanie nowej funkcjonalnosci do
    @Override //andontacja do wykorzystywania przyslaniania metod
    public String toString() {
        return " Marka: " + getMarka()
            + " rocznik: " + getRocznik()
            + " naped: " + getNaped()
            + " nazwa modelu: " + this.nazwa
            + " przebieg: " + this.przebieg
            + " pojemonscSilnika: " + this.pojemonscSilnika
            + " kolor: " + this.kolor;
    }
    public String getNazwa() {
        return nazwa;
    }

    public Double getPojemonscSilnika() {
        return pojemonscSilnika;
    }
    public Integer getPrzebieg() {
        return przebieg;
    }
    public Kolor getKolor() {
        return kolor;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setPrzebieg(Integer przebieg) {
        this.przebieg = przebieg;
    }

    public void setPojemonscSilnika(Double pojemonscSilnika) {
        this.pojemonscSilnika = pojemonscSilnika;
    }

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;
    }



    // Ctrl + spacja - skrot do elementw ktore mozna wybrac
    // np. zadeklarowane zmienne
}

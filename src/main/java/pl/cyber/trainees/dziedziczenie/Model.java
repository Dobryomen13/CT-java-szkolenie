package pl.cyber.trainees.dziedziczenie;

//extends - slowo kluczowe stosowane przy dziedziczenu klas
//zapisujemy po klasie

public class Model extends Pojazd {

    private final String nazwa;
    private final Integer przebieg;
    private final Double pojemonscSilnika;
    private final Kolor kolor;

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
        return "Marka: " + getMarka()
            + "rocznik: " + getRocznik()
            + "naped: " + getNaped()
            + "nazwa modelu: " + this.nazwa
            + "przebieg: " + this.przebieg
            + "pojemonscSilnika: " + this.pojemonscSilnika
            + "kolor: " + this.kolor;
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
}

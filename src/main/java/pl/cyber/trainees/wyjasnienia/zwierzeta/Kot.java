package pl.cyber.trainees.wyjasnienia.zwierzeta;

import java.time.LocalDate;
import java.util.List;

public class Kot extends Zwierze {
    private final String imieKota;
    private final LocalDate dataUrodzenia;
    private Double wagaKota;
    public String imieOpiekuna;

    public Kot(
            final String imieKota,
            final LocalDate dataUrodzenia,
            final Double wagaKota,
            final String imieOpiekuna) {
        super(0.0,true);
        this.imieKota = imieKota;
        this.dataUrodzenia = dataUrodzenia;
        this.wagaKota = wagaKota;
        this.imieOpiekuna = imieOpiekuna;
    }

    public Kot(
            final Double wrost,
            final boolean czyMaSiersc,
            final String imieKota,
            final LocalDate dataUrodzenia,
            final Double wagaKota,
            final String imieOpiekuna) {
        super(wrost, czyMaSiersc);
        this.imieKota = imieKota;
        this.dataUrodzenia = dataUrodzenia;
        this.wagaKota = wagaKota;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImieKota() {
        return imieKota;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Double getWagaKota() {
        return wagaKota;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void przedstawSie() {
        System.out.println("Imie kota: " + getImieKota() + "\ndata urodzenia: " + getDataUrodzenia() + ", waga: " + getWagaKota() + "\nopiekun: " + getImieOpiekuna());
    }

    @Override
    public String dajGlos() {
        return "miau";
    }

}

/*
  Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

    imię (ciąg znaków)
    data urodzenia (data) - LokalDate, LokalDateTime
    waga (liczba zmiennoprzecinkowa)
    imię opiekuna (ciąg znaków)

  Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
        ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
   */


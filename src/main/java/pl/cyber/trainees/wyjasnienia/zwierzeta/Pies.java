package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;

public class Pies extends Zwierze {
    private final String imiePsa;
    private final LocalDate dataUrodzenia;
    private Double wagaPsa;
    public String imieOpiekuna;

    public Pies (){
        super(null, false);
        imiePsa = "";
        dataUrodzenia = LocalDate.now();
    }

    public Pies(final Double wrost,
                final boolean czyMaSiersc,
                final String imiePsa,
                final LocalDate dataUrodzenia,
                final Double wagaPsa,
                final String imieOpiekuna) {
        super(wrost, czyMaSiersc);
        this.imiePsa = imiePsa;
        this.dataUrodzenia = dataUrodzenia;
        this.wagaPsa = wagaPsa;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImiePsa() {
        return imiePsa;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Double getWagaPsa() {
        return wagaPsa;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void przedstawSie() {
        System.out.println("Imie psa: " + getImiePsa() + "\ndata urodzenia: " + getDataUrodzenia() + ", waga: " + getWagaPsa() + "\nopiekun: " + getImieOpiekuna());
    }

    @Override
    public String dajGlos() {
        return "hau, hau";
    }

    public Pies convertFromFile (String rowInFile){
        String [] tablicaPliku = rowInFile.split(",");

        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Pies(
                Double.valueOf(tablicaPliku[5]),
                Boolean.parseBoolean(tablicaPliku[6]),
                tablicaPliku[1], dataUrodzenia,
                Double.valueOf(tablicaPliku[3]),
                tablicaPliku[4]);

    }
}

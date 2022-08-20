package pl.cyber.trainees.wyjasnienia.zwierzeta;

public class Zwierze {
    private final Double wrost;
    private final boolean czyMaSiersc;

    public Zwierze(Double wrost, boolean czyMaSiersc) {
        this.wrost = wrost;
        this.czyMaSiersc = czyMaSiersc;
    }

    public Double getWrost() {
        return wrost;
    }

    public boolean isCzyMaSiersc() {
        return czyMaSiersc;
    }

    public String dajGlos() {
        return "b/d";
    }

    public String dajGlos2() {
        return "nic";
    }
}

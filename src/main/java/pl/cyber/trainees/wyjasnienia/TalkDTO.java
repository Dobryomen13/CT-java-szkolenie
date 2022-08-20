package pl.cyber.trainees.wyjasnienia;

//DTO -> Data Transfer Object
    /* inaczej mowiac obiekt Javowy, ktorego zadaniem jest przenoszenie specyficznych  danych

    najczęstsze wykorzystanie:
    1) komunikacja klient - sewrwer, innymi słowy Frontend - Backend, Aplikacja Mobile - Backend
    2) komunikacja baza danych - backend

    cechy szczegolne obiektow:
    1) pola (parametry) opisujace konkretny obiekt np. Samohod np. marka, kolor, przebieg, itd.
    2) posiadaja konstruktor do prawidlowego utworzenia obiektu danej klasy
    3) posiada konkretne metody odwolujace sie do utworzonego obiektu
           (metody typu Getter, Setter, toString, itd)
    4) moze posiadac wewnetrznie swoj konwerter (opcja)
        np. do konwersji obiektu DTO bazy danych (Encji) na obiekt do reprezentacji dla aplikacji Frontendowej
     */

import pl.cyber.trainees.Wyjatek.UncheckedExeption;

/*
Rodzaje obiektow w javie:
POJO - Plain Old JAVA Object - reprezentuje obiekty bez adnotacji
DTO - Data Transfer Object - obiekty, ktore przesylaja informacje
Encja - obietk DTO, ktory ma za zadanie reprezentowac strukture tabeli bazy danych
ValueObject - obiekt z jednym parametrem (posiadaja tylko metode getter bez settera), ktory waliduje poprawna strukture.
Tzn czy parametr nie jest NULL i czy pospiada wartosc
 */

import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

public class TalkDTO {
    private final String tematRozmowy;
    public String opis; //bez modyfikatora private i ustawienia zmiennej jako final możemy dopuścić sytuację,
    // w której nieświadomie damy możliwość zmiany wartości parametru klasy
    private List<String> przyklady;

    public TalkDTO(
            final String tematRozmowy,
            final String opis,
            final List<String> przyklady
    ) {

        this.tematRozmowy = tematRozmowy;
        this.opis = opis;
        this.przyklady = przyklady;
    }

    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public String getOpis() {
        return opis;
    }

    public void setPrzyklady(final List<String> przyklady) {
        this.przyklady = przyklady;
    }

    public void setOpis(final String opis) {
        this.opis = opis;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public void modifyList(List<String> wiecejPrzykladow) {
        this.przyklady.addAll(wiecejPrzykladow);
    }
}



  /*
  public TalkDTO(
      final String tematRozmowy,
      final List<String> przyklady) {
    if(przyklady == null || przyklady.isEmpty()) {
      throw new UncheckedException("parametr przyklady jest pusty");
    }
    this.tematRozmowy = tematRozmowy;
    this.przyklady = przyklady;
//    this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;
    //postać równoważna do: this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;
    /*
        IV konstrukcja warunkowa if
        przyklady.isEmpty() ? new ArrayList<>() : przyklady
        wszystko przed znakiem ? to jest warunek sprawdzający czyli if(przyklady.isEmpty())
        między znakiem ? a znakiem : znajduje się instrukcja, jeżeli true inaczej mówiąc zawartość pierwszego bloku w instrukcji if
        wszystko po znaku : znajduje się instrukcja, jeżeli false, inaczej mówiąc zawartość bloku w instrukcji else
     */

//    if (przyklady == null || przyklady.isEmpty()) {
//      this.przyklady = new ArrayList<>();
//    } else {
//      this.przyklady = przyklady;
//    }

  /*
  }
  public String getTematRozmowy() {
    return tematRozmowy;
  }
  public List<String> getPrzyklady() {
    return przyklady;
  }
  public String toString() {
    return "Informacja o klasie TalkDTO: { tematRozmowy: " + this.tematRozmowy
        + "\nPierwszy przykład: " + this.przyklady.get(0) + " }";
  }
}
*/
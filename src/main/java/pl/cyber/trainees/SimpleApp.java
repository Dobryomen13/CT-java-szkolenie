package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.dziedziczenie.Pojazd;

import java.util.ArrayList;
import java.util.List;


public class SimpleApp {
    public static void main(String[] args) {
        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
        "przod",  "Passat",  1000, 2.0, Kolor.GREEN);

        modelPojazdu1.setKolor(Kolor.RED);
        modelPojazdu1.setMarka("Ford");
        modelPojazdu1.setNaped("4x4");
        modelPojazdu1.setRocznik("1967");
        modelPojazdu1.setNazwa("Mustang Shelby");
        modelPojazdu1.setPojemonscSilnika(2.0);
        modelPojazdu1.setPrzebieg(0);

     //   System.out.println(modelPojazdu2.toString());
            System.out.println(modelPojazdu1);

        List<String> strings = new ArrayList<>();
        strings.add("raz");
        strings.add("dwa");

        System.out.println(strings);


     // kolekcje w java to zbiory danych
     /* 4 rodzaje kolekcji:
         1. List - list - gwarantuje kolejnosc
         2. Set - zbior - nie gwarantuje kolejnosci
         3. Map - mapa - przechowuje wartosc jako klucz
         4. Queue - kolejka - podobnie do listy, ale mozemy stosowac
         algorytmy LIFO i FIFO
         LIFO - Last In First Out
         FIFO - First In First Out

         Najpopularniejsze implementacja:
         List:
         ArrayList() - talica listy, ktora nie przechowuje info o poprzednim i nastepnym rekordzie
         LinkedList() -  talica listy, ktora przechowuje info o poprzednim i nastepnym rekordzie

         String nowyString = "";
         List<Model> modele = new ArrayList<>(); w <> przechowujemy kokretny typdanych
         modele.add(modelPojazdu1);

         List<String> lista = new ArrayList<>();

         List<String> lista = new ArrayList<String


       */
    }

}

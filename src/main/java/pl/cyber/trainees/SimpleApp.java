package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.dziedziczenie.Pojazd;
import pl.cyber.trainees.kalkulator.Dodawanie;
import pl.cyber.trainees.service.OdczytDanych;
import pl.cyber.trainees.zadanie.Zadanie1;
import spotkania.Petle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class SimpleApp {
    public static void main(String[] args) throws FileNotFoundException {

      Zadanie1 home = new Zadanie1();
      home.rozwiazanie1();
/*
        OdczytDanych odczytDanych = new OdczytDanych();

        System.out.println("Jak masz na imie?");

        String firstName = odczytDanych.wprowadzonaWartoscZKlawiatury();
        System.out.println("Witaj " + firstName + "!!!");

        String firstNameFromFile = odczytDanych.daneZPliku(new File("src/main/resources/dane-zew.txt"));
        Model modelPojazduZPliku = odczytDanych.daneModeluPojazdu(new File("src/main/resources/modelPojazdu.txt"));

        System.out.println(firstNameFromFile);
        System.out.println("Moj samochod to " + modelPojazduZPliku);

        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
        "przod",  "Passat",  1000, 2.0, Kolor.GREEN);

        modelPojazdu1.setMarka("Ford");
        modelPojazdu1.setRocznik("1967");
        modelPojazdu1.setNaped("tyl");
        modelPojazdu1.setNazwa("Mustang Shelby");
        modelPojazdu1.setPrzebieg(0);
        modelPojazdu1.setPojemonscSilnika(2.0);
        modelPojazdu1.setKolor(Kolor.RED);


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

        /*

        List<Double>listaDouble = new ArrayList<>(Arrays.asList(
                1.0,
                3.6,
                4.7,
                20.6,
                31.0
        ));
        listaDouble.add(39.1);

        Petle petle = new Petle();
        petle.wyswielliczby();
        petle.dodawanieElementow(listaDouble);

        petle.wyswietlSet();

         */
        }



        }



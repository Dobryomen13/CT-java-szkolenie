package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.Wyjatek.MojPierwszyException;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Kot;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Pies;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Zwierze;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Obiekty {
    private void wyswietlTalkDTO() {
        List<String> list = new ArrayList<>();
        list.add("przyklad1");

        TalkDTO talkDTO = new TalkDTO("Obiektowsc", "Operacje na obiektach", list);
//    System.out.println(talkDTO.toString());
//    System.out.println("Dziś zajmujemy się tematem: " + talkDTO.getTematRozmowy());

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.opis);

        talkDTO.opis = "";

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        talkDTO.setOpis("12314521");

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        System.out.println(talkDTO.getPrzyklady());

        List<String> wiecej = new ArrayList<>();
        wiecej.add("przyklad2");
        wiecej.add("przyklad3");

        talkDTO.modifyList(wiecej);

        System.out.println(talkDTO.getPrzyklady());

        List<String> wiecej2 = new ArrayList<>();
        wiecej2.addAll(talkDTO.getPrzyklady());
        wiecej2.add("przyklad4");

        talkDTO.setPrzyklady(wiecej2);

        System.out.println(talkDTO.getPrzyklady());

        TalkDTO talkDTOv2 = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);
        System.out.println(talkDTOv2.getPrzyklady());

    }


    private void wyswietlKot() {
        Kot kot = new Kot("Stinky", LocalDate.of(2017, 05, 27), 4.5, "Karolina");
        kot.przedstawSie();
        //   System.out.println("Imie kota: " + kot.getImieKota() + ", data urodzenia: " + kot.getDataUrodzenia() + " waga: " + kot.getWagaKota() + ", opiekun: " + kot.getImieOpiekuna());
    }

    private void zadanie2() {
        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Stinky", LocalDate.of(2017, 03, 27), 4.5, "Karolina"));
        koty.add(new Kot("Dexter", LocalDate.of(2015, 11, 13), 6.0, "Karolina"));
        koty.add(new Kot("Max", LocalDate.of(2013, 8, 27), 5.5, "Karolina"));

        for (Kot kot : koty) {
            kot.przedstawSie();
        }

    }

    private void zadanie3() {
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(1.0, true, "Stinky", LocalDate.of(2017, 03, 27), 4.5, "Karolina"));
        zwierze.add(new Kot("Dexter", LocalDate.of(2015, 11, 13), 6.0, "Witold"));
        zwierze.add(new Kot("Flerken", LocalDate.of(2020, 8, 27), 4.0, "Witold"));

        for (Zwierze zwierz : zwierze) {
            if (zwierz instanceof Kot) {
                ((Kot) zwierz).przedstawSie();
            }
            System.out.println("Wzrost: " + zwierz.getWrost());
            System.out.println("Czy ma siersc: " + zwierz.isCzyMaSiersc());
        }

    }

    /*
    zadanie nr 3
     */

    /*
    zadanie 4
    utworzyc klasw pies, ktora dziedziczy po klasie Zwierze
    utworzyc liste 3 kotow i 1 psa, dodac je do List<Zwierze>
    a nastepnie niech kazdy sie przedstawi
    dodatkowo wywolac metode (skorzystamy z przyslaniania metod) dajGlos()
     */
    private void zadanie4() {
        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(0.3, true, "Stinky", LocalDate.of(2017, 03, 27), 4.5, "Karolina"));
        zwierze.add(new Kot("Dexter", LocalDate.of(2015, 11, 13), 6.0, "Witold"));
        zwierze.add(new Kot("Flerken", LocalDate.of(2020, 8, 27), 4.0, "Ola"));
        zwierze.add(new Pies(2.0, true, "Max", LocalDate.of(2013, 1, 1), 30.0, "Witold"));

        for (Zwierze zwierz : zwierze) {
            if (zwierz instanceof Kot) {
                ((Kot) zwierz).przedstawSie();

            } else {
                if (zwierz instanceof Pies) {
                    ((Pies) zwierz).przedstawSie();
                }
            }
            System.out.println("Wzrost: " + zwierz.getWrost());
            System.out.println("Czy ma siersc: " + zwierz.isCzyMaSiersc());
        }

        for (Zwierze zwierz : zwierze) {
            if (zwierz instanceof Kot) {
                System.out.println(((zwierz).dajGlos()));
                System.out.println(zwierz.dajGlos2());
            } else {
                if (zwierz instanceof Pies) {
                    System.out.println((zwierz).dajGlos());
                }
                System.out.println(zwierz.dajGlos2());

            }

        }
    }


        /*
    zadanie 5
    Utworzyc Enum o nzawie Zwierze, w ktorym beda dostepne opcje:
    -KOT
    -PIES

    utworzyc liste 3 kotow i 1 psa, poprzez utworzenie pliku zwierzeta.txt
    nastepnie odczytanie pliku przez aplikacje

    nastepnie dodac zwierzeta do List<Zwierze> przy uzyciu Enuma
    a nastepnie niech kazdy sie przedstawi
    dodatkowo wywolac metode (skorzystamy z przyslaniania metod) dajGlos()
     */

    private void zadanie5(){
        File file = new File("src/main/resources/zwierzeta.txt");

        List<Zwierze> zwierzeList = pobierzInformacjeZPliku(file);

        for (Zwierze zwierz : zwierzeList) {
            ((Pies)zwierz).przedstawSie();

        }

    }

    private List<Zwierze> pobierzInformacjeZPliku(File file){
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new MojPierwszyException("Kominikat naszego bledu");
        }

        List<Zwierze> zwierzeta = new ArrayList<>();

        while (scan.hasNext()){
            String rowInFile = scan.nextLine();
            String [] tablicaPliku = rowInFile.split(",");
            if ("PIES".contains(tablicaPliku[0])) {
                Pies pies = new Pies();
                zwierzeta.add(pies.convertFromFile(rowInFile));
            }
        }
        return zwierzeta;

    }

    /*
    zadanie 6

    utworzenie 2 innych typow zwierzat oraz ich przedstawienie
     */

    public void uruchom() {

        //    wyswietlTalkDTO();
    //    wyswietlKot();
    //    zadanie2();
    //    zadanie3();
        zadanie4();
    //    zadanie5();

        DateConverter dateConverter = new DateConverter();
        try {
            System.out.println(dateConverter.stringToDate("2022/05/11"));
        } catch(
                ParseException e)

        {
            throw new RuntimeException(e);
        }
    }

}
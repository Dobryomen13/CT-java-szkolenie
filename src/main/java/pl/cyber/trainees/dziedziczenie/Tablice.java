package pl.cyber.trainees.dziedziczenie;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Tablice {
    /*
    Tworzenie tablic jednowymiarowych
    TypDanych[] nazwa_tablicy = new TypDanych[(int) zakres_tablicy];

    np.
    Integer[] tablicaInt = new Integer[10];
    Integer [] nowaTablica = {1, 2, 3, 4, 19};

    Zalecana forma:

    Integer[] nowaTablica = new Integer [5];
    nowaTablica[0] = 1;
    nowaTablica[1] = 2;
    nowaTablica[2] = 3;
    nowaTablica[3] = 4;
    nowaTablica[4] = 19;

     */

    /*
    Tworzenie tablic wielowymiarowych
    TypDanych[][] nazwa_tablicy = new TypDanych[(int) zakres_tablicy1][zakres_tablicy2];
    Integer[][] tablicaInt = new Integer[10][10]

    Integer[][] nowaTablica = new Integer[1][1]
    nowaTablica[0][0] = 1;
    nowaTablica[0][1] = 1;
    nowaTablica[1][0] = 1;
    nowaTablica[1][1] = 1;

     */
    /*
    Częsty blad przy tablicach
    ArrayIndexOutOfBoundsExeption - przekroczenie wielkosci tablicy

    Integer[] tablicaInt = new Integer [10];
    tablicaInt[11] = 2;
     */

    //zadanie 1
    //utworzyc tablice o wymiarze 5 elementow i przypisac do niej randomowe wartosci
    //nastepnie prosze o wyswietlenie wszystkich elementow tablicy (tak dziala while oraz for)


    public void tablica() {
        Integer[] nowaTablica = new Integer[5];
        Random random = new Random();
        Integer a = random.nextInt();
        Integer b = random.nextInt();
        Integer c = random.nextInt();
        Integer d = random.nextInt();
        Integer e = random.nextInt();

        nowaTablica[0] = a;
        nowaTablica[1] = b;
        nowaTablica[2] = c;
        nowaTablica[3] = d;
        nowaTablica[4] = e;

        System.out.println("Długość tablicy to " + nowaTablica.length);

        for (int i = 0; i < nowaTablica.length; i++) {
            System.out.println("Liczba " + nowaTablica[i]);

        }


    }

    //zadanie 2
    //utworzyc tablice o wymiarze 5 elementow i przypisac do niej randomowe wartosci
    //przy uzyciu obiektu Random z zakrsu 50 do 200
    //nastepnie prosze o wyswietlenie wszystkich elementow tablicy (tak dziala while oraz for)

    public void tablica2() {
        Integer[] nowaTablica = new Integer[5];
        Random random = new Random();

        Integer a = random.nextInt(150) + 50;
        Integer b = random.nextInt(150) + 50;
        Integer c = random.nextInt(150) + 50;
        Integer d = random.nextInt(150) + 50;
        Integer e = random.nextInt(150) + 50;

        nowaTablica[0] = a;
        nowaTablica[1] = b;
        nowaTablica[2] = c;
        nowaTablica[3] = d;
        nowaTablica[4] = e;

        System.out.println("Długość tablicy to " + nowaTablica.length);

        for (int i = 0; i < nowaTablica.length; i++) {
            System.out.println("Liczba " + nowaTablica[i]);

        }
    }

    // Zadanie nr 3
    // Zadanie nr 2 przerobic na liste

    public void Lista() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        list.add(random.nextInt(15));
        list.add(random.nextInt(15));
        list.add(random.nextInt(15));
        list.add(random.nextInt(15));
        list.add(random.nextInt(15));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Liczba listy " + list.get(i));


        }


    }
    //Zadanie nr 4
    // na przykladzie powyzszych zadan utworzyc tablice wielowymiarowa 10x10 i wypelnic losowymi danymi

    public void tablicaWielowymiarowa() {
        Integer[][] tablica1 = new Integer[10][10];
        Random random = new Random();
        for (int i =0; i <tablica1.length; i++){
            for (int j =0; j< tablica1.length;j++){
                tablica1[i][j] = random.nextInt(150)+50;
            }
        }
        for (int i =0; i<tablica1.length; i++) {
            for (int j =0; j<tablica1.length; j++ ){
                System.out.println(tablica1[i][j]);
            }
        }

    }

}


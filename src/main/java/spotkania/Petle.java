package spotkania;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Petle {

    public void silnia() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe calkowita");
        Integer n = scanner.nextInt();
        Integer s = 1;
        Integer i = 1;

        while (i<=n) {
            s *=i;
            i++;
        }
        System.out.println(s);

    }
    public Integer silniaRekurencyjna(Integer n) {
        if (n>1) {
            return n + silniaRekurencyjna(n-1);
        }
        else {
            return 1;
        }

    }



    // public static void main(String[] args) {
    public void wyswielliczby() {
        int liczba = 100;

        while (liczba > 0) {
            liczba--;
            if (liczba < 100) ;
        }
        for (int i = 0; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            }
            if (i == 100) {
                System.out.println(i + ".");
            }
        }
    }
    //  Zadanie nr 1
//  Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
//  a) wyświetli każdy element listy jeden po drugim
//  b) każdy element listy doda do siebie.

    /* public void rozwiazanieZadnie1(List<BigDecimal> list) {
         for (int i=0; i<10; i++) {
         }
         for (BigDecimal el:
         list) {

         }

     */
    public void Lista() {
        List<BigDecimal> lista = new ArrayList<>();
        //  lista.add(new BigDecimal(10.5));
        //  lista.add(new BigDecimal(20.5));
        //  lista.add(new BigDecimal(30.0));
        lista.add(BigDecimal.valueOf(10.0));
        lista.add(BigDecimal.valueOf(2.0));
        lista.add(BigDecimal.valueOf(5.6));
        lista.add(BigDecimal.valueOf(21.8));
        lista.add(BigDecimal.valueOf(2.1));
        lista.add(BigDecimal.valueOf(41.0));
        lista.add(BigDecimal.valueOf(14.0));
        lista.add(BigDecimal.valueOf(1.0));
        lista.add(BigDecimal.valueOf(4.0));

        rozwiazanieZadanie1(lista);
    }

    private void rozwiazanieZadanie1(List<BigDecimal> list) {
        BigDecimal sumaliczb = BigDecimal.ZERO;

        for (BigDecimal liczba : list) {

            System.out.println(liczba);
            sumaliczb = sumaliczb.add(liczba);

            System.out.println("Suma liczb " + sumaliczb);
        }
    }

    //zadanie choinka - klasyczne fory (2 fory)
    public void choinka() {
        String znakChoinki = "*";

    }


    public void choinkaRozbudowana(Integer wysokoscChoinki) {
 /*
 int <-> Integer
 double <-> Double
 BigInteger, BigDecimal
 long <-> Long
 etc.
*/

        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    private void choinkaRozbudowana2(Integer wysokoscChoinki) {

        Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
        System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
        System.out.println();

        for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) { //x = x + 2 /// x++
            Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
            for (int y = 0; y < spacje + x; y++) {
                if (y < spacje) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Zadanie
    // Utworzyc metode ktora przejdzie po liczbach 1 do 100 natomiast wyswietli tylko te, ktore sa podzielne przez 5

    public void SzukajPodzielnych() {

        Integer sumaLiczb = 0;
        Integer iloscLiczb = 0;

        for (int i = 1; i <= 100; i++) { //wtedy tu przy i musi byc int
            if (i % 5 == 0) {
                System.out.println(i);
                sumaLiczb = sumaLiczb +i;
                iloscLiczb += 1;
            }

            //else {
            // System.out.println();//nie potrzeba bo będą niepotrzebne puste wiersze
            //}
        }
        System.out.println(sumaLiczb);
        System.out.println(iloscLiczb);


    }

    /* WHILE oraz DO WHILE

    while(condition) {
    //blok kodu
    }

    do {
    //blok kodu
    } while(condtition)
     */

public void PierwszyProgram() {

    int liczba = 1;
    while (liczba == 1) {
        System.out.println("while to jest liczba " + liczba);
        liczba++;
    }
    do {
        System.out.println("do while to jest liczba " + liczba);
    } while (liczba == 23);

    }
    public void sumaLiczbZForIWhile(){
        //wykonac sume z liczb od 1 do 10 i nastpenie wykonac to samo przy uzyciu while/do-while
        // oraz wykorzystac if do porownania liczb jesli sie uzgodnia to wyswietlamy true
        Integer sumaLiczb = 0;
        Integer sumaLiczb2 = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            sumaLiczb = sumaLiczb + i;
        }
        System.out.println(sumaLiczb);

        int a = 1;
        while (a<=10) {
            sumaLiczb2 = sumaLiczb2 + a;
            System.out.println(sumaLiczb2);
            a++;
        }

        if (sumaLiczb==sumaLiczb2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        }
}












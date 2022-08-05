package pl.cyber.trainees;

import com.sun.jdi.PrimitiveValue;

public class InstrukcjeWarunkowe {

    private void wyswietlSwitch(Integer jakiDzienTygodnia) {
/*
  SWITCH

  switch (condition) {
      case 1:
        break;
      case 2:
        break;

        .
        .
        .
      default:

    }


    np.
    switch (zmienna) {
    case "ala":
        println("Tak");
        break;
    }

   */
        //Zadanie utworzyc metode, ktora na podany (String, Integer) poarametr wejsciowy wyswietli odpowiadajacy dzien tyg


        switch (jakiDzienTygodnia) {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieprawidlowy dzien");


        }
    }

    public void uruchom() {
        wyswietlSwitch(1);
        jakaPlec(Plec.MEZCZYZNA);
        jakaPlec(Plec.KOBIETA);
        jakaPlec2("kobieta");

    }

    /*

Zadanie Wykonać metodę która będzie iterować od 1 do 50 i wyświetli w konsoli odpowiednie napisy:

dla 0 → Wyświetlam zero
dla 5 → Wyświetlam 5
dla 10 → To jest 10
dla 30 → To jest liczba 30
dla 49 → To jest liczba 49
dla pozostałych → Wskazana liczba jest inna niż oczekiwana


*/
    public void Wyswietl() {
        for (int i = 1; i <= 50; i++) {
            switch (i) {
                case 0:
                    System.out.println("→ Wyświetlam zero");
                    break;
                case 5:
                    System.out.println("→ Wyświetlam 5");
                    break;
                case 10:
                    System.out.println("→ To jest 10");
                    break;
                case 30:
                    System.out.println("→ To jest liczba 30");
                    break;
                case 49:
                    System.out.println("→ To jest liczba 49");
                    break;
                default:
                    System.out.println("→ Wskazana liczba jest inna niż oczekiwana");


            }

        }

    }

    enum Plec {KOBIETA, MEZCZYZNA}
    public void jakaPlec(Plec plec){
        //Dla KOBIETA wyświetl "jestem kobieta"
        //Dla MEZCZYZNA wyswietl "jestem mezczyzna"
        //wykonac przy uzyciu if a potem switch

        if (plec==Plec.KOBIETA) {
            System.out.println("Jestem kobieta");
        } else {
            if (plec==Plec.MEZCZYZNA){
                System.out.println("Jestem mezczyzna");
            } else {
                System.out.println("Nie ma takiej plci");
            }
        }

            switch (plec) {
                case KOBIETA:
                    System.out.println("Jestem kobieta");
                    break;
                case MEZCZYZNA:
                    System.out.println("Jestem mezczyzna");
                    break;
                default:
                    System.out.println("Nie ma takiej plci");
            }


    }

 /*   public void jakaPlec2(String plec){
        //Dla KOBIETA wyświetl "jestem kobieta"
        //Dla MEZCZYZNA wyswietl "jestem mezczyzna"
        //wykonac przy uzyciu if a potem switch

        if (plec="KOBIETA") {
            System.out.println("Jestem kobieta");
        } else {
            if (plec==Plec.MEZCZYZNA){
                System.out.println("Jestem mezczyzna");
            } else {
                System.out.println("Nie ma takiej plci");
            }
        }

        switch (plec) {
            case KOBIETA:
                System.out.println("Jestem kobieta");
                break;
            case MEZCZYZNA:
                System.out.println("Jestem mezczyzna");
                break;
            default:
                System.out.println("Nie ma takiej plci");
        }


    }

  */
 private void jakaPlec2(String plec) {

     if(plec.toUpperCase().equals("KOBIETA")) {
         System.out.println("Jestem Kobietą");
     } else if("MEZCZYZNA".equals(plec.toUpperCase())){
         System.out.println("Jestem Mężczyzną");
     } else {
         System.out.println("Nie rozumiem.");
     }

     switch (plec.toUpperCase()) {
         case "KOBIETA":
             System.out.println("Jestem Kobietą");
             break;
         case "MEZCZYZNA":
             System.out.println("Jestem Mężczyzną");
             break;
         default:
             System.out.println("Nie rozumiem.");
     }
 }

}

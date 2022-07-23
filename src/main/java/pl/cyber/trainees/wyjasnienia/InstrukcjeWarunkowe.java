package pl.cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {
    /*instrukcja warunkowa if
    BUDOWA if'a

    CONDITION - warunek sprawdzajacy np. i>0, a+b=2, 2%2 =0
    1. konstrukcja ifa
    if (CONDITION) {

    }

    np.

    if (2+2=4) {
    println("dodawanie rowne 4")
    }

    2. konstrukcja ifa
    else - w przeciwnym wypadku

    if (CONDITION {

    }
    else {
    }

    np.

        if (2+2=4) {
    println("dodawanie rowne 4")
    }
    else {
    println("dodawanie nie rowne 4")
    }

    3. konstrukcja ifa

    if(CONDITION) {
    // KOD JEŚLI WARUNEK JEST SPEŁNIONY (TRUE)
    }
    else if(CONDITION2) {
    // KOD JEŚLI WARUNEK JEST SPEŁNIONY (TRUE)
    }
    else {
    // jeśli warunki są nie spełnione (FALSE)
    }

    np.
    if (2+2=4) {
        println("dodawanie rowne 4")
    }
    else if (2+2=3) {
    println("dodawanie rowne 3")
    }
        else {
    println("dodawanie nie rowne 4 ani 3")
    }

     */

    //Utworzyc metode, ktora zwroci true lub false jesli podana liczba w parametrze nie jest rowna 10

    public boolean Cos(Integer liczba) {
    if (liczba !=10) {
        return true;
    }
    else {
        return false;
        }
    }

    }


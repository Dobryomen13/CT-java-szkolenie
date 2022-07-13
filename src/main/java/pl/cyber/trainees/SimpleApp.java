package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;


public class SimpleApp {
    public static void main(String[] args) {
        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
        "przod",  "Passat",  1000, 2.0, Kolor.GREEN);

        System.out.println(modelPojazdu2.toString());
     //       System.out.println(modelPojazdu1);

    }

}

package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;


public class SimpleApp {
    public static void main(String[] args) {
        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
        "przod",  "Passat",  1000, 2.0, Kolor.GREEN);

        modelPojazdu1.setKolor(Kolor.RED );
        modelPojazdu1.setMarka("Ford");
        modelPojazdu1.setNaped("4x4");
        modelPojazdu1.setRocznik("1967");
        modelPojazdu1.setNazwa("Mustang Shelby");
        modelPojazdu1.setPojemonscSilnika(2.0);
        modelPojazdu1.setPrzebieg(0);



     //   System.out.println(modelPojazdu2.toString());
            System.out.println(modelPojazdu1);

    }

}

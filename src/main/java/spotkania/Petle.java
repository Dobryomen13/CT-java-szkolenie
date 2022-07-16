package spotkania;

public class Petle {

    public static void main(String[] args) {
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
                System.out.println(i+ ".");
            }
        }
    }
}

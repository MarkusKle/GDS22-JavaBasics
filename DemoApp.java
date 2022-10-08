public class DemoApp {
    public static void main(String[] args) {

        boolean shouldRun = true;
        int counter = 0;

        while (shouldRun /* == true */) {

            System.out.println("Die Schleife läuft" + counter);
            counter++;

            if (counter == 10_000 ) {
                //shouldRun = false;
                //break;  // Beendet alle schleifen
                //return; // Beendet die methode
                continue; // führt die Schleife weiter aus

            }
            System.out.println("After break");

        }
        System.out.println("After loop");
    }
}

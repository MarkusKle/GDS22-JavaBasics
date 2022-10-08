public class DemoLoopApp {

    public static void main(String[] args) {

        int vorgaenger = 0;
        int counter = 0;

        for (int i = 1; i < 100_000; i++){

            if ((i + vorgaenger) % 351 == 0) {
                System.out.println("Der Vorgänger von " + i + " lautet " + vorgaenger);
                counter++;

                if (counter == 10){
                    return;
                    //break;
                }
            }
            vorgaenger = i;
        }






        /*
        int zahl = 0;
        int modulo = 0;


        for (zahl = 1; zahl <= 100_000; zahl++) {

            //System.out.println("Zahl = " + zahl);

            if (zahl % 351 == 0) {
                System.out.println("Modulo Zahl: " + zahl);
                zahl++;

                if (zahl % 351 == 0) {
                    System.out.println("Doppel modulo!");
                    modulo++;

                }

                    if (modulo == 10) {
                        System.out.println("Modulo = 10 EXIT");
                        break;
                    }
                }
            }
        */
        }

    }

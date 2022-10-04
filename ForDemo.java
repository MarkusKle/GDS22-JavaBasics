public class ForDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("gerade Zahl: " + i);
            }
        }
        //gleiche ohne if
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("gerade Zahl: " + i);

        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("gerade Zahl: " + i);
        }


    }
}

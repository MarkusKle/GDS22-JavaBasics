public class ArithmetischeOperationen {
    /**
     * Ausführung aller Arithmetischer Operationen und Ausgabe
     *
     */
    public static void main(String[] args) {

        byte a = 3;
        byte b = 2;
        int result;

        result = a + b;
        System.out.println("a + b = " + result);

        result = a - b;
        System.out.println("a - b = " + result);

        result = a * b;
        System.out.println("a * b = " + result);

        // Typumwandlung von int auf double
        // Andere möglichkeit:  double result1 = a / (1.0 * b);
        double result1 = (double) a / (double) b;
        System.out.println("a / b = " + result1);

        result = a % b;
        System.out.println("a % b = " + result);


        // Pre- & Post Inkrement

        // a++ => beduetet a = a + 1
        System.out.println("a++");
        // ich erwarte mir 3
        System.out.println(a++);
        System.out.println("a = " + a); // ich erwarte mir 4

        // ++b
        System.out.println("++b");
        System.out.println(++b); // ich erwarte mir 3
        System.out.println("b = " + b); // ich erwarte mir 3




    }
}

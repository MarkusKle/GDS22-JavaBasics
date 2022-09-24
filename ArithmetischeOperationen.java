public class ArithmetischeOperationen {
    /**
     * Ausführung aller Arithmetischer Operationen und Ausgabe
     * @param args
     */
    public static void main(String[] args) {

        byte a = 9;
        byte b = 7;
        int result;

        result = a + b;
        System.out.println("a + b = " + result);

        result = a - b;
        System.out.println("a - b = " + result);

        result = a * b;
        System.out.println("a * b = " + result);

        // Typumwandlung von int auf double
        // Andere möglichkeit:  double ergebnis4 = a / (1.0 * b);
        double result1 = (double) a / (double) b;
        System.out.println("a / b = " + result1);

        result = a % b;
        System.out.println("a % b = " + result);

    }
}

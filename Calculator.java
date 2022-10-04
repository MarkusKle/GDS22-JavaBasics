public class Calculator {
    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        int numberResult;

        numberResult= addition(9,5);
        System.out.println("Addieren = " + numberResult);

        numberResult = subtrahieren(9,5);
        System.out.println("Subtrahieren = " + numberResult);

        numberResult = multiplizieren(9,5);
        System.out.println("Multiplizieren = " + numberResult);

        double numberResult1 = dividieren(9,5);
        System.out.println("Dividieren = " + numberResult1);

        numberResult = modulo(9,5);
        System.out.println("Modulo = " + numberResult);

    }
    public static int addition(int numberOne, int numberTwo) {
        int numberResult = numberOne + numberTwo;
        return numberResult;
    }
    public static int subtrahieren(int numberOne, int numberTwo) {
        int numberResult = numberOne - numberTwo;
        return numberResult;
    }
    public  static int multiplizieren(int numberOne, int numberTwo) {
        int numberResult = numberOne * numberTwo;
        return numberResult;
    }
    public static double dividieren(int numberOne, double numberTwo) {
        if (numberTwo == 0) {
            return 0;
        }
        else {
            double numberResult = numberOne / numberTwo;
            return numberResult;
        }
    }
    public static int modulo(int numberOne, int numberTwo) {
        int numberResult = numberOne % numberTwo;
        return numberResult;
    }
    public static int power(int a) {
        int result = a * a;
        return result;
    }
}

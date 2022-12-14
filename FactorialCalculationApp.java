import java.util.Scanner;

public class FactorialCalculationApp {

    /*

        5! = 1 * 2 * 3 * 4 * 5

     */

    public static void main(String[] args) {

        System.out.println("Berechnung der Fakultät");
        System.out.println("Bitte Zahl eingeben: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + "! = " + calculateFactorialNumber(number));
        System.out.println(number + "! (for)= " + calculateFactorialNumberForLoop(number));
    }

    public static long calculateFactorialNumber (int value){

/*
        if (value < 2){
            return 1;
        }
*/
        long result = 1;
        int number = 1;

        while (number < value){
            number++;
            result = result * number;
            System.out.println("result = " + result);
        }
        return result;

    }

    public static long calculateFactorialNumberForLoop(int value) {
        long result = 1;

        for (int number =1; number <= value; number++){
            result = result * number;
        }

        return result;
    }
}

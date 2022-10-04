/*

1996 = Schaltjahr (Da durch 4 Teilbar)
1996 / 4 oder 1996 % 4
1900 = Kein Schaltjahr
2000 = Schaltjahr (Da durch 4 und durch 400 teilbar

 */

import java.util.Scanner;

public class LeafYeaCalculationApp {
    public static void main(String[] args) {
        System.out.println("Schaltjahrberechnung: ");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("year = " + year);


        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " ist ein Schaltjahr");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " ist ein Schaltjahr");
        }
        else {
            System.out.println(year + " ist KEIN Schaltjahr");
        }

        System.out.println(year + " is a leaf year: " + isLeafYear(year));

    }

    public static boolean isLeafYear(int year){
        // True, wenn Schaltjahr
        // False, wenn KEIN Schlatjahr

        if (year % 4 == 0 && year % 400 == 0) {
            return true;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

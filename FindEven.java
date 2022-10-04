public class FindEven {

    public static void main(String[] args) {

        int count = 1;
        int input = 10;

        while (count++ <= input) {
            if (count % 2 == 0 ) {
                System.out.println("even Nr: " + count);
            }
            // count++;
            // Alternativen zu count++
            // count = count + 1;
            // count = 1 + count;
            // count += 1;
            // ++count

        }
    }
}

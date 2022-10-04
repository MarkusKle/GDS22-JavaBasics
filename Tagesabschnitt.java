public class Tagesabschnitt {


    /**
     * abhängig von der Uhrzeit
     *
     * 6-9 (exkl.) -> Früh
     * 9-12 (exkl.) -> Vormittag
     * 12-16 (exkl.) -> Nachmittag
     * 16-20 (exkl.) -> Abend
     * 20-6 (exkl.) -> Nacht
     * @param args
     */
    public static void main(String[] args) {

        byte uhrzeit = 11;
        String abschnitt = "";

        //casting with (byte)
        //abschnitt = getDayTimeName((byte)17);
        abschnitt = getDayTimeName(uhrzeit);

        System.out.println("abschnitt = " + abschnitt);

    }
    //public static return_type (void) name (parameter)
    public static String getDayTimeName(byte time) {

        String abschnitt ="";

        if (time < 6 || time >= 20){
            abschnitt = "Nacht";
        } else if (time < 9) {
            abschnitt = "früh";
        } else if (time < 12) {
            abschnitt = "Vormittag";
        } else if (time < 16) {
            abschnitt = "Nachmittag";
        } else {
            abschnitt = "Abend";
        }

        return abschnitt;
    }
}

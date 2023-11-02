import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pasport pasport = new Pasport(1877213,"ISMAILOV","RAIYMBEK",LocalDate.of(1971,03,05),"E/M","KYRGYZ REPUBLIC");
        System.out.println(pasport);



    }
}
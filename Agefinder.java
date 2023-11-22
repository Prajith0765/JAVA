
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Agefinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inDate = in.nextLine();
        LocalDate present = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(inDate,format);
        Period period = Period.between(dob,present);
        System.out.println(period.getYears()+ " years "+ period.getMonths()+ " months");
    }
}
package JavaDateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate: ");
        String birthdate = sc.nextLine();
        LocalDate bd = LocalDate.parse(birthdate,dtf);
        LocalDate today = LocalDate.now();
        int age = today.getYear() - bd.getYear();
        if (today.getMonthValue() < bd.getMonthValue()) {
            age--;
        }
        else if (today.getMonthValue() == bd.getMonthValue() && today.getDayOfMonth() < bd.getDayOfMonth()) {
            age--;
        }
        System.out.println("Your age is: " + age);
        Period pd = Period.between(bd,today);
        System.out.println("Your age in years, months and days is: " + pd.getYears() + " years, " + pd.getMonths() + " months and " + pd.getDays() + " days");
    }
}

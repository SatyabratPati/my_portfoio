package myCaptain;
import java.util.Scanner;
public class YearConverter {
    static void yearsDays(int m){
        int totalDays = m/(24*60);
        int minutesLeft = m%(24*60);
        int years = totalDays/365;
        int days = totalDays%365;
        if(minutesLeft == 0) {
            System.out.println(m + " is approximately equal to " + years + " years and " + days + " days");
        }
        else
        {
            System.out.println(m + " is approximately equal to " + years + " years, " + days + " days and "+minutesLeft+" minutes");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number of minutes:");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        yearsDays(minutes);
    }
}

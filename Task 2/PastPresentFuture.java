import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy"); // Not sure if i should make a month day and year instance of this
        Date date = new Date();
        System.out.println("Enter Month: ");
        int month = input.nextInt();
        System.out.println("Enter Day: ");
        int day = input.nextInt();
        System.out.println("Enter Year: ");
        int year = input.nextInt();
        if (year != 2017){ //fug with this?
            System.out.println("Not this year :( ");
        }
       // else if (month < )
    }
}

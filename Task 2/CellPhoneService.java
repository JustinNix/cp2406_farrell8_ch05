import java.util.Scanner;
public class CellPhoneService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Max talk minutes needed: ");
        int talkMinutes = input.nextInt();
        System.out.println("Max txt messages needed: ");
        int txtMessages = input.nextInt();
        System.out.println("Max data needed (Gb): ");
        int dataUsage = input.nextInt();

        if(talkMinutes < 500 && (txtMessages + dataUsage) == 0){
            System.out.println("You should accept plan A at $49.00 per month");
        }
        else if(talkMinutes < 500 && txtMessages > 0){
            System.out.println("You should accept plan B at $55 per month");
        }
        else if(talkMinutes >= 500 && dataUsage == 0){
            System.out.println("You should accept Plan C - 100 texts at $61 per month or plan D - 100+ texts at $70 per month");
        }
        else if(dataUsage > 0 ){
            System.out.println("You should accept plan E for up to 2Gb of data at $79 per month or plan F for up to 2Gb+ at $87 per month");
        }
    }
}

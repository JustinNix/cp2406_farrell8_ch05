import java.util.Scanner;
public class CondoSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What view would you like: \n" + "(1)Park , (2)Golf or (3)Lake");
        int selection = input.nextInt();
        if(selection == 1) {
            System.out.println("You chose to have a park view which will cost $150,000.00");
        }
        else if(selection == 2){
                System.out.println("You chose to have a golf view which will cost $170,000.00" );
        }
        else if (selection == 3){
            System.out.println("You chose to have a lake view which will cost $210,000.00");
        }
        else System.out.println("Invalid Selection $0.00");
    }
}

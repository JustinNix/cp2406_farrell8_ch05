import java.util.Arrays;
import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0 ; i < numbers.length; i++){
            System.out.print("Please enter number " + i + " " );
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}

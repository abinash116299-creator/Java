import java.util.Scanner;

public class GymHealthProfile {
    public static void main(String[] args) {
        // This tool lets us listen to what the user types
        Scanner secretListener = new Scanner(System.in);

        System.out.print("Enter your body fat number: ");
        int bodyFat = secretListener.nextInt();

        // The Game of "Choose Only One Path"
        if (bodyFat < 14) {
            System.out.println("Athletic");
        }
        else if (bodyFat <= 24) {
            System.out.println("Fit");
        }
        else {
            System.out.println("Regular");
        }

        // Turn off the listener to save power
        secretListener.close();
    }
}
package ExerciciosCap3.HeartBeats_Project;
import java.util.Scanner;

//Main class that runs the program and take answers from the user
public class MainHeartBeats {
    static void main() {
        //Constructor for a generic object (Probably not a good practice), still learning.
        HeartsRates user = new HeartsRates("Generic",
                "Generic",
                1,
                11,
                1111);

        //Scanner object that reads user input.
        Scanner input = new Scanner(System.in);

        //Menu
        System.out.println("----Welcome to the heart beat frequency calculator!----");
        System.out.println("We use your age to calculate the max heart beat frequency");
        System.out.println("for your heart. And the the safe frequency while doing");
        System.out.println("some activity!");
        System.out.println("---------------------------------------------------------");

        //User inputs
        System.out.print("What is your name?: ");
        String name = input.nextLine();
        user.setName(name);
        System.out.println(" ");

        System.out.print("What is your surname?: ");
        String surname = input.nextLine();
        user.setSurname(surname);
        System.out.println(" ");

        System.out.print("What year were you born?: ");
        int year = input.nextInt();
        user.setYear(year);
        System.out.println(" ");

        System.out.print("From what month?: ");
        int month = input.nextInt();
        user.setDay(month);
        System.out.println(" ");

        System.out.print("And the day?: ");
        int day = input.nextInt();
        user.setDay(day);
        System.out.println(" ");

        //Heart rates methods
        user.targetHearteRate(user);
        

    }
}

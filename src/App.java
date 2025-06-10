import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Print welcome message
        System.out.println("Welcome to the English school");

        //The user who enters the student's age
        System.out.println("Enter the student's age:");

         // Create Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);

        // Read the age input from user
        int age = keyboard.nextInt();

        // Check age range and determine school level/schedule
        if(age >= 4 && age <= 6) {
            System.out.println("The student is in kindergarten");
            System.out.println("The student has classes on Mondays and Wednesdays from 4:00 pm to 5:00 pm");
        }
        else {
            if(age >= 7 && age <= 8) {
                System.out.println("The student is in the first year");
                System.out.println("The student has classes on Tuesday and Thursday from 4:30 pm to 5:30 pm");
            }
            else {
                if(age >= 9 && age <= 10) {
                    System.out.println("The student is in the second year");
                    System.out.println("The student has classes on Tuesday and Thurday from 5:30 pm to 7:00 pm");
                }
                else {
                    if(age >= 11 && age <= 13) {
                        System.out.println("The student is in his third year");
                        System.out.println("The student has classes on Monday and Wednesdays from 5:00 pm to 6:30 pm");
                    }
                    else  {
                        System.out.println("The age does not correspond to the students at the school");
                    }
                }
            }
        }

    }
}

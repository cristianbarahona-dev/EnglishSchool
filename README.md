
# Project Title

A brief description of what this project does and who it's for

Here's your professional `README.md` for the English School Enrollment System, following the style you provided but adapted for your specific program:

```markdown
# English School Enrollment System

[Java 17+]

This program determines a student's grade level and class schedule based on their age, demonstrating conditional logic in Java.

## Description

The application takes a student's age as input and uses nested if-else statements to determine their appropriate grade level and corresponding class schedule in an English language school.

## Features

- Age-based grade level determination:
  - Kindergarten (ages 4-6)
  - First Year (ages 7-8)
  - Second Year (ages 9-10)
  - Third Year (ages 11-13)
- Displays appropriate class schedule for each level
- Input validation for age ranges
- Clear console interface

## Code Explanation

```java
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the English school");
        System.out.println("Enter the student's age:");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();

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
```

## How to Run

1. Ensure you have Java JDK installed
2. Compile the program:
   ```
   javac App.java
   ```
3. Run the compiled program:
   ```
   java App
   ```
4. Enter the student's age when prompted

## Expected Output Examples

**Valid age input (7):**
```
Welcome to the English school
Enter the student's age:
7
The student is in the first year
The student has classes on Tuesday and Thursday from 4:30 pm to 5:30 pm
```

**Invalid age input (3):**
```
Welcome to the English school
Enter the student's age:
3
The age does not correspond to the students at the school
```

## Grade Level Information

| Age Range | Grade Level   | Class Days          | Time Slot        |
|-----------|---------------|---------------------|------------------|
| 4-6       | Kindergarten  | Monday & Wednesday  | 4:00 pm - 5:00 pm |
| 7-8       | First Year    | Tuesday & Thursday  | 4:30 pm - 5:30 pm |
| 9-10      | Second Year   | Tuesday & Thursday  | 5:30 pm - 7:00 pm |
| 11-13     | Third Year    | Monday & Wednesday  | 5:00 pm - 6:30 pm |

## License

This project is open source and available under the [MIT License](LICENSE).

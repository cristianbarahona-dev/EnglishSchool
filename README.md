Here's a professional yet easy-to-understand `README.md` for your English school program:

```markdown
# English School Enrollment System

![Java](https://img.shields.io/badge/Java-17+-blue?logo=java)
![License](https://img.shields.io/badge/License-MIT-green)

A simple Java console application that determines a student's grade level and class schedule based on their age.

## Features

- Takes student age as input
- Determines appropriate grade level (Kindergarten through 3rd year)
- Displays corresponding class schedule
- Validates age range (4-13 years)
- Clear output formatting

## Age Groups and Schedules

| Age Range  | Grade Level      | Schedule                                   |
|------------|------------------|--------------------------------------------|
| 4-6        | Kindergarten     | Mon & Wed, 4:00 pm - 5:00 pm              |
| 7-8        | First Year       | Tue & Thu, 4:30 pm - 5:30 pm              |
| 9-10       | Second Year      | Tue & Thu, 5:30 pm - 7:00 pm              |
| 11-13      | Third Year       | Mon & Wed, 5:00 pm - 6:30 pm              |

## Requirements

- Java JDK 17 or later
- Basic terminal/command line knowledge

## How to Run

1. Compile the program:
   ```bash
   javac App.java
   ```

2. Run the compiled program:
   ```bash
   java App
   ```

3. Follow the on-screen instructions to enter the student's age

## Example Usage

```plaintext
Welcome to the English school
Enter the student's age:
9
The student is in the second year
The student has classes on Tuesday and Thursday from 5:30 pm to 7:00 pm
```

## Error Handling

- If age is below 4 or above 13, the program will display:
  ```plaintext
  The age does not correspond to the students at the school
  ```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

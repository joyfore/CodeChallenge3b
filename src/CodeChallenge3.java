
import java.util.Scanner;

class CodeChallenge3 {

    public static void main(String[] args) {

        /*********************************************************************
         Notes: Write a while loop for that asks the question from CodeChallenge2
         if a specific condition is not met. Use the same code else if code from
         Code Challenge 2 but put it inside a while loop. Try this challenge
         again.
         *********************************************************************/

        // HINT: initialize score before asking input from the user.

        // Get their answer by using input scanner.
        Scanner scanner = new Scanner(System.in);

    /*
    Grade  Test Score
    -----  ----------
    A      90 to 100
    B      80 to 89
    C      70 to 79
    D      60 to 69
    F      0  to 59

    Print the grade based on the score entered by user. Use
    ELSE IF STATEMENT for multiple conditions with LOGICAL OPERATORS.
    */
        System.out.println("Your score must be between 0 to 100.");

        // Ask user question.
        System.out.println("what is your score " +  "?");

        int score = scanner.nextInt(); // Get their answer by using input scanner.
        while (score >= 0 && score <= 100){

            if (score >= 0 && score <= 59) {
                System.out.println("you got an F, try harder next time");
                break;
            }
            else if (score >= 60 && score <= 69) {
                System.out.println("you got an D, Not bad but not good");
                break;
            }
            else if (score >= 70 && score <= 79) {
                System.out.println("you got an C, good job");
                break;
            }
            else if (score >= 80 && score <= 89) {
                System.out.println("you got an B, Great job, keep on working hard");
                break;
            }
            else {
                System.out.println("you got an A! That's what I like ");
                break;
            }
        }
        scanner.close();
    }
}




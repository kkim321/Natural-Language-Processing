import java.util.Scanner;

/**
 * NLPRunner class to handle user input and display translation dynamically.
 */
public class NLPRunner {
    public static void main(String[] args) {
        Translation translator = new Translation();
        translator.prompt(); // Start user interaction
        translator.printSummary(); // Display summary
    }
}

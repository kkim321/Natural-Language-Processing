import java.util.ArrayList;
import java.util.Scanner;

/**
 * MyNLP class to process text and perform translations.
 */
  public class Translation {
    private ArrayList<String> englishWords;
    private ArrayList<String> koreanWords;
    
    /**
     * Constructor loads data from text files into ArrayLists.
     */
    public Translation() {
        englishWords = new ArrayList<String>();
        koreanWords = new ArrayList<String>();
        loadDictionary("dictionary.txt");
    }
    
    /**
     * Reads dictionary data from a text file.
     * @param filename The file containing word translations.
     */
    private void loadDictionary(String filename) {
    TextProcessor tp = new TextProcessor(filename);
    ArrayList<String> words = tp.getTextList();
    
    for (int i = 0; i < words.size(); i++) {
        String word = words.get(i);
        int comma = word.indexOf(",");
        if (comma != -1) {
            englishWords.add(word.substring(0, comma));
            koreanWords.add(word.substring(comma + 1));
        }
    }
}


    
/**
 * Starts the translation prompt for user input.
 */
    public void prompt() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an English sentence to translate (or 'exit' to quit):");

    String userInput = ""; // Initialize input variable
    while (!userInput.equals("exit")) { // Loop until "exit" is entered
        System.out.print("Input: ");
        userInput = input.nextLine();

        if (!userInput.equals("exit")) { // Only translate if input is not "exit"
            String translatedSentence = translateSentence(userInput);
            System.out.println("Korean Translation: " + translatedSentence);
        }
    }

      System.out.println("Goodbye!");
      input.close();
}

    /**
     * Translates an English sentence into Korean.
     * @param sentence The input English sentence.
     * @return The translated Korean sentence.
     */
    public String translateSentence(String sentence) {
        String[] words = sentence.split(" ");
        String translation = "";
        
        for (int i = 0; i < words.length; i++) {
            int index = englishWords.indexOf(words[i]);
            if (index != -1) {
                translation += koreanWords.get(index) + " ";
            } else {
                translation += "[unknown] ";
            }
        }
        return translation;
    }
    
    /**
     * Prints the summary of the translation process.
     */
    public void printSummary() {
        System.out.println("Translation session ended. Processed translations successfully.");
    }
}

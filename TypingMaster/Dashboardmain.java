import java.util.Scanner;

public class Dashboardmain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String textToType = "The quick brown fox jumps over the lazy dog.";
        int numberOfWords = 9;
        int numberOfMistakes = 0;
        
        System.out.println("Type the following text:");
        System.out.println(textToType);
        
        String typedText = sc.nextLine();
        String[] typedWords = typedText.split(" ");
        
        if (typedWords.length != numberOfWords) {
            System.out.println("You typed " + typedWords.length + " words, but there were " + numberOfWords + " words to type.");
        } else {
            for (int i = 0; i < numberOfWords; i++) {
                if (!typedWords[i].equals(textToType.split(" ")[i])) {
                    numberOfMistakes++;
                }
            }
            System.out.println("You made " + numberOfMistakes + " mistake(s).");
        }
        
    }
    
}

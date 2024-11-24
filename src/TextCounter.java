//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

// Klass som räknar rader och tecken
public class TextCounter {
    private int totalCharacters = 0;
    private int totalLines = 0;

    // Lägger till en rad och räknar tecken
    public void addLine(String line) {
        totalCharacters += line.length();  // Lägg till tecken från raden
        totalLines++;  // Öka antalet rader
    }

    // Hämtar det totala antalet tecken
    public int getTotalCharacters() {
        return totalCharacters;
    }

    // Hämtar det totala antalet rader
    public int getTotalLines() {
        return totalLines;
    }

    // Klass som ansvarar för inläsning och utskrift
    public static class TextAnalys {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            TextCounter counter = new TextCounter();

            System.out.println("Skriv in text rad för rad. Skriv 'Stop' för att avsluta.");

            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Stop")) {
                    break;  // Avsluta om användaren skriver 'Stop'
                }
                counter.addLine(input); // Lägg till raden till räknaren
            }

            // Skriver ut resultatet
            System.out.println("Antal tecken (exklusive 'stop'-raden): " + counter.getTotalCharacters());
            System.out.println("Antal rader (exklusive 'stop'-raden): " + counter.getTotalLines());
        }
    } }
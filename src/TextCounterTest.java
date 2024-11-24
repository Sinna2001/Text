import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTest {

    private TextCounter counter;

    // Sätt upp en ny TextCounter före varje test
    @BeforeEach
    public void setUp() {
        counter = new TextCounter();
    }

    // Testfall för att kontrollera om tecken räknas korrekt
    @Test
    public void testTotalCharacters() {
        counter.addLine("Hej");
        counter.addLine("Världen");
        assertEquals(10, counter.getTotalCharacters(), "Antalet tecken ska vara 10.");
    }

    // Testfall för att kontrollera om antal rader räknas korrekt
    @Test
    public void testTotalLines() {
        counter.addLine("Hej");
        counter.addLine("Världen");
        counter.addLine("Java");
        assertEquals(3, counter.getTotalLines(), "Antalet rader ska vara 3.");
    }

    // Testfall för att kontrollera när inget input ges
    @Test
    public void testNoInput() {
        assertEquals(0, counter.getTotalCharacters(), "Antalet tecken ska vara 0.");
        assertEquals(0, counter.getTotalLines(), "Antalet rader ska vara 0.");
    }
}
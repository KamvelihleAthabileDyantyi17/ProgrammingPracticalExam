import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionOneTest {

    @Test
    void calculateTotalSales_ReturnsExpectedTotalSales() {
        QuestionOne questionOne = new QuestionOne();
        double[] expectedSales = {6200.0, 6300.0};  // Replace with the actual expected totals
        assertArrayEquals(expectedSales, questionOne.calculateTotalSales(), "Total sales should match the expected values");
    }

    @Test
    void getTopPerformingMovie_ReturnsTopMovie() {
        QuestionOne questionOne = new QuestionOne();
        String expectedTopMovie = "Oppenheimer";  // Replace with the actual expected top movie
        assertEquals(expectedTopMovie, questionOne.getTopPerformingMovie(), "The top-performing movie should be Oppenheimer");
    }
}

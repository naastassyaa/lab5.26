import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseNegativeNumberTest {
    @Test
    public void firstTest() {
        Text text = new Text("Negative numbers can also be used in mathematical operations, " +
                "such as subtraction. For instance, if you subtract 5 from -13, the result will be -18.");
        Assertions.assertEquals("Negative numbers can also be used in mathematical operations, " +
                        "such as subtraction. For instance, if you subtract 5 from 31, the result will be 81.",
                text.reverseNumber());
    }

    @Test
    public void secondTest() {
        Text text = new Text("-157");
        Assertions.assertEquals(" 751", text.reverseNumber());
    }

    @Test
    public void thirdTest() {
        Text text = new Text("");
        Assertions.assertEquals("", text.reverseNumber());
    }

    @Test
    public void fourthTest() {
        Text text = new Text("-154BMW and Mercedes-123");
        Assertions.assertEquals("-154BMW and Mercedes-123", text.reverseNumber());
    }

    @Test
    public void fifthTest() {
        Text text = new Text("568");
        Assertions.assertEquals("568", text.reverseNumber());
    }

    @Test
    public void sixthTest() {
        Text text = new Text("I love Dima");
        Assertions.assertEquals("I love Dima", text.reverseNumber());
    }
}

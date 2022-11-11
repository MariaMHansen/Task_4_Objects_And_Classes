import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ObjectsPracticeTest {
    ObjectsPracticeTest() {
    }

    @DisplayName("checks if sayHello method returns String hello world")
    @Test
    void Should_ReturnHelloWorld() {
        Assertions.assertEquals("hello world!", ObjectsPractice.sayHello());
    }

    @DisplayName("countDogs no dogs in string")
    @Test
    void Should_ReturnZero_When_NoDogInString() {
        int count = ObjectsPractice.countDogs("cat cat catcat");
        Assertions.assertEquals(0, count);
    }
}
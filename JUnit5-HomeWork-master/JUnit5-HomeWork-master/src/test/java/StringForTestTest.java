import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringForTestTest {

    @Test
    void main() {
        String one = "Это работает";
        String two = "Нет, не работает";
        String result = "Это работает";
        Assertions.assertNotEquals(two,one);
        Assertions.assertEquals(result,one);
    }
}
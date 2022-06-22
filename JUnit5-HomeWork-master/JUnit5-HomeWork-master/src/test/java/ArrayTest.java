import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTest {

    @Test
    void sortNumberArrayTest() {
        int[] testNumberArray = {0, -5, 10, 3, -2, 1};
        Array.sortNumberArray(testNumberArray);
        int[] goodResultTestNum = {-5, -2, 0, 1, 3, 10};
        Assertions.assertArrayEquals(goodResultTestNum, testNumberArray);
    }

    @Test
    void sortStringArrayTest() {
        String[] testStringArray = {"е", "д", "ж", "г"};
        Array.sortStringArray(testStringArray);
        String[] goodResultTestString = {"г", "д", "е", "ж"};
        Assertions.assertArrayEquals(goodResultTestString, testStringArray);
    }
}
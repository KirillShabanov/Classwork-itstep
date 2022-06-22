import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {

    @Test
    void main() {
        LinkedList<String> test_list = new LinkedList<>();
        Collection.addCollection(test_list);
        String testResult = "Yellow";
        String test = test_list.getLast();
        Assertions.assertEquals(testResult, test);
    }
}
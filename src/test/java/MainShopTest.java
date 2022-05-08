import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainShopTest {

    @Test
    void calculateTotalCost() {
        double actual = new MainShop().calculateTotalCost("ABDC");
        double expected = 7.25;
        Assertions.assertEquals(actual,expected);
        // one test should contain one test case. Create a separate method for this one
        double actual2 = new MainShop().calculateTotalCost("ABCDABCDABCDABCDABCDABCD");
        double expected2 = 41;
        Assertions.assertEquals(actual2,expected2);

        //also we have to test some invalid scenario

    }
}
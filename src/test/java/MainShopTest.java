import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainShopTest {

    @Test()
    void calculateTotalCost() throws WrongInputException {
        double actual = new MainShop().calculateTotalCost("ABDC");
        double expected = 7.25;
        Assertions.assertEquals(actual, expected);
        //also we have to test some invalid scenario

    }
    @Test
    void test_exception() {

        WrongInputException exception = assertThrows(
                WrongInputException.class,
                () -> new MainShop().calculateTotalCost("I"));


        assertTrue(exception.getMessage().contains("input"));

    }
}
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {

    @Test
    @DisplayName("Add method test")
    void add() {
        MyMathCalc myMathCalc = new MyMathCalc();
        int expected = 10;
        int actual1 = myMathCalc.add(5, 5);
        int actual2 = myMathCalc.add(2, 5);

        assertEquals(expected, actual1);
        assertNotEquals(expected, actual2);
    }

    @Test
    @DisplayName("Multiply method test")
    void multiply() {
        MyMathCalc myMathCalc = new MyMathCalc();
        int expected = 25;
        int actual1 = myMathCalc.multiply(5, 5);
        int actual2 = myMathCalc.multiply(2, 5);

        assertEquals(expected, actual1);
        assertNotEquals(expected, actual2);
    }

    @Test
    @DisplayName("Divide method test")
    void divide() {
        MyMathCalc myMathCalc = new MyMathCalc();
        int expected1 = 2;
        double actual1 = myMathCalc.divide(20, 10);
        double actual2 = myMathCalc.divide(2, 5);

        assertEquals(expected1, actual1);
        assertNotEquals(expected1, actual2);
        assertThrows(Exception.class, () -> myMathCalc.divide(2, 0));
    }
}
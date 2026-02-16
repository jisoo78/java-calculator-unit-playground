import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("사칙연산 중 덧셈의 기능을 구현할 수 있다")
    public void test_add() {
        // given
        int a = 5;
        int b = 10;

        Calculator calculator = new Calculator();
        // when
        int expected = calculator.add(a, b);

        // then
        int actual = 15;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("사칙연산 중 뺄셈의 기능을 구현할 수 있다")
    public void test_subtraction() {

        // given
        int a = 10;
        int b = 5;

        Calculator calculator = new Calculator();
        // when
        int expected = calculator.subtraction(a, b);

        // then
        int actual = 5;
        assertEquals(actual, expected);

    }

    @Test
    @DisplayName("사칙연산 중 곱셈의 기능을 구현할 수 있다")
    public void test_multiplication() {
        // given
        int a = 3;
        int b = 4;

        Calculator calculator = new Calculator();
        // when
        int expected = calculator.multiplication(a, b);
        // then
        int actual = 12;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("사칙연산 중 나눗셈의 기능을 구현할 수 있다")
    public void  test_division() {
        // given
        int a = 10;
        int b = 2;

        Calculator calculator = new Calculator();
        // when
        int expected = calculator.division(a, b);
        // then
        int actual = 5;
        assertEquals(actual, expected);
    }
}

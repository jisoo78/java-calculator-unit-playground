import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calc = new StringCalculator();



    @Test
    @DisplayName("빈 문자열이나 null 이라면 404를 반환한다")
    void StringCalculatorTest1() {
        assertEquals(404, calc.sum(""));
        assertEquals(404, calc.sum(null));
    }

    @Test
    @DisplayName("기본 구분자 테스트")
    void StringCalculatorTest2() {
        assertEquals(6, calc.sum("1,2:3"));
        assertEquals(10, calc.sum("2,3:5"));
    }

    @Test
    @DisplayName("커스텀 구분자 확인")
    void StringCalculatorTest3() {
        assertEquals(6, calc.sum("//;\n1;2;3"));
        assertEquals(15, calc.sum("//|\n4|5|6"));
    }

    @Test
    @DisplayName("음수 입력시 예외처리")
    void StringCalculatorTest4() {
        assertThrows(RuntimeException.class, () -> calc.sum("1,-2,3"));
        assertThrows(RuntimeException.class, () -> calc.sum("//;\n1;-2;3"));
    }

    @Test
    @DisplayName("숫자 외 다른 문자 입력시 예외처리")
    void StringCalculatorTest5() {
        assertThrows(RuntimeException.class, () -> calc.sum("1,a,3"));
        assertThrows(RuntimeException.class, () -> calc.sum("2,#,3"));
        assertThrows(RuntimeException.class, () -> calc.sum("//;\n1;하이;3"));
    }

    @Test
    @DisplayName("잘못된 커스텀 구분자 작성시 예외처리")
    void StringCalculatorTest6() {
        assertThrows(RuntimeException.class, () -> calc.sum("//;\n"));
        assertThrows(RuntimeException.class, () -> calc.sum("//;\n;"));
        assertThrows(RuntimeException.class, () -> calc.sum("//"));
    }

    @Test
    @DisplayName("구분자가 연속으로 들어와도 처리")
    void StringCalculatorTest7() {
        assertEquals(10, calc.sum("1,,2::3,4"));
    }
}

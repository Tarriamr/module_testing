package kukulam.module.testing.level.E;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyNumberCalculatorTest {

    private MyNumberCalculator myNumberCalculator;


    @BeforeEach
    void beforeEach() {
        myNumberCalculator = new MyNumberCalculator();
    }


    @AfterEach
    void afterEach() {
        myNumberCalculator = null;
    }


    @Test
    void shouldSumAllNumbers() {
        // given
        int[] numbers = new int[]{1, 2, 3};
        int expectedResult = 6;

        // when
        int result = myNumberCalculator.sum(numbers);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }


    @Test
    void testAveragesSprawdzaWyliczanieSredniej() {
        // given
        int[] numbers = new int[]{1, 2, 3};
        double expectationResult = 2;

        // when
        double result = myNumberCalculator.average(numbers);

        // then
        assertThat(result).isEqualTo(expectationResult);
    }
}

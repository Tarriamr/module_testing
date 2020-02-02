package kukulam.module.testing.level.E;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MyNumberCalculatorTest {

    private MyNumberCalculator myNumberCalculator;

    static Stream<Arguments> addArgs() {
        return Stream.of(
                //        a,   b,   expectedResult
                arguments(5, 0, 10, 5),
                arguments(1, 2, 3, 2),
                arguments(2, 2, 5, 3)
        );
    }

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


    @ParameterizedTest
    @MethodSource("addArgs")
    void testAveragesSprawdzaWyliczanieSredniej_TestParametryzowany(int a, int b, int c, double expectedResult) {
        // given
        int[] numbers = {a,b,c};

        // when
        double result = myNumberCalculator.average(numbers);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }
}

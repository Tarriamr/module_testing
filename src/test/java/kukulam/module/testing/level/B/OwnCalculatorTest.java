package kukulam.module.testing.level.B;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
    simple test (self implementation)
 */

import org.junit.jupiter.api.Test;

/**
 * TODO: write own implementation of {@link kukulam.module.testing.level.B.OwnCalculator}
 * Create class OwnCalculatorTest
 * Hint: all necessary examples are in {@link kukulam.module.testing.level.A.IntegerCalculatorTest}
 */

public class OwnCalculatorTest {

    @Test
    void shouldAddThreeIntegersCorrectly(){
        // given
        int a=10;
        int b=5;
        int c=2;
        int expectedResult = 17;

        MyOwnCalculator calculator = new MyOwnCalculator();

        // when
        int resoul = calculator.add(a, b, c);

        // then
        assertThat(resoul).isEqualTo(expectedResult);
    }
}
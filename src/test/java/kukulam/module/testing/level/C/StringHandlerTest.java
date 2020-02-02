package kukulam.module.testing.level.C;

import org.assertj.core.api.AbstractCharSequenceAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.IterableAssert;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

/*
    arrays, assertions, BeforeEach, BeforeAll, AfterEach, AfterAll
 */
class StringHandlerTest {

    private StringHandler stringHandler;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Start running tests from class " + StringHandlerTest.class.getName());
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Stop running tests from class " + StringHandlerTest.class.getName());
    }

    @BeforeEach
    void beforeEach() {
        stringHandler = new StringHandler();
    }

    @AfterEach
    void afterEach() {
        stringHandler = null;
    }

    /**
     * Example of assertions. Usage of:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNull()}
     * {@link IterableAssert#containsExactly(Object[])}
     */
    @Test
    void shouldMergeTwoArraysWithCorrectOrder() {
        // given
        String[] women = new String[]{"Betty", "Caroline"};
        String[] men = new String[]{"James", "Henry"};
        String[] expectedResult = new String[]{"Betty", "Caroline", "James", "Henry"};

        // when
        String[] result = stringHandler.add(women, men);

        // then
        assertThat(result).isNotNull();
        assertThat(result.length).isEqualTo(4);
        assertThat(result).containsExactly(expectedResult);
    }

    /**
     * TODO: write test for method {@link StringHandler#create(String...)} when parameters are not provided
     * 1. Rename test1 to be more descriptive.
     * 2. Test method {@link StringHandler#create(String...)} without parameters.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(String)}
     * {@link AbstractCharSequenceAssert#isNull()}
     * Hint: look at {@link #shouldMergeTwoArraysWithCorrectOrder}
     */
    @Test
    void testDlaPustegoParametru() {
        // given
        String[] params = new String[]{};                     // Tworzymy pusty parametr.

        // when
        String resoult = stringHandler.create(params);        // Został utworzony wcześniej stringHandler w metodzie
        // @BeforeEach. zamiast zmiennej parametr, można zostawić to pole puste.

        // then
        assertThat(resoult).isNull();
    }

    /**
     * TODO: write test for method {@link StringHandler#create(String...)} when parameters are provided
     * 1. Rename test2 to be more descriptive.
     * 2. Test method {@link StringHandler#create(String...)} with at least 3 parameters.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(String)}
     * {@link AbstractCharSequenceAssert#isNotNull()}
     * {@link AbstractCharSequenceAssert#isEqualTo(Object)}
     * Hint: look at {@link #shouldMergeTwoArraysWithCorrectOrder}
     */
    @Test
    void testMetodyCreateDlaPodanychParametrow() {
        // given
        String[] params = new String[]{"Betty", "Caroline", "James"};
        String expectedResult = "BettyCarolineJames";

        // when
        String resoult = stringHandler.create(params);

        // then
        assertThat(resoult).isEqualTo(expectedResult);
        assertThat(resoult).isNotNull();
    }

    /**
     * TODO: write test for method {@link StringHandler#add(String[], String[])}
     * 1. Rename test3 to be more descriptive.
     * 2. Test method {@link StringHandler#add(String[], String[])} with two arrays containing strings.
     * 3. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link IterableAssert#isNotNull()}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link #shouldMergeTwoArraysWithCorrectOrder}
     */
    @Test
    void testMetodyAddCzyDodajeDoSiebieDwaStringi() {
        // given
        String[] women = new String[]{"Betty", "Caroline"};
        String[] men = new String[]{"James"};
        String[] expectedResult = new String[]{"Betty", "Caroline", "James"};

        // when
        String[] result = stringHandler.add(women, men);

        // then
        assertThat(result.length).isEqualTo(expectedResult.length);
        assertThat(result).isNotNull();
        assertThat(result).containsExactly(expectedResult);
    }

    /**
     * TODO EXTRA: write all possible tests for {@link StringHandler#convert(String, boolean)}}
     */
    @Test
    void testMetodyConvertNaDuzeLubMaleLitery() {
        // given


        // when
        stringHandler.convert("",true);

        //then
    }
}
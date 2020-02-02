package kukulam.module.testing.level.D.car;

import kukulam.module.testing.level.D.person.PeopleAgeAssert;
import kukulam.module.testing.level.D.person.PersonRepositoryTest;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.IterableAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
    advanced tests
 */
class CarRepositoryTest {

    private CarRepository carRepository;

    @BeforeEach
    void beforeEach() {
        carRepository = new CarRepository();
    }

    @AfterEach
    void afterEach() {
        carRepository = null;
    }

    /**
     * TODO: write test for methods {@link CarRepository#findAll()}, {@link CarRepository#add(Car)}
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section when
     * 3. Find cars with method {@link CarRepository#findAll()}
     * 4. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link PersonRepositoryTest#shouldFindAllAddedPeople()}
     * Remember about annotation {@link Test} before test method
     */
    @Test
    void shouldFindAllAddedCars() {
        // given
        Car givCar1 = new Car("Peugeut", 7);
        Car givCar2 = new Car("Toyota", 6);
        Car[] expectedCars = new Car[]{givCar1, givCar2};

        // when
        carRepository.add(givCar1);
        carRepository.add(givCar2);

        Car[] result = carRepository.findAll();

        // then
        assertThat(result.length).isEqualTo(2);
        assertThat(result).containsExactly(expectedCars);

    }

    /**
     * TODO: write test for methods {@link CarRepository#findByAge(int)} ()}
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section given
     * 3. Find cars with method {@link CarRepository#findByAge(int)}
     * 4. In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * {@link IterableAssert#containsExactly(Object[])}
     * Hint: look at {@link PersonRepositoryTest#shouldFindPeopleByAge()}
     * Remember about annotation {@link Test} before test method
     */
    @Test
    void shouldFindCarsByAge() {
        // given
        Car givCar1 = new Car("Peugeut", 7);
        Car givCar2 = new Car("Toyota", 6);
        Car givCar3 = new Car("BMW", 6);
        Car[] expectedCars = new Car[]{givCar2, givCar3};

        // when
        carRepository.add(givCar1);
        carRepository.add(givCar2);
        carRepository.add(givCar3);

        Car[] result = carRepository.findByAge(6);

        // then
        assertThat(result).isNotEmpty();
        assertThat(result.length).isEqualTo(expectedCars.length);
        assertThat(result).containsExactly(expectedCars);

    }

    /**
     * TODO: write the same test for methods {@link CarRepository#findByAge(int)} ()} but use your own assertion
     * 1. Initialize/clean {@link CarRepository} with annotations: {@link BeforeEach}, {@link AfterEach}.
     * 2. Add couple cars with method {@link CarRepository#add(Car)} in section given
     * 3. Find cars with method {@link CarRepository#findByAge(int)}
     * 4. In section 'then', please use your assertion
     * Hint: look at
     * {@link PersonRepositoryTest#shouldFindPeopleByAgeWithOwnAssertion()}
     * {@link PeopleAgeAssert#hasAge(int)}
     * Remember about annotation {@link Test} before test method
     */
    @Test
    void shouldFindCarsByAgeWithOwnAssertion() {
        // given
        Car givCar1 = new Car("Peugeut", 7);
        Car givCar2 = new Car("Toyota", 6);
        Car givCar3 = new Car("BMW", 6);

        // when
        carRepository.add(givCar1);
        carRepository.add(givCar2);
        carRepository.add(givCar3);

        Car[] result = carRepository.findByAge(7);

        //then
        CarAgeAssert.assertThat(result).hasAge(7);      // Własna assercja stworzona w osobnej klasie.
    }

    /**
     * TODO EXTRA: write test for method {@link CarRepository#findByName(String)}
     */


}
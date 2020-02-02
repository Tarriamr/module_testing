package kukulam.module.testing.level.D.car;

import org.assertj.core.api.AbstractAssert;

public class CarAgeAssert extends AbstractAssert<CarAgeAssert, Car[]> {
    public CarAgeAssert(Car[] cars) {
        super(cars, CarAgeAssert.class);
    }

    public static CarAgeAssert assertThat(Car[] actual) {
        return new CarAgeAssert(actual);
    }

    public void hasAge(int age) {
        for (int i = 0; i < actual.length; i++) {
            if (actual[i].getAge() != age) {
                failWithMessage("Błędny wiek");
            }
        }
    }
}

package kukulam.module.testing.level.E;

public class MyNumberCalculator {


    double average(int[] numbers) {
        int result =0;
        for (int i = 0; i < numbers.length; i++) {
            result = sum(numbers)/numbers.length;
        }
        return result;
    }


    int sum(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
}

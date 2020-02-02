package kukulam.module.testing.level.E;

public class MyNumberCalculator {


    double average(int[] numbers) {
        double result =0;
            result = sum(numbers)/(double)numbers.length;
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

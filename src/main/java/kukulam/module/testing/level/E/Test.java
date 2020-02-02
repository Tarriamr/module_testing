package kukulam.module.testing.level.E;

public class Test {

    public static void main(String[] args) {
        int c = -1;

        if (c++ >= 0) {
            System.out.print("L");
        } else {
            System.out.print("K");
            if (c < 0) {
                System.out.print(c);
            }
        }
        System.out.println(c);
    }
}

package kukulam.module.testing.level.E;

public class Test {
    private static int a;

    public static void main(String[] args) {
        int a = 5;
        System.out.print(f(a));
        System.out.print(f(a));
        System.out.print(a);
    }

    public static int f(int x) {
        a++;
        return a + x;


    }
}

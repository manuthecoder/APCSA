public class Sandbox09272024 {
    public int test (int a, int b) {
        return a + b;
    }
    public int run() {
        return test(1, 2);
    }
    public static void main(String[] args) {
        double a = 1.5;
        double b = 1.5;

        Sandbox09272024 sandbox = new Sandbox09272024();
        System.out.println(sandbox.run());

        System.out.println(a + b);
    }
}

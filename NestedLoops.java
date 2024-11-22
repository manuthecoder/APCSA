public class NestedLoops {
    public static void repeatLetter(int n, char ch) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }

    public static void repeat(int n, char base) {
        for (int i = 0; i < n; i++) {
            char ch = base;
            for (int j = 0; j < n - i; j++) {
                repeatLetter(n - j, ch);
                ch++;
                if (ch > 'Z') {
                    ch = 'A';
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        repeat(4, 'C');
        repeat(5, 'A');
        repeat(7, 'B');
        repeat(6, 'X');
        repeat(8, 'Z');
    }
}
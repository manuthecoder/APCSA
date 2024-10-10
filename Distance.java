public class Distance {
    public static double getDistance(int xOne, int yOne, int xTwo, int yTwo) {
        double deltaX = xTwo - xOne;
        double deltaY = yTwo - yOne;
        double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        return distance;
    }

    public static String round(double num) {
        return String.format("%.3f", num);
    }

    public static void main(String[] args) {
        System.out.println(round(getDistance(1, 1, 2, 1)));
        System.out.println(round(getDistance(1, 1, -2, 2)));
        System.out.println(round(getDistance(1, 1, 0, 0)));
        System.out.println(round(getDistance(0, 0, 3, 4)));
    }
}
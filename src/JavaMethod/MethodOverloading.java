package JavaMethod;

public class MethodOverloading {

    /**
     * @param x
     * @param y
     * @return
     */
    static int plusMethod(int x, int y) {
        return x + y;
    }

    /**
     * @param x
     * @param y
     * @return
     */
    static double plusMethod(double x, double y) {
        return x + y;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int myNumber = plusMethod(2, 3);
        double myNumber2 = plusMethod(2.1, 3.1);
        System.out.println("Int" + myNumber);
        System.out.println("Double " + myNumber2);
    }

}

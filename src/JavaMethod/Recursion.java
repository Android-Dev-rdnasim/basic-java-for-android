package JavaMethod;

public class Recursion {

    public static void main(String[] args){
        int result = sum(10);
        int result2 = sum2(5, 10);
        System.out.println(result);
        System.out.println(result2);

    }

    // 10 + sum(9)
    // 10 + (9 + sum(8))
    // 10 + (9 + 8 + sum(7))
    // 10 + 9 + 8 + 7 + 6 + 5 + 4 +3 + 2 + 1 + sum(0)
    // 10 + 9 + 8 + 7 + 6 + 5 + 4 +3 + 2 + 1 + 0

    public static int sum(int x) {
        if (x > 0) {
            //System.out.println(x);
            return x + sum(x - 1);

        } else {
            return 0;
        }
    }

    public static int sum2(int start, int end){
        if (end > start){
            System.out.println(end);
            return end + sum2(start, end - 1);
        } else {
            System.out.println(end);
            return end;
        }
    }
}

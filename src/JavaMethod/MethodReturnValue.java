package JavaMethod;

public class MethodReturnValue {

    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        int z = myMethod(12, 11);
        //System.out.println(myMethod(12, 11));
        System.out.println(z);
    }
}

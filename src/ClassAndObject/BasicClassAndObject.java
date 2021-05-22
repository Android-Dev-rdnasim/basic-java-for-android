package ClassAndObject;

public class BasicClassAndObject {
    //accessing attribute
    int x = 5;
    int y = 4;

    final double pi = 3.1416;

    //modify attribute
    int z;

    public static void main(String[] args){
        BasicClassAndObject myObj = new BasicClassAndObject();
        BasicClassAndObject myObj2 = new BasicClassAndObject();

        myObj2.z = 10;
        myObj.x = 7;

        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        System.out.println(myObj2.z);

    }
}

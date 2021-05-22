package ClassAndObject;

public class Modifier {

    //access modifier
    //for class -> public/default

    //attribute, methods and constructor -> public/private/protected/default
    public int x = 5;
    protected void myMethod(){
        System.out.println("Print something!");
    }
    private Modifier(){
        System.out.println("Print something!");
    }


    //non-access modifier
    //class -> final, abstract

    //attribute, methods -> final, static, abstract and another three

    //example for FINAL

    final int y = 10;
    final double PI = 3.1416;

    public static void main(String[] args){
        Modifier myMod = new Modifier();
        //myMod.y = 50; // will generate error
        //myMod.PI = 25; // will generate error

        System.out.println(myMod.y);
    }

}

package ClassAndObject;

public class StaticOrNonStatic {
    //static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating object!");
    }

    //public method
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating objects!");
    }

    public static void main(String[] args){
        myStaticMethod();

        //create object
        StaticOrNonStatic myObj = new StaticOrNonStatic();
        myObj.myPublicMethod();
    }
}

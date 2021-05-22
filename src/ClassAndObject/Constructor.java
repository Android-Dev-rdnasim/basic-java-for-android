package ClassAndObject;

public class Constructor{
    //create a class attribute
    int x;
    int modelYear;
    String modelName;

    //create a constructor for the Constructor class
    /*public Constructor(){
        x = 5; //value initialize
    }*/
    public Constructor(int year, String name){
        modelYear = year;
        modelName = name;
    }


    public static void main(String[] args){
        Constructor myCons = new Constructor(1991, "Toyota");

        System.out.println(myCons.modelYear + ", " + myCons.modelName);
    }
}

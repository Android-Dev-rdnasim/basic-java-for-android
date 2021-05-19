public class Car extends Vehicle{
    private String modelName = "Ford"; //

    public static void main(String[] args){

        //create a myCar Object
        Car myCar = new Car();

        //Call the horn() method from Vehicle class on the myCar object
        myCar.horn();
        myCar.changeGear(12);

        System.out.println(myCar.brand + " " + myCar.modelName);


    }

}

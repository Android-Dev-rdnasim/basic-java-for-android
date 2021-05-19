public class Vehicle {

    //declare variables
    private static int gear = 1;
    private static int speed = 3;

    public String brand = "Bangla Car";
    /*public static void main(String[] args){

        //call methods
        changeGear(23);
        speedUp(2);
        System.out.println(" Speed:" + speed + " gear:" + gear);

    }*/

    public void horn(){
        System.out.println("Tuut, tuut!");
    }



    /*public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }*/

    //method
    public void changeGear(int newGear){
        gear = newGear;
        System.out.println(gear);
    }

    public static void speedUp(int increment){
        speed = speed + increment;
        System.out.println(speed);
    }









}

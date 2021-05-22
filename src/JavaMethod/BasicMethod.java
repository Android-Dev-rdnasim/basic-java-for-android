package JavaMethod;

public class BasicMethod {
    static String COUNTRY = "bangladesh";


    /**
     * @param friendName
     * @param age
     * @param address
     */
    static void myMethod(String friendName, int age, String address) {
        // code to be executed
        System.out.println("Name: " + friendName + ", age: " + age + ", address: " + address);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied.");
        } else if (age == 19) {
            System.out.println("Contact with admin. and call him.");
        } else {
            System.out.println("Access granted.");
        }
    }


    public static void main(String[] args) {
        myMethod("Rasin", 21, "Savar");
        myMethod("Arif", 22, "Savar");
        myMethod("Rubel", 24, "Mirpur");

        checkAge(-1);
    }

}

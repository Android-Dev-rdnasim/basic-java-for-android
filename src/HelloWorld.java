public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world from Android Development");

        //byte = 8-bit integer
        //short = 16-bit integer
        //int = 32-bit integer
        //long = 64-bit integer

        //float = 32-bit floating
        //double = 64-bit floating

        //boolean is true or false

        //char = 16-bit unicode charter

        /* what is unicode */

        int departmentIdPosition = 3;

        // Allocation memory for 5 integers
        int[] myArray = new int[5];

        myArray[0] = 11;
        myArray[1] = 22;
        myArray[2] = 33;
        myArray[3] = 44;
        myArray[4] = 55;

        System.out.println("Index 0:" + myArray[0]);
        System.out.println("Index 1:" + myArray[1]);
        System.out.println("Index 2:" + myArray[2]);
        System.out.println("Index 3:" + myArray[3]);
        System.out.println("Index 4:" + myArray[4]);

        //condition(if/else and switch) - loops(for and while) - branching statement(break, continue, return)


        //if - else
        int day = 4;

        if (day == 4) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Another day");
        }

        int x = 20;
        int y = 22;

        if (x > y) {
            System.out.println("X is greater than Y");
        } else if (x == y) {
            System.out.println("X is equal to Y");
        } else {
            System.out.println("X is less than Y");
        }


        //switch

        int dayOfWeek = 200;
        String dayString = "";

        switch (dayOfWeek) {
            case 1: dayString = "Saturday";
                break;
            case 2: dayString = "Sunday";
                break;
            case 3: dayString = "Monday";
                break;
            case 4: dayString = "Tuesday";
                break;
            case 5: dayString = "Wednesday";
                break;
            case 6: dayString = "Thursday";
                break;
            case 7: dayString = "Friday";
                break;
            default:
                dayString = "This is not week days";
        }

        System.out.println(dayString);

        //while loop

        int counter = 1;
        while (counter < 10){
            System.out.println("Count is: " + counter);
            counter++;
            //counter = counter + 1;

            /* This is comment */


            /*
             * This is comment
             * this is comment
             * this is comment
             */


        }

        //for loop

        for (int input = 1; input <= 5; input++){
            System.out.println("Input is: " + input);
        }

    }
}

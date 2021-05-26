public class TestMain {
    public static void main(String[] args)
    {
        char cp1 = 'a';
        int cp2 = 88;

        boolean b1 = Character.isAlphabetic(cp1);
        boolean b2 = Character.isAlphabetic(cp2);

        System.out.println((char) cp1 + " is alphabet? " + b1);
        System.out.println((char) cp2 + " is alphabet? " + b2);

    }
}

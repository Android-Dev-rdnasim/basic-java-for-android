package ClassAndObject;

public class PolymorphismMain extends Polymorphism{
    public static void main(String[] args){
        Polymorphism myAnimal = new Polymorphism();
        PolymorphismSecond myCat = new PolymorphismSecond();
        PolymorphismThird myDog = new PolymorphismThird();
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}

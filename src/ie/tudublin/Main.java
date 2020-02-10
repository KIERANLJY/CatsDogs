package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        // Polymorphism: The type is a superclass, the instance is a subclass

        //This is not polymorphism
        Cat topcat = new Cat("Topcat");

        //This is polymorphism
        Animal mino = new Cat("Mino");

        // A vitual method
        // Dynamic binding
        mino.speak();

        // This won't compile
        // System.out.println(mino.getNumLives());

        // This is an example of a cast
        System.out.println(((Cat)(mino)).getNumLives());

        mino = new Dog("Misty"); // This will compile
        // topcat = new Dog("Tara"); // This won't compile

        Animal a = new Cat("a");
        Animal b = new Cat("b");

        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);
    }
}
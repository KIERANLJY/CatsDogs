package ie.tudublin;

public class Dog extends Animal
{
    public Dog(String name)
    {
        // Constructor chaining
        super(name);
    }

    public void speak()
    {
        System.out.println("Wolf");
    }
}
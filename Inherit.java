/*Inheritance work space
Requested files: Inherit.java (Download)
Type of work: Individual work
Create a Bank Management System( Console based mini project). */
class Animal
{
    public static void eat()
    {
    System.out.println("Eats");
    
    }
    public static void run()
    {
    System.out.println("Runs");
    }
}
class Dog extends Animal
{
    public static void dog()
    {
        System.out.println("Barks");
    
    }
}
public class Inherit extends Animal
{
    public static void cat()
    {
        System.out.println("Meow");
    }
    public static void main(String args[])
    {
        Animal an=new Animal();
        cat();
        an.eat();
        an.run();
        Dog d=new Dog();
        d.dog();
    }
}

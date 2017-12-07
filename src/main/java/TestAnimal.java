/**
 * Created by aleksandra on 12/5/17.
 */
public class TestAnimal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cat Tom = new Cat( "Tom" , 3);
        Cat Rora = new Cat("Rora" , 22);
        Dog Timmy = new Dog( "Timmy",5);
        Dog Jey = new Dog("Jey", 99);
        Dragon Baloo = new Dragon ("Baloo" ,355);
        Tom.eat();
        Timmy.eat();
        Jey.eat();
        Baloo.eat();

        Tom.say();
        Rora.say();
        Baloo.say();

        Tom.getAge();
        Rora.getAge();
        Timmy.getAge();
        Jey.getAge();
        Baloo.getAge();

        Baloo.fly();



    }
}

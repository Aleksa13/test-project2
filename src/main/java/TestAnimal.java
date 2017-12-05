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
        Tom.eat();
        Tom.say();
        Tom.getAge();
        Rora.getAge();
        Timmy.getAge();
        Jey.getAge();
        Timmy.eat();
        Jey.eat();
    }
}

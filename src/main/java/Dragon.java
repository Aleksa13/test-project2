/**
 * Created by aleksandra on 12/5/17.
 */
public class Dragon extends AbstractAnimal {

    Dragon(String name , int age){
        super(name, age);
    }

    public void say() {
        System.out.println("Dragon " + name + " says Arggggg");

    }

    @Override
    public int getAge() {
        System.out.println("Dragon " + name + " age is " + age);
        return age;

    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("Drgon " + name + " likes to eat people");

    }

    public void makeFriendsWith() {
        System.out.println("Dragon" + name + " has friends - Cats");
    }

    public void fly() {
        System.out.println("Dragon " + name + " Can fly ");
    }
}

/**
 * Created by aleksandra on 12/5/17.
 */
public class Dog extends AbstractAnimal {

    Dog(String name , int age){
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Dog" + name + " says WOOOOOOOF");

    }

    @Override
    public int getAge() {
        System.out.println("Dog " + name + " age is " + age);
        return age;
    }

    public void eat() {
        //super.eat();
        System.out.println("Dog " + name + " likes Beef");
    }

    public void makeFriendsWith() {
        System.out.println("Dog " + name + " has friend - Dragon ");
    }
}

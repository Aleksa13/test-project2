/**
 * Created by aleksandra on 12/5/17.
 */
public class Cat extends AbstractAnimal {


    Cat(String name , int age){
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Cat "+ name+ " says MAU");

    }

    @Override
    public int getAge() {
            System.out.println("Cat " +name+ " age is " + age);
        return age;

    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("Cat "+ name+ "likes MILK");

    }

    //@Override
    public void makeFriendsWith() {
        System.out.println("Cat" +name + "has friend - Dog ");

    }

    @Override
    public String toString() {
        return "Cat name='" + name + '\'' +
                '}';
    }
}

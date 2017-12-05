/**
 * Created by aleksandra on 12/5/17.
 */
public class Cat extends AbstractAnimal {

    int age;
    String name;

    Cat(String name , int age){
        this.name=name;
        this.age=age;
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
        super.eat();
        System.out.println("Cat "+ name+ "likes MILK");

    }
}

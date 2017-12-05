/**
 * Created by aleksandra on 12/5/17.
 */
public class Dog extends AbstractAnimal {

      int age;
      String name;

    Dog(String name , int age) {
        this.name = name;
        this.age = age;
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
        super.eat();
        System.out.println("Dog " + name + " likes Beef");
    }
}

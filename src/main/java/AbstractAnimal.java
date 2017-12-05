/**
 * Created by aleksandra on 12/5/17.
 */
public abstract class AbstractAnimal implements Animal {

    public void eat() {
        System.out.println("Animal eat");
    }

    public void say() {
        System.out.println("Animal is speaking");
    }

    public int getAge() {
        System.out.println("Animal Age is 10");
        return 10;
    }
}

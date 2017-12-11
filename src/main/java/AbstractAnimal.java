import java.util.ArrayList;

/**
 * Created by aleksandra on 12/5/17.
 */
public abstract class AbstractAnimal implements Animal {

    public int age;
    public String name;
    private boolean hasFriends;
    public ArrayList<Animal> friends = new ArrayList<Animal>();

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "name='" + name + '\'' +
                '}';
    }

    AbstractAnimal(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public void addFriend(Animal animal){
        this.friends.add(animal);
    }


    public boolean isHasFriends() {
        return hasFriends;
    }

    public void setHasFriends(boolean hasFriends) {
        this.hasFriends = hasFriends;
    }

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

    //public void makeFriendsWith() {
        //System.out.println("Animal has friend");

    //}

    public String getName() {
        System.out.println("Animal name is" + name);
        return name;
    }

    public void makeFriendsWith(Animal animal) {
        this.friends.add(animal);
        animal.addFriend(this);

        System.out.println(name + " make new friends with " + animal.getName());
        hasFriends =  true;
        animal.setHasFriends(true);

    }
}

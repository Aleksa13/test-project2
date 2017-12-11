/**
 * Created by aleksandra on 12/5/17.
 */
public interface Animal {

    /***
     * Animal can eat food
     */
    void eat();
    void say();
    void makeFriendsWith (Animal animal);

    /***
     * Get age of Animal
     * @return int value
     */
    int getAge();
    String getName();

    boolean isHasFriends();
    void setHasFriends(boolean hasFriends);
    void addFriend(Animal animal);

}

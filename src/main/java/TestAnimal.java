import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by aleksandra on 12/5/17.
 */


public class TestAnimal {

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        Cat Tom = new Cat( "Tom" , 3);
//        Cat Rora = new Cat("Rora" , 22);
//        Dog Timmy = new Dog( "Timmy",5);
//        Dog Jey = new Dog("Jey", 99);
//        Dragon Baloo = new Dragon ("Baloo" ,355);
//        Tom.eat();
//        Timmy.eat();
//        Jey.eat();
//        Baloo.eat();
//
//        Tom.say();
//        Rora.say();
//        Baloo.say();
//
//        Tom.getAge();
//        Rora.getAge();
//        Timmy.getAge();
//        Jey.getAge();
//        Baloo.getAge();
//
//        Baloo.makeFriendsWith();
//        Tom.makeFriendsWith();
//        Timmy.makeFriendsWith();
//        Baloo.fly();


    @BeforeMethod
    public void Method(){
        System.out.println("I am a before method");
    }

    @BeforeClass
    public void Class(){
        System.out.println("I am a before Class");
    }

    @BeforeSuite
    public void Suite(){
        System.out.println("I am a before Suite");
    }

    @BeforeGroups
    public void Groups(){
        System.out.println("I am a before Groups");
    }


   // @AfterMethod
    ///public void Method(){
       /// System.out.println("I am a after Method");
   /// }


    @Test
    public void firstAnimalTest(){

        System.out.println("I am a test ONE");
        assertTrue(true, "i pass");
    }


    @Test
    public void secondAnimalTest(){
        Cat Tom = new Cat ("Tom",2);
        Cat Rora = new Cat ("Rora",4);

        System.out.println("I am a test SECOND");

        assertEquals(Tom,Rora , "Same cat?");
        assertEquals(2 ,5,"Expected value should be 5");

    }
}

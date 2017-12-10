import org.testng.annotations.*;

import javax.swing.plaf.basic.BasicLookAndFeel;

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
    public void Method() {
        System.out.println("I am a before method");
    }

    @BeforeClass
    public void Class() {
        System.out.println("I am a before Class");
    }

    @BeforeSuite
    public void Suite() {
        System.out.println("I am a before Suite");
    }

    @BeforeTest
    public void Test() {
        System.out.println("I am a before Test");
    }


    @AfterMethod
    public void Method1() {
        System.out.println("I am a after Method1");
    }

    @AfterClass
    public void Class1() {
        System.out.println("I am a after Class");
    }

    @AfterSuite
    public void Suite1() {
        System.out.println("I am a after Suite");
    }

    @AfterTest
    public void Test1() {
        System.out.println("I am a after Test");
    }


    @Test
    public void firstAnimalTest() {

        System.out.println("I am a test ONE");
        assertTrue(true, "i pass");
    }


    @Test
    public void secondAnimalTest() {
        Cat Tom = new Cat("Tom", 2);
        Cat Rora = new Cat("Rora", 4);

        System.out.println("I am a test SECOND");

        assertEquals(Tom, Rora, "Same cat?");
        assertEquals(2, 5, "Expected value should be 5");

    }

    @Test
    public void thirdAnimalTest() {
        Cat Tom = new Cat("Tom", 2);
        Cat Rora = new Cat("Rora", 4);

        System.out.println("I am a 3rd test");
        assertEquals(2, 2, "Same age?");
    }

    @Test
    public void fourthAnimalTest() {
        Cat Tom = new Cat("Tom",3);
        Cat Rora = new Cat("Rora", 4);

        System.out.println("I am a 4th test");
        assertTrue(false,"Cat is friend with Animals");
    }

}

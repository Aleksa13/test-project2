import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import sun.jvm.hotspot.interpreter.BytecodeRet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by aleksandra on 12/5/17.
 */


public class TestAnimal {
    Cat Tom = new Cat(" Tom", 3);
    Cat Rora = new Cat(" Rora", 4);
    Dragon Baloo = new Dragon(" Baloo", 150);
    SoftAssert softAssert = new SoftAssert();

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


    @BeforeMethod //(alwaysRun = true, dependsOnGroups = {"animal"}, dependsOnMethods = {"firstAnimalTest"})
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

    @BeforeGroups
    public void Groups() {
        System.out.println("I am a before Groups");
    }


    @AfterMethod
    public void Method1() {
        System.out.println("I am a after Method");
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

    @AfterGroups
    public void Groups1() {
        System.out.println("I am a after Groups");
    }


    @Test(groups = {"animal"})
    public void firstAnimalTest() {

        System.out.println("I am a test ONE");
        assertTrue(true, "i pass");
    }


    @Test(enabled = true)
    public void secondAnimalTest() {
        // Cat Tom = new Cat("Tom", 2);
        //   Cat Rora = new Cat("Rora", 4);

        System.out.println("I am a test SECOND");

        softAssert.assertEquals(Tom, Rora, "Same cat?");
        softAssert.assertEquals(2, 5, "Expected value should be 5");
        softAssert.assertAll();

    }

    @Test
    public void thirdAnimalTest() {

        System.out.println("I am a 3rd test");
        softAssert.assertEquals(Tom.getAge(), Rora.getAge(), "Same age?");
        softAssert.assertAll();
    }

    @Test
    public void fourthAnimalTest() {

        Tom.makeFriendsWith(Rora);

        System.out.println("I am a 4th test");
        softAssert.assertTrue(Tom.isHasFriends(), "TOM HAS FRIENDS ?");
        softAssert.assertAll();
    }

    @Test
    public void fifthAnimalTest() {


        System.out.println("I am a 5th test");
        softAssert.assertEquals(Tom.getName(), Rora.getName(), "Same name?");
        softAssert.assertAll();
    }

    @Test
    public void sixthAnimalTest() {
        System.out.println("i am 6th test");
        Tom.makeFriendsWith(Rora);
        Rora.makeFriendsWith(Baloo);

        System.out.println(Rora.friends);
        System.out.println("-------");
        System.out.println(Tom.friends);

        softAssert.assertTrue(Rora.friends.contains(Baloo), " Rora is friend with Baloo");
        softAssert.assertFalse(Baloo.isHasFriends(), "Baloo;s friends");
        softAssert.assertTrue(Baloo.friends.contains(Tom), " Baloo is friend with Tom");
        softAssert.assertAll();
    }

    //@Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }

    @Test
    public void testPage() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.w3schools.com/css/default.asp");
//        Thread.sleep(5000);  // Let the user actually see something!
//        WebElement Homebutton = driver.findElement(By.cssSelector("a.w3-left.w3-btn"));
//        WebElement Nextbutton = driver.findElement(By.cssSelector("a.w3-right.w3-btn"));
//
//        Nextbutton.isDisplayed();
//        Homebutton.isDisplayed();
//
//        WebElement TryIt = driver.findElement(By.cssSelector("a.w3-btn.w3-margin-bottom"));
//        TryIt.click();

        driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_default");

        //WebElement editfield = driver.findElement(By.cssSelector("#textareawrapper div div.CodeMirror-scroll div.CodeMirror-sizer div div div div.CodeMirror-code"));
        WebElement editfield = driver.findElement(By.cssSelector("#textareawrapper div div.CodeMirror-scroll div.CodeMirror-sizer div div div div.CodeMirror-code pre:nth-child(22) span span:nth-child(4)"));

        editfield.click();
        editfield.clear();
        editfield.sendKeys("<p><a> href=https://www.w3schools.com/html/>Visit our HTML tutorial</a></p>");



        WebElement Runbutton = driver.findElement(By.cssSelector("body div.trytopnav div button"));
        Runbutton.click();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }
}

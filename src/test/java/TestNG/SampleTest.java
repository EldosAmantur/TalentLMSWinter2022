package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTest {

    @Test
    public void demoTest1() {
        System.out.println("Demo test1");
    }

    @Test
    public void demoTest2() {
        System.out.println("Demo test2");
    }

    @BeforeMethod
    public void demoBefore() {
        System.out.println("Before test");
    }

    @AfterMethod
    public void afterBefore() {
        System.out.println("After test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeSuite
    public void demoBeforeSuite() {
        System.out.println("Demo Before Suite");
    }

    @AfterSuite
    public void demoAfterSuite() {
        System.out.println("Demo After Suite");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("Before Group");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @Test (dataProvider="numbers")
    public void testSum(int a, int b, int result){
        Assert.assertEquals(a+b, result);
    }

    @DataProvider
    public static Object [][] numbers() {
        return new Object[][]{
                {10, 20, 30},
                {0, 10, 10},
                {-10, 20, 10}
        };
    }

            @Test (dependsOnMethods = "testSum")
                    public void test3(){
                System.out.println("All good");
            }
    @Test ()
    public void test4(){
        System.out.println("All good");
    }


    }


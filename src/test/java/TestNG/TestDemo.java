package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDemo {

    @Test

    public void createNewUserTest(){
  //      TestNG.User firstUser= new Users("John",30);
 //       Assert.assertNotNull(firstUser);
    }

    @Test (dependsOnMethods = "createNewUserTest")

    public void loginTest(){
        Assert.assertTrue(true);
    }

    @DataProvider
    public static Object[][]numbers(){
        return new Object[][]{
                {"john@gmail.com","ValidPass"},
                {"johngmail.com","ValidPass"},
                {"john@gmail.com","WrongPass"}
        };
    }

    @Test (dataProvider = "inputvalues")
    public void testLoginFun(String userName, String password){
        System.out.println(userName+" "+password);
    }



}

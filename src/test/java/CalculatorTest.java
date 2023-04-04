import com.digital.Calculator;
import com.digital.SumClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class CalculatorTest {


    SoftAssert softAssert = new SoftAssert();
    @Test
    public void addTwoNumbersTest (){

        assertEquals(Calculator.add(2,2),4);
        assertEquals(Calculator.add(2,2),5);
        assertEquals(Calculator.add(2,3),5);
    }
    @Test
    public  void testSoftAssert(){

        softAssert.assertEquals(Calculator.add(2,2),4);
        softAssert.assertEquals(Calculator.add(2,2),5);
        softAssert.assertEquals(Calculator.add(2,2),4);
        softAssert.assertEquals(Calculator.add(2,2),4);
        softAssert.assertEquals(Calculator.add(2,2),4);
        softAssert.assertAll();
    }

    @Test
    public void testAssertTrue (){
        assertTrue(SumClass.isFunny(true));
        assertTrue (false);
    }
}

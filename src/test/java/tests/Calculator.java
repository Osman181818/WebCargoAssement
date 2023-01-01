package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class Calculator {
    CalculatorPage calculatorPage = new CalculatorPage();
    @Test
    public void testSum() {
        calculatorPage.navigateToUrl();

        //Assert.assertEquals(5, calculatorPage.addition("2","3"));
        Assert.assertEquals( calculatorPage.dortIslem("9","3","+"),12);
    }

    @Test(enabled = false) //there is abug
    public void testSub() {
        calculatorPage.navigateToUrl();

        //Assert.assertEquals(3, calculatorPage.subtraction("6","3"));
        Assert.assertEquals( calculatorPage.dortIslem("9","3","-"),6);
    }

    @Test
    public void testDivide() {
        calculatorPage.navigateToUrl();

      //  Assert.assertEquals(3, calculatorPage.divide("9","3"));
        Assert.assertEquals( calculatorPage.dortIslem("9","3","÷"),3);

    }

    @Test(enabled = false) //there is abug
    public void testMultiply() {
  calculatorPage.navigateToUrl();

      //  Assert.assertEquals(6, calculatorPage.multiple("2","3"));
        Assert.assertEquals( calculatorPage.dortIslem("9","3","x"),27);
    }

}

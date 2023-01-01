package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CalculatorPage {
    public CalculatorPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='result']/p")
    public WebElement result;

  public void getCharacter(String chr){

      WebElement element = Driver.get().findElement(By.xpath("//button[text()='"+chr+"']"));
      element.click();

  }

  public void navigateToUrl(){
      Driver.get().get(ConfigurationReader.get("url"));
  }

  public double multiple(String num1,String num2){
  getCharacter(num1);
  getCharacter("x");
  getCharacter(num2);
  getCharacter("=");
      return Integer.parseInt(result.getText());
  }
    public double divide(String num1,String num2){

        getCharacter(num1);
        getCharacter("÷");
        getCharacter(num2);
        getCharacter("=");
        return Integer.parseInt(result.getText());
    }
    public double subtraction(String num1,String num2){

        getCharacter(num1);
        getCharacter("-");
        getCharacter(num2);
        getCharacter("=");
        return Integer.parseInt(result.getText());
    }
    public double addition(String num1,String num2){

        getCharacter(num1);
        getCharacter("+");
        getCharacter(num2);
        getCharacter("=");
        return Integer.parseInt(result.getText());
    }

    public double dortIslem(String num1,String num2,String dortIslem){

        getCharacter(num1);
        getCharacter(dortIslem);
        getCharacter(num2);
        getCharacter("=");
        return Integer.parseInt(result.getText());
    }






}

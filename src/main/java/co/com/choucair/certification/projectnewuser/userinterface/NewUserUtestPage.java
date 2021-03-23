package co.com.choucair.certification.projectnewuser.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class NewUserUtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to sign up").
            located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NAME = Target.the("where do we write the user").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email address").
            located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we input the month of birth").
            located(By.xpath("//*[@id=\"birthMonth\"]/option[6]"));
    public static final Target INPUT_DAY = Target.the("where do we input the day of birth").
            located(By.xpath("//*[@id=\"birthDay\"]/option[30]"));
    public static final Target INPUT_YEAR = Target.the("where do we input the year of birth").
            located(By.xpath("//*[@id=\"birthYear\"]/option[12]"));
    public static final Target NEXT_BUTTON = Target.the("button to confirm next page").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target INPUT_CITY = Target.the("where do we input the city").
            located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("where do we input the ZIP or Postal code").
            located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Select Country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target NEXT_BUTTONDEVICES = Target.the("button to confirm next page").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target INPUT_COMPUTER = Target.the("Select your computer").
            located(By.xpath("//*[@id=\"ui-select-choices-row-11-8\"]"));

}

package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.String.format;

public class DirectoryPage {
    WebDriver driver;
    private static final String  dropdown ="//div[@role='option'][normalize-space()='%s']";

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Directory']")
    WebElement Directory;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement Employeename;

    @FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement jobtitle;

    @FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement location;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement search;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement Reset;

    public DirectoryPage  (WebDriver r){

        driver=r;
        PageFactory.initElements(r,this);
    }

    public void click_Directory(){
        Directory.click();

    }
    public void EnterEmployeename (String emp_name){
        Employeename.sendKeys(emp_name);
    }

    public void select_jobtitle(String userjo) {

        jobtitle.click();

        driver.findElement(By.xpath(format(dropdown,userjo))).click();

    }
    public void  select_location (String set_loc){

        location.click();

        driver.findElement(By.xpath(format(dropdown,set_loc))).click();
    }
    public void click_search (){
        search.click();

    }
    public void click_reset (){

        Reset.click();
    }
}

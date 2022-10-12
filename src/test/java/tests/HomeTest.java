package tests;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    private HomePage page;
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        page = new HomePage(driver);
    }
    @Test(testName = "US01 - search field")
    public void test01() {
        page.departments.click();
        page.allDepartments.click();
    }
}

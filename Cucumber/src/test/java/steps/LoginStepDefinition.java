package steps;



import org.junit.Assert;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;


public class LoginStepDefinition extends TestBase {
LoginPage loginPage; 



@Before
public void setUp() {
	initDriver();
	loginPage = PageFactory.initElements(driver, LoginPage.class);
}

@Given("User is on codefios login page")
public void user_is_on_codefios_login_page() {
	
//	driver.get("https://codefios.com/ebilling/");
  driver.get("https://qa.codefios.com/login");
	
}

@When("User enters username as {string}")
public void user_enters_username_as(String username) {
	
	loginPage.enterUserName(username);
}

@When("User enters password as {string}")
public void user_enters_password_as(String password) {
	loginPage.enterPassword(password);
}

@When("User clicks on sign in button")
public void user_clicks_on_sign_in_button() {
	loginPage.clickSignInButton();

}


@When("User clicks forgot password")
public void user_clicks_forgot_password() {
   loginPage.clickForgetPassword();
}



@Then("User should be landing on dashboard page")
public void user_should_be_landing_on_dashboard_page() {
	takeScreenshot(driver);

	String expecteTitle = "Codefios QA";
//	String expecteTitle = "Codefios";
	String actualTitle = loginPage.getPageTitle();
	Assert.assertEquals("Titles are not matching!" , expecteTitle, actualTitle);
}

@After
public void tearDown() {
	driver.close();
	driver.quit();
	
}
}



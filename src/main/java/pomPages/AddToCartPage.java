package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	@FindBy(id="add")
	private WebElement plus;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitbtn;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlus() {
		return plus;
	}
	
	public void submitButton() {
		submitbtn.click();
	}

}

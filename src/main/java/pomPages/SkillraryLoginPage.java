package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gerasBtn;
	
	@FindBy(xpath = "//a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoapp;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gerasButton() {
		gerasBtn.click();
	}
	public void skillrarydemoApp() {
		skillraryDemoapp.click();
	}

}

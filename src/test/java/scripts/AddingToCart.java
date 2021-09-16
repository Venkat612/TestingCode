package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class AddingToCart extends BaseClass {
	@Test
	public void tcc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrarydemoApp();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	}

	
}

package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Baseclass  {


		@FindBy(xpath = "//div/u1/li[1]/a[text()='Women']")
		private WebElement womenmenu;

		@FindBy(xpath = "//div/u1/li[2]/a[text()='Dresses']")
		private WebElement dressmenu;
		
		@FindBy(xpath = "//div/u1/li[3]/a[text()='tshirts']")
		private WebElement tshirts;

	
		public Homepage() {
			PageFactory.initElements(driver, this);
	}

		public WebElement getwomenmenu() {
			return womenmenu;
		}
		public WebElement getdressmenu() {
			return dressmenu;
		}
		public WebElement gettshirts() {
			return tshirts;
			
		/*	public void getsubscription() {
				int random=new Random().nextInt(500000);
				System.out.println(random);
				setText(mailid,"Automation"+random+"@gmail.com");
				sendemail.click();
			}
			public String getSubscriptionMessage() {
				return newsletter.getText();
			}
		*/}
		
		
}

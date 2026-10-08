package Company;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Company4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mwstraining.com/");
        
        // enter mail
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Enter Email']"))).sendKeys("ashishappnox1@gmail.com");
        
        // enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='••••••••']"))).sendKeys("Ashish@567");
		
				// click on login button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();
		
		// click on Companies section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Companies']"))).click();
				
				// click on create company button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Company']"))).click();
				
				// enter company name
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//input[@placeholder='Enter Company Name']"))).sendKeys("Tower Research Capital");
				
				// upload company image
	    		WebElement companyImage = wait.until(
				    ExpectedConditions.presenceOfElementLocated(
				        By.xpath("(//input[@type='file'])[1]")
				    )
				);

				companyImage.sendKeys("C:\\Users\\user\\Downloads\\images (7).jpg"); 
				
				// Enter company description
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Tower Research Capital is a quantitative trading firm that specializes in high-frequency trading and market making. Founded in 1998, the company has grown to become one of the largest and most successful proprietary trading firms in the world. Tower Research Capital employs a team of highly skilled traders, engineers, and researchers who use advanced algorithms and technology to analyze market data and execute trades at lightning-fast speeds. The firm's trading strategies are based on statistical models and machine learning techniques, allowing them to identify profitable opportunities in the financial markets. Tower Research Capital is known for its innovative approach to trading and its commitment to staying at the forefront of technological advancements in the industry.");
				
				// enter the product name
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("(//input[@placeholder='Enter Device Name'])[1]"))).sendKeys("Core Tech & Research Infrastructure");
				
				// enter device description
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Tower Research Capital's core technology and research infrastructure is designed to support the firm's high-frequency trading and market making activities. The infrastructure includes a combination of hardware, software, and data analytics tools that enable the firm to process large volumes of market data in real-time and execute trades at lightning-fast speeds. The firm's technology stack includes custom-built trading algorithms, low-latency networking systems, and high-performance computing clusters that allow traders to analyze market trends and identify profitable opportunities. Additionally, Tower Research Capital invests heavily in research and development to continuously improve its technology and stay ahead of the competition in the fast-paced world of quantitative trading.");
				
				// Enter product image
				WebElement productImage = wait.until(
					    ExpectedConditions.presenceOfElementLocated(
					        By.xpath("(//input[@type='file'])[2]")
					    )
					);

					productImage.sendKeys("C:\\Users\\user\\Downloads\\images (8).jpg");
	    		
					// click on add device button
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Device']"))).click();
					
					// enter the device name
					wait.until(ExpectedConditions.visibilityOfElementLocated(
						    By.xpath("(//input[@placeholder='Enter Device Name'])[2]")))
						    .sendKeys("Quantitative trading");
					
					// enter device description
					wait.until(ExpectedConditions.visibilityOfElementLocated(
						    By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]")))
						    .sendKeys("Tower Research Capital's quantitative trading infrastructure is designed to support the firm's data-driven approach to trading. The infrastructure includes a combination of hardware, software, and data analytics tools that enable the firm to analyze large volumes of market data and identify profitable trading opportunities. The firm's technology stack includes custom-built trading algorithms, statistical models, and machine learning techniques that allow traders to make informed decisions based on real-time market data. Additionally, Tower Research Capital invests heavily in research and development to continuously improve its quantitative trading strategies and stay ahead of the competition in the fast-paced world of algorithmic trading.");
					
					//  Enter product image
					WebElement productImage1 = wait.until(
						    ExpectedConditions.presenceOfElementLocated(
						        By.xpath("(//input[@type='file'])[3]")
						    )
						);

						productImage1.sendKeys("C:\\Users\\user\\Downloads\\images (2).png");
						
						// click on save button
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save Company']"))).click();
				 

	}

}

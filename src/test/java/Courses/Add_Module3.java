package Courses;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Module3 {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[2]/button"))).click();
		
		// click on Course section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[8]/button"))).click();
		
		// click on course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div"))).click();
		
		//click on add lession button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div/aside/div[5]/button[1]"))).click();
		
		// enter Lession title	
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[1]/input"))).sendKeys("Java from first principles");
		
		// Enter Lession description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Learning Java from first principles means understanding how the language interacts directly with the Java Virtual Machine (JVM) before building complex programs. It requires mastering memory allocation, object-oriented structures, and how human-readable code translates into machine-executable bytecode.");
		
		// click on text block 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div/div/button[1]"))).click();
		
		// enter text block title
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]"))).sendKeys("Learning Java from first principles means understanding how its source code compiles into platform-independent bytecode, which the Java Virtual Machine (JVM) then executes on any operating system. This foundation relies on static, strong typing where primitive types store raw data directly in memory and reference types hold memory addresses pointing to objects. By using templates called classes to construct active objects, Java applies the four pillars of object-oriented programming—encapsulation to secure data, inheritance for code reuse, polymorphism for dynamic behavior, and abstraction to hide complexity—ensuring scalable, predictable memory management and execution.");
		
		// click on document block
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div/div/button[4]"))).click();
		
		// enter image block title
		WebElement fileInput = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
	        );

	        // Provide the absolute path to your image
	        File file = new File("C:\\Users\\user\\Downloads\\Members_Module_80_Test_Cases.docx");
	        fileInput.sendKeys(file.getAbsolutePath());
	        
	        // click on save button
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/button[2]"))).click();

	}

}

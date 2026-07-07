package Courses;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_CourseModule2 {

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[10]/button"))).click();
		
		// click on course
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[1]/div/div/div/table/tbody/tr[1]/td[6]/div"))).click();
		
		//click on add lession button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div/aside/div[5]/button[1]"))).click();
		
		// enter Lession title	
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[1]/input"))).sendKeys("Data Science from first principles");
		
		// Enter Lession description
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]"))).sendKeys("Data science from first principles means understanding core concepts by building algorithms and mathematical models from the ground up, rather than relying on high-level libraries. This involves implementing fundamental statistics, linear algebra, and machine learning models using basic programming tools");
		
		// click on text block 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div/div/button[1]"))).click();
		
		// enter text block title
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]"))).sendKeys("Data science from first principles means mastering the field by building algorithms, mathematical structures, and statistical models entirely from scratch rather than relying on pre-built libraries. By writing your own code for core operations like matrix multiplication, probability distributions, gradient descent, and machine learning models, you uncover the mechanics hidden inside modern software \"black boxes\". This rigorous approach deepens your conceptual understanding, allows you to debug complex failures with precision, and gives you the ultimate flexibility to customize algorithms for highly specialized problems.");
		
		// click on Video block
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[2]/div[2]/div/div/button[3]"))).click();
		
		// enter image block title
		WebElement fileInput = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']"))
	        );

	        // Provide the absolute path to your image
	        File file = new File("C:\\Users\\user\\Downloads\\test.mp4");
	        fileInput.sendKeys(file.getAbsolutePath());
	        
	        // click on save button
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div[1]/div/button[2]"))).click();

	}

}

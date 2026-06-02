package Marketing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Edit_Quiz {

	public static void main(String[] args) throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div/form/div[3]/button"))).click();
		
		// click on marketing section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/aside/nav/div[7]/button"))).click();
		
		// click on the edit section of the created module
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/main/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/div/button[2]"))).click();
		
		// create Actions object
        Actions actions = new Actions(driver);

        // locate the element where hover is required
        WebElement hoverElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[3]/button")
            )
        );

        // hover on the element
        actions.moveToElement(hoverElement).perform();
        Thread.sleep(2000);
        
        // click on edit button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[3]/button/div/div[2]/div[1]"))).click();
        
        //Edit the quiz title
        WebElement quizTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[1]/input")));
        quizTitle.clear();
        
        // Enter new quiz title
        quizTitle.sendKeys("Artificial Intelligence");
        
        //Edit the quiz description
        WebElement quizDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/textarea")));
        quizDescription.clear();
        
        // Enter new quiz description
        quizDescription.sendKeys("This quiz is about Artificial Intelligence.");
        
        //Edit the problem
        WebElement quizProblem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/input")));
        quizProblem.clear();
        
        // Enter new problem
        quizProblem.sendKeys("What is Artificial Intelligence?");
        
        // edit first option
        WebElement firstOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/input")));
        firstOption.clear();
        
        // Enter new first option
        firstOption.sendKeys("Artificial Intelligence is the simulation of human intelligence processes by machines, especially computer systems.");
        
        // edit second option
        WebElement secondOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/input")));
        secondOption.clear();
        
        // Enter new second option
        secondOption.sendKeys("Artificial Intelligence is a branch of computer science that focuses on creating intelligent machines that can perform tasks that typically require human intelligence.");
        
        // edit third option
        WebElement thirdOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/input")));
        thirdOption.clear();
        
        // Enter new third option
        thirdOption.sendKeys("Artificial Intelligence is the development of computer systems that can perform tasks that normally require human intelligence, such as visual perception, speech recognition, decision-making, and language translation.");
        
        // edit fourth option
        WebElement fourthOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/input")));
        fourthOption.clear();
        
        // Enter new fourth option
        fourthOption.sendKeys("Artificial Intelligence is the field of computer science that aims to create machines that can perform tasks that would typically require human intelligence, such as learning, problem-solving, and decision-making.");
        
        //Select the correct answer	
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div"))).click();
        
        // click on update button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div/button[2]"))).click();
        Thread.sleep(2000);
        
        
        //click on the quiz
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"admin-scroll-container\"]/div/div/div[2]/div/aside/div[2]/div[3]/button"))).click();

	}

}

package com.put.text_transformer.frontEndTests;

import com.put.text_transformer.TextTransform.TextInput;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

public class MyTestTransformerTest {

    @Test
    public void upperTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/put/text_transformer/frontEndTests/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://127.0.0.1:8082/");
        //WebElement element = driver.findElement(By.name("teext"));
        // WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("html/body/my-test-transformer"));
        WebElement shadowRoot = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot",element);
        WebElement inputTextArea = shadowRoot.findElement(By.id("inputTextArea"));
        inputTextArea.sendKeys("Hello World");
        WebElement resultTextArea = shadowRoot.findElement(By.id("resultTextArea"));
        WebElement addButton = shadowRoot.findElement(By.id("addButton"));
        WebElement transformButton = shadowRoot.findElement(By.id("transformButton"));
        WebElement inverseRadioButton = shadowRoot.findElement(By.id("inverseRadioButton"));
        WebElement upperRadioButton = shadowRoot.findElement(By.id("upperRadioButton"));
        inverseRadioButton.click();
        addButton.click();
        upperRadioButton.click();
        addButton.click();
        transformButton.click();
        while(resultTextArea.getAttribute("value") == null){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        assertEquals(resultTextArea.getAttribute("value"), "DLROW OLLEH");
        //
    }
}

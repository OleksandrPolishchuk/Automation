package test.java;

import org.openqa.selenium.JavascriptExecutor;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Testik {
//
//    @Test
//    public void testik1() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://vk.com");
//        driver.findElement(By.id("quick_email")).sendKeys("stydentkpi@meta.ua");
//        driver.findElement(By.id("quick_pass")).sendKeys("Polishchuk0209Q");
//        driver.findElement(By.id("quick_login_button")).click();
//        driver.close();
//        System.out.println();      play_new playing
//        Assert.assertTrue(2==2);
//    }


//    @Test
//    public void test2() throws InterruptedException {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://vk.com");
//        if (driver.findElement(By.id("quick_email")) != null) {
//            driver.findElement(By.id("quick_email")).sendKeys("stydentkpi@meta.ua");
//            driver.findElement(By.id("quick_pass")).sendKeys("polishchuk9379992qwerty");
//            driver.findElement(By.id("quick_login_button")).click();
//            driver.findElement(By.id("head_music_text")).click();
//            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//            driver.findElement(By.id("pad_search")).sendKeys("Михаил Круг");
//            Thread.sleep(3000);
//            driver.findElement(By.className("play_btn_wrap")).click();
//            System.out.println();
//
//            Assert.assertTrue(2 == 2);
//        } else {
//            driver.findElement(By.id("head_music_text")).click();
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            driver.findElement(By.id("pad_search")).sendKeys("Михаил круг");
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            driver.findElement(By.className("play_btn_wrap")).click();
//            System.out.println();
//
//            Assert.assertTrue(2 == 2);
//        }
//    }
//
//    @Test
//    public void test3() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://uz.gov.ua");
//
//        WebElement element = driver.findElement(By.xpath(".//*[@id='main-nav']/li[2]/a/span"));       //имитирование наведения мишки по элементу
//        Actions actions = new Actions(driver);                                                        //имитирование наведения мишки по элементу
//        actions.moveToElement(element).build().perform();                                            //имитирование наведения мишки по элементу
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element11 = driver.findElement(By.xpath(".//*[@id='main-nav']/li[2]/div/div/ul/li[2]/a/span"));
//        Actions actions1 = new Actions(driver);                                                        //имитирование наведения мишки по элементу
//        actions1.moveToElement(element11).build().perform();
//        driver.findElement(By.xpath(".//*[@id='main-nav']/li[2]/div/div/ul/li[2]/a/span")).click();
//
//    }

    @Test
    public void countMessage() {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://vk.com");
        driver.findElement(By.id("quick_email")).sendKeys("stydentkpi@meta.ua");
        driver.findElement(By.id("quick_pass")).sendKeys("polishchuk0209");
        driver.findElement(By.id("quick_login_button")).click();


    }


}
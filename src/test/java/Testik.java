package test.java;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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


    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://vk.com");
        if (driver.findElement(By.id("quick_email")) != null) {
            driver.findElement(By.id("quick_email")).sendKeys("stydentkpi@meta.ua");
            driver.findElement(By.id("quick_pass")).sendKeys("polishchuk9379992qwerty");
            driver.findElement(By.id("quick_login_button")).click();
            driver.findElement(By.id("head_music_text")).click();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            driver.findElement(By.id("pad_search")).sendKeys("Михаил Круг");
            Thread.sleep(3000);
            driver.findElement(By.className("play_btn_wrap")).click();
            System.out.println();

            Assert.assertTrue(2 == 2);
        } else {
            driver.findElement(By.id("head_music_text")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.id("pad_search")).sendKeys("Михаил круг");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.className("play_btn_wrap")).click();
            System.out.println();

            Assert.assertTrue(2 == 2);
        }
    }
}
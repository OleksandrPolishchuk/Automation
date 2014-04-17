
import org.openqa.selenium.JavascriptExecutor;


import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class tImeReport {

     @Test
    public void testik1(){
         WebDriver driver = new FirefoxDriver();
         driver.get("http://e-apps.playtech.corp/MyTimesheet/Pages/ViewSingle.aspx");

         String a = driver.findElement(By.xpath("//*[@id=\"ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl02_lblTotal2\"]/span")).getText();
         String a1 = a.replaceAll("(.*)\\/(.*)", "$2");



         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtSecondDay")).clear();
         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtSecondDay")).sendKeys(a1);


         String b = driver.findElement(By.xpath("//*[@id=\"ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl02_lblTotal3\"]/span")).getText();
         String b1 = b.replaceAll("(.*)\\/(.*)", "$2");


         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtThirdDay")).clear();
         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtThirdDay")).sendKeys(b1);

         String c = driver.findElement(By.xpath("//*[@id=\"ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl02_lblTotal4\"]/span")).getText();
         String c1 = c.replaceAll("(.*)\\/(.*)", "$2");


         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtFourthDay")).clear();
         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtFourthDay")).sendKeys(c1);


         String d = driver.findElement(By.xpath("//*[@id=\"ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl02_lblTotal5\"]/span")).getText();
         String d1 = d.replaceAll("(.*)\\/(.*)", "$2");


         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtFifthDay")).clear();
         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtFifthDay")).sendKeys(d1);




         String e = driver.findElement(By.xpath("//*[@id=\"ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl02_lblTotal6\"]/span")).getText();
         String e1 = e.replaceAll("(.*)\\/(.*)", "$2");

         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtSixthDay")).clear();
         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_txtSixthDay")).sendKeys(e1);


         driver.findElement(By.id("ctl00_m_g_a5e2e1d8_a85b_4afa_a0af_d9263dc79413_ctl00_gridViewReportedHours_ctl03_imgButtonUpdate")).click();



     }



}

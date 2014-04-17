//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.testng.AssertJUnit.assertTrue;
//
//
//public class Google {
//    private FirefoxDriver driver;
//
//    @BeforeTest
//    public void setup() {
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.get("http://vk.com");
//    }
//
//    @AfterTest
//    public void tearDown() {
//        driver.close();
//    }
//
//
//    @Test
//    public void testSearch() {
//        HomePage home = new HomePage(driver);
//        ResultPage result = home.search("stydentkpi@meta.ua");
//        assertTrue(result.getFirstLink().contains("automated"));
//        ResultPage result1 = home.searchEmail("Polishchuk0209");
//    }
//}

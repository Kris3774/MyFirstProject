package infrastructura.base;

import infrastructura.TestServer;
import infrastructura.logging.StdTestLogger;
import infrastructura.wdm.DefaultWebDriverManager;
import infrastructura.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {
    private static WebDriverManager wdm;
    protected static StdTestLogger logger;
    protected static TestServer server;
    public static WebDriver driver;

    @Before
    public static void setup() {
        wdm = new DefaultWebDriverManager();
        logger = new StdTestLogger();
        driver= wdm.getDriver();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
    }

    @After
    public void tearDown() {

        wdm.destroyDriver(driver);
    }
    public void beforeTest(){
    }
    public void afterTest(){

    }
}


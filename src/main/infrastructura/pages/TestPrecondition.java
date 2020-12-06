package infrastructura.pages;

import infrastructura.base.TestBase;

public class TestPrecondition extends TestBase {
 public MainPage mainPage;

    @Override
    public void beforeTest() {
        super.beforeTest();
        mainPage=new MainPage(driver);
        mainPage.openPage(server.getUrl());
    }
}

package com.it.Tests;

import com.it.App;
import com.it.Users.User;
import com.it.Users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  protected static App app = new App();
  protected static User validUser= UserFactory.getValidUser();

    @AfterSuite
    public void tearDownSuits() {
        app.common.stopApp();
    }
}

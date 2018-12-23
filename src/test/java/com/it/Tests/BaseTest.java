package com.it.Tests;

import com.it.App;
import com.it.Users.User;
import com.it.Users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

  protected static App app = new App();
  protected static User validUser= UserFactory.getValidUser();

  @BeforeSuite
  public void setUpSuits() {
    app.adv.closeAdv();

  }

  @AfterSuite
    public void tearDownSuits() {
        app.common.stopApp();
    }
}

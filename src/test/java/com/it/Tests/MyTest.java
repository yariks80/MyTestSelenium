package com.it.Tests;

import com.it.Users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() {

        app.login.loginValidUser();
        Assert.assertEquals(app.dashBoard.getLoginEmail(), validUser.getEmail());
    }
}

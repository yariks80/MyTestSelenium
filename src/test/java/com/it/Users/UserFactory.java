package com.it.Users;

import com.it.Utils.Utils;
import com.it.Utils.Utils.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.it.Utils.Utils.Data.*;

public class UserFactory {
    static ResourceBundle bundle= ResourceBundle.getBundle("user");
    public static User getValidUser() {
     return    new User(
                getRandomName(),
                getRandomLastName(),
             bundle.getString("validLogin"),
             bundle.getString("validPassword"),
             bundle.getString("validEmail"));

    }

    public static ArrayList<User> getRandomUsers(int count) {
        ArrayList<User> collect =(ArrayList<User>) Stream.generate(() -> new User(
                getRandomName(),
                getRandomLastName(),
                getRandomString(15),
                getRandomString(16),
                getRandomEmail())).limit(count).collect(Collectors.toList());

        return collect;
    }
}

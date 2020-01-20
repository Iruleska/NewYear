package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;

public class LoginHelpers extends LoginPage {
    public void login(User user) {
        login(user.userName, user.password);
    }
}

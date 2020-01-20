package com.it;

import com.it.helpers.commonHelper;
import com.it.helpers.dashboardHelper;
import com.it.helpers.LoginHelpers;
import com.it.pages.DashboardPage;

public class App {
    public commonHelper common;
    public dashboardHelper dashboard;
    public LoginHelpers login;

    public App() {
       common = new commonHelper() ;
        dashboard = new dashboardHelper();
        login = new LoginHelpers();
    }
}

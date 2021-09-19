package com.baronasu.view;

import com.baronasu.EmailManager;

public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindos() {
        System.out.println("show login window called");
    }
}

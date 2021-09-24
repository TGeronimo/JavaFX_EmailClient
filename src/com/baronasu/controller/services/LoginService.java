package com.baronasu.controller.services;

import com.baronasu.EmailManager;
import com.baronasu.controller.EmailLoginResult;
import com.baronasu.model.EmailAccount;

public class LoginService {

    EmailAccount emailAccount;
    EmailManager emailManager;

    public LoginService(EmailAccount emailAccount, EmailManager emailManager) {
        this.emailAccount = emailAccount;
        this.emailManager = emailManager;
    }

    public EmailLoginResult login() {

    }
}

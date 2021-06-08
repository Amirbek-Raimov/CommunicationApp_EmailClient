package com.amirbek.view;

import com.amirbek.EmailManager;

public class ViewFactory {
    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }
    public void showLoginWindow(){
        System.out.println("show login window called");
    }

}

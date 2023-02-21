package com.example.source_dsa.Patterns.abstracttest;

import java.net.PasswordAuthentication;

/**
 * @Author : ArbindSharma
 * @Date : 09-02-2023
 **/
public class callingclass {
    public static void main(String[] args) {
        testclass testclass = new testclass();
        Authenticator auth = new SMTPAuthenticator();
        auth.getPasswordAuthentication();
        System.out.println(auth.getPasswordAuthentication());
    }
}

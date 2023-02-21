package com.example.source_dsa.Patterns.abstracttest;

import java.net.PasswordAuthentication;

/**
 * @Author : ArbindSharma
 * @Date : 09-02-2023
 **/
public class SMTPAuthenticator extends Authenticator{
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("Arbind", "Password".toCharArray());
    }


}

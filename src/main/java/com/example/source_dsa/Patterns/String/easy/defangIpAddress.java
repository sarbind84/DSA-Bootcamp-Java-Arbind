package com.example.source_dsa.Patterns.String.easy;

import java.security.SecureRandom;

/**
 * @Author : ArbindSharma
 * @Date : 20-10-2022
 **/
public class defangIpAddress {
    public static void main(String[] args) {


        String address = "1.1.1.1";


        StringBuilder str = new StringBuilder();
        for(int i =0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                str.append("[.]");

            }
            else {
                str.append(address.charAt(i));
            }
        }
        System.out.println(str);

    }
}

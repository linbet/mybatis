package com.test.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasypUtil {

    public static void main(String[] args) {
        //获取加密器
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        //设置盐
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
    }
}

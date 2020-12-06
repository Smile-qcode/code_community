package com.wenmrong.community1.community.test;

public class StringTest {

    public static void main(String[] args) {
        String a="https://gitee.com/api/v5/user?access_token=";
        String substring = a.substring(1, a.length() - 1);
        System.out.println(substring);
    }
}

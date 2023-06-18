package com.github.xiaoso456;


import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

public class Main {
    static String getMessage() {
        try {
            String className = "com.github.xiaoso456.Message";
            return (String) Class.forName(className).getDeclaredField("MESSAGE").get(null);
        } catch (Exception e) {
            return null;
        }
    }
    static int getVersion() {
        try {
            String className = "com.github.xiaoso456.Message";
            return (int) Class.forName(className).getDeclaredField("VERSION").get(null);
        } catch (Exception e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(getMessage() + getVersion());
    }
}
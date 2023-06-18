package com.github.xiaoso456;

import lombok.Data;


import java.lang.reflect.Field;

@Data
public class Message {
    public static final String MESSAGE = "Hello, native!";
    public static int VERSION = 1;

    static {
        String className = "com.github.xiaoso456.Message";
        try {
            Field version = Class.forName(className).getDeclaredField("VERSION");
            version.setAccessible(true);
            version.setInt(version,666);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

package com.github.xiaoso456.mavenspringbootnativeimage.tip;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aot.hint.ExecutableMode;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

public class AopTip implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        // 注册使用反射的方法
        Method method = ReflectionUtils.findMethod(com.github.xiaoso456.mavenspringbootnativeimage.aop.HelloAop.class, "helloAround", ProceedingJoinPoint.class);
        hints.reflection().registerMethod(method, ExecutableMode.INVOKE);
        // 注册反射的资源
        // hints.resources().registerPattern("my-resource.txt");

        // 注册序列化方法
        // hints.serialization().registerType(MySerializableClass.class);

        // 注册动态代理
        // hints.proxies().registerJdkProxy(MyInterface.class);
    }
}

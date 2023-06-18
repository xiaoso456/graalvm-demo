package com.github.xiaoso456.mavenspringbootnativeimage.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAop {

    @Pointcut("execution(* com.github.xiaoso456.mavenspringbootnativeimage.controller.HelloController.*(..))")
    public void helloControllerAop(){}

    @Around("helloControllerAop()")
    public Object helloAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = pjp.proceed();
        if(result instanceof String resultString){
            resultString = resultString + "aop after";
            return resultString;
        }
        return result;
    }
}

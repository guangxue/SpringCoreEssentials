package com.guangxuezhang.aop.logging.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.guangxuezhang.aop.logging.service.SimpleCalculator.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Start calculating");
    }

    @After("execution(* com.guangxuezhang.aop.logging.service.SimpleCalculator.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Ended calculating");
    }
}

package com.guangxuezhang.aop.logging.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectPointcuts {
    @Before("com.guangxuezhang.aop.pointcut.PointcutCollection.beforeCalculation()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[CUT] Start calculating");
    }

    @After("com.guangxuezhang.aop.pointcut.PointcutCollection.afterCalculation()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[CUT] Ended calculating");
    }
}

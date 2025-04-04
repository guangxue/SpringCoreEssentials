package com.guangxuezhang.aop.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointcutCollection {

    @Pointcut("execution(* com.guangxuezhang.aop.logging.service.MoreCalculator.*(..))")
    public void beforeCalculation() {}

    @Pointcut("execution(* com.guangxuezhang.aop.logging.service.MoreCalculator.*(..))")
    public void afterCalculation() {}
}

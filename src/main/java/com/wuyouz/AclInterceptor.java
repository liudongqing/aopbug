package com.wuyouz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by liudongqing on 16/7/19.
 */
@Aspect
@Component
public class AclInterceptor {

    @Pointcut("@target(com.wuyouz.AclRequired)")
    public void checkPermission() {
    }

    @Before("checkPermission()")
    public void doAccessCheck(JoinPoint joinPoint) {
        System.out.println("*************** Check Permission *********************");
    }
}

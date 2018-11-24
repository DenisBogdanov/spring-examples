package ru.bogdanium.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Denis, 24.11.2018
 */
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(void ru.bogdanium..*.set*(..))")
    public void callSetters(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + " called!");
    }

    @Around("execution(String playGame())")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        Object result = joinPoint.proceed();
        long gameDuration = System.nanoTime() - startTime;
        System.out.println("Game time=" + gameDuration / 1_000_000.0);
        return result;
    }

}

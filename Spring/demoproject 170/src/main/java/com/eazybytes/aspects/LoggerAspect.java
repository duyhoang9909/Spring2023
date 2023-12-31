package com.eazybytes.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.eazybytes.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method execution start.");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeSlaped = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute method : " + timeSlaped);
        logger.info(joinPoint.getSignature().toString() + " method execution end.");
    }
}

package com.whizlabs.spring.basics.aop.afterreturning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspect {
@AfterReturning(pointcut = "execution(* generate())", returning = "number")
private void printMethodResult(JoinPoint joinPoint,int number){
    System.out.println("Number " + number + " was generated in the method " + joinPoint.getSignature().getName());
}
}

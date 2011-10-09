package com.venkat.cellstore.domain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* com.venkat.cellstore.domain.*.*(..))")
	public void loggingPointCut() {
	}

	/*
	 * @Before("loggingPointCut()") public void logBefore(JoinPoint joinPoint) {
	 * System.out.println(joinPoint.getTarget().getClass().getSimpleName() +
	 * " Entering.." + joinPoint.getSignature().getName()); }
	 * 
	 * @After("loggingPointCut()") public void log(JoinPoint joinPoint) {
	 * System.out.println(joinPoint.getTarget().getClass().getSimpleName() +
	 * " Leaving.." + joinPoint.getSignature().getName()); }
	 */

	@Around("loggingPointCut()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(joinPoint.getTarget().getClass().getSimpleName()
				+ joinPoint.getSignature().getName());
		return joinPoint.proceed();
	}
}

package com.training.java.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut("execution(* com.training.java.spring.two.*.*(..))")
	public void loggingPointcut() {

	}
	
	@Around("loggingPointcut()")
	public Object logAround(ProceedingJoinPoint joinPoint)
	{
		System.out.println("Before method.."
				+ joinPoint.getSignature().getName() + " in "
				+ joinPoint.getTarget().getClass().getSimpleName());
		
		Object returnValue = null;
		
		try {
			returnValue = joinPoint.proceed();
		} catch (Throwable e) {
			System.out.println("I GOT ERROR!");
		}
		
		System.out.println("After method.."
				+ joinPoint.getSignature().getName() + " in "
				+ joinPoint.getTarget().getClass().getSimpleName());
		
		return returnValue;
	}

	/*@Before("loggingPointcut()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before method.."
				+ joinPoint.getSignature().getName() + " in "
				+ joinPoint.getTarget().getClass().getSimpleName());
	}
	
	@After("loggingPointcut()")
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println("After method.."
				+ joinPoint.getSignature().getName() + " in "
				+ joinPoint.getTarget().getClass().getSimpleName());
	}*/

}

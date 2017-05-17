package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object method, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		
		System.out.println("-------In After Advice Method----------\n");
				
	}

}

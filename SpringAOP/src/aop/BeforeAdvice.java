package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] params, Object arg2) throws Throwable {
				
		System.out.println("----------In Before Advice Method----------");
		System.out.println("Method is "+method.getName());
		System.out.println("---Inputs---");
		
		for(Object o: params)
		{
			System.out.println(o);
		}
		
		System.out.println("arg2 is "+arg2);
	}
}

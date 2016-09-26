package nl.paragonict.ee7example.log;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import nl.paragonict.ee7example.annotation.MethodLogger;

@Interceptor
@MethodLogger
public class MethodLogInterceptor {

	@AroundInvoke
    public Object logMethod(InvocationContext ctx) throws Exception {
		System.err.println("Calling method " + ctx.getMethod().getName() + " from " + ctx.getTarget().getClass().getSimpleName());
		return ctx.proceed();
	}

}

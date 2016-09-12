package nl.paragonict.ee7example.service.impl;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

import nl.paragonict.ee7example.annotation.MethodLogger;
import nl.paragonict.ee7example.service.IBusinessLogic;


@Decorator
@MethodLogger  // this annotation here DOES NOT work...
@Priority(Interceptor.Priority.APPLICATION)
public class DecoratedLogicImpl implements IBusinessLogic {

	@Inject
	@Delegate
	private IBusinessLogic delegate;
	
	public String getGreeting() {
		return delegate.getGreeting().replace("Hello", "Ohhi");
	}
	
}

package nl.paragonict.ee7example.service.impl;

import javax.ejb.Stateless;

import nl.paragonict.ee7example.service.IBusinessLogic;

@Stateless
public class BusinessLogicImpl implements IBusinessLogic {

	@Override
	public String getGreeting() {
		return "Hello World";
	}

	
}

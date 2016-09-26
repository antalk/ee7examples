package nl.paragonict.ee7example.service.impl;

import java.math.BigDecimal;

import javax.ejb.Stateless;

import nl.paragonict.ee7example.service.IPaypal;

@Stateless
public class DifferentLogicImpl implements IPaypal {

	@Override
	public boolean pay(BigDecimal amount) {
		System.err.println("thank you sir!");
		return false;
	}
}

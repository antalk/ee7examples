package nl.paragonict.ee7example.service;

import java.math.BigDecimal;

public interface IPaypal {

	public boolean pay(BigDecimal amount);
}

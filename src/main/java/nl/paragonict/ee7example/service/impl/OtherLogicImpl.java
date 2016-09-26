package nl.paragonict.ee7example.service.impl;

import javax.ejb.Stateless;

import nl.paragonict.ee7example.annotation.MethodLogger;
import nl.paragonict.ee7example.service.IOtherLogic;


@MethodLogger
@Stateless
public class OtherLogicImpl implements IOtherLogic {

	@Override
	public String getMessage() {
		return "Welcome to this demo..";
	}
}

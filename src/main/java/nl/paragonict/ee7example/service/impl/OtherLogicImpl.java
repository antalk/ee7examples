package nl.paragonict.ee7example.service.impl;

import nl.paragonict.ee7example.annotation.MethodLogger;
import nl.paragonict.ee7example.service.IOtherLogic;


@MethodLogger
public class OtherLogicImpl implements IOtherLogic {

	public String getMessage() {
		return "Welcome to this demo..";
	}
}

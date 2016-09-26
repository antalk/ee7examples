package nl.paragonict.ee7example.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import nl.paragonict.ee7example.service.IBusinessLogic;
import nl.paragonict.ee7example.service.IOtherLogic;
import nl.paragonict.ee7example.service.IPaypal;

@RequestScoped
@Named("bean")
public class BackingBean {

	@Inject
	private IBusinessLogic logic; 
	
	@Inject
	private IOtherLogic logic2;
	
	/*
	 * This inject DOES NOT work !
	 * 
	 * WHY?
	 *
	@Inject
	private DifferentLogicImpl logic3;
	*/
	
	@Inject
	private IPaypal paypalLogic;
	
	public String getMessage() {
		return logic.getGreeting()  +"," +  logic2.getMessage();
	}
}

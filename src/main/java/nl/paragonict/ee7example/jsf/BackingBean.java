package nl.paragonict.ee7example.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import nl.paragonict.ee7example.service.IBusinessLogic;
import nl.paragonict.ee7example.service.IOtherLogic;

@RequestScoped
@Named("bean")
public class BackingBean {

	@Inject
	private IBusinessLogic logic; 
	
	@Inject
	private IOtherLogic logic2;
	
	public String getMessage() {
		return logic.getGreeting()  +"," +  logic2.getMessage();
	}
}

package net.tinvention.training.arch.gl.ui;

import java.sql.SQLException;

import net.tinvention.training.arch.gl.bl.CustomerPurchaseLogic;
import net.tinvention.training.arch.gl.bl.CustomerRegistryLogic;
import net.tinvention.training.arch.gl.dto.CustomerInfoDto;

/**
 * 
 * This Class manage the User Interface, of the Customer Registry Application
 * the user can add new customer, or modify its data, ecc...
 * the user can add a purchase , ...
 * 
 * @author Stefano
 *
 */
public class ApplicationUI {
	
	private CustomerPurchaseLogic customerPurchaseLogic;
	
	private CustomerRegistryLogic customerRegistryLogic;
	
	
	public void showEditCustomerInfo(Long customerId) throws SQLException {
		
		CustomerInfoDto customerInfo = customerRegistryLogic.retriveCustomerInfo(customerId);
		
		//...
	}

	public void start() {
		try {
			//TODO ...
			showEditCustomerInfo(null);
			//TODO ...
		} catch (SQLException e) {
			//TODO Log details, and show error to the user
		} //TODO ...
	}

	public void setCustomerPurchaseLogic(CustomerPurchaseLogic customerPurchaseLogic) {
		this.customerPurchaseLogic = customerPurchaseLogic;
	}

	public void setCustomerRegistryLogic(CustomerRegistryLogic customerRegistryLogic) {
		this.customerRegistryLogic = customerRegistryLogic;
	}

	

}

package net.tinvention.training.arch.gl.bl;

import java.sql.SQLException;

import net.tinvention.training.arch.gl.dto.CustomerInfoDto;
import net.tinvention.training.arch.gl.persistence.CustomerDao;
import net.tinvention.training.arch.gl.persistence.dto.CustomerDto;

/**
 * 
 * This class offers methods necessary to manage the registry
 * 
 * @author Stefano
 *
 */
public class CustomerRegistryLogic {
	
	private CustomerPurchaseLogic customerPurchaseLogic;
	private CustomerDao customerDao;
	
	public CustomerRegistryLogic() {
		super();
		
		//Dependency Injection without IoC 
		// it is alternate way than using the LayerConfigurer that brings the IoC
		customerPurchaseLogic = new CustomerPurchaseLogic();
		customerDao = new CustomerDao();
	}

	public CustomerInfoDto retriveCustomerInfo(Long customerId) throws SQLException {
		CustomerInfoDto result = new CustomerInfoDto();		
		CustomerDto customer =  customerDao.selectBytId(customerId);
		result.setName(customer.getName());
		//TODO ... copy or transform ...		
		result.setNumOfPurchases( new Long (customerPurchaseLogic.getNumofPurchasesByCustomerId(customerId)));
				
		return null;
	}

	public void setCustomerPurchaseLogic(CustomerPurchaseLogic customerPurchaseLogic) {
		this.customerPurchaseLogic = customerPurchaseLogic;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

}

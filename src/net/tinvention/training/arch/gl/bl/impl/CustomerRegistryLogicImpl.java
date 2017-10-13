package net.tinvention.training.arch.gl.bl.impl;

import net.tinvention.training.arch.gl.bl.CustomerPurchaseLogic;
import net.tinvention.training.arch.gl.bl.CustomerRegistryLogic;
import net.tinvention.training.arch.gl.dto.CustomerInfoDto;
import net.tinvention.training.arch.gl.persistence.CustomerDao;
import net.tinvention.training.arch.gl.persistence.dto.CustomerDto;
import net.tinvention.training.arch.gl.persistence.impl.CustomerDaoImpl;

/**
 * 
 * This class offers methods necessary to manage the registry
 * 
 * @author Stefano
 *
 */
public class CustomerRegistryLogicImpl implements CustomerRegistryLogic {

	private CustomerPurchaseLogic customerPurchaseLogic;
	private CustomerDao customerDao;

	public CustomerRegistryLogicImpl() {
		super();
		
		//Dependency Injection without IoC 
		// it is alternate way than using the LayerConfigurer that brings the IoC
		customerPurchaseLogic = new CustomerPurchaseLogicImpl();
		customerDao = new CustomerDaoImpl();
	}

	@Override
	public CustomerInfoDto retriveCustomerInfo(Long customerId) throws Exception {
		CustomerInfoDto result = new CustomerInfoDto();
		CustomerDto customer = customerDao.selectBytId(customerId);
		result.setName(customer.getName());
		// TODO ... copy or transform ...
		result.setNumOfPurchases(new Long(customerPurchaseLogic.getNumofPurchasesByCustomerId(customerId)));

		return null;
	}

	public void setCustomerPurchaseLogic(CustomerPurchaseLogic customerPurchaseLogic) {
		this.customerPurchaseLogic = customerPurchaseLogic;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

}

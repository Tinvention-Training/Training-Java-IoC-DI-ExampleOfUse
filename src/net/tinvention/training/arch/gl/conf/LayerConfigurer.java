package net.tinvention.training.arch.gl.conf;

import javax.sql.DataSource;

import net.tinvention.training.arch.gl.bl.CustomerPurchaseLogic;
import net.tinvention.training.arch.gl.bl.CustomerRegistryLogic;
import net.tinvention.training.arch.gl.persistence.CustomerDao;
import net.tinvention.training.arch.gl.persistence.PurchaseDao;
import net.tinvention.training.arch.gl.ui.ApplicationUI;

/**
 * 
 * The basic idea of the Dependency Injection with IoC 
 * is to have a separate object, an assembler, 
 * that populates a field in the lister class with an appropriate 
 * implementation the declared dependencies, 
 * 
 * 
 * This class configures the dependencies, injecting appropriate instances
 * This class take control on what instances inject , configuring the layers dependencies 
 * 
 * @author Stefano
 *
 */
public class LayerConfigurer {
	
	public static ApplicationUI getApplicaitonConfigured() {
		DataSource dataSource = null; //TODO may you can use jndi lookup or other ways..
		
		CustomerDao customerDao = new CustomerDao(dataSource);//Inject by constructor
		PurchaseDao purchaseDao = new PurchaseDao(); //TODO to be implemented DI ..
		
		CustomerPurchaseLogic customerPurchaseLogic = new CustomerPurchaseLogic();
		customerPurchaseLogic.setPurchaseDao(purchaseDao);
	
		CustomerRegistryLogic customerRegistryLogic = new CustomerRegistryLogic();
		customerRegistryLogic.setCustomerDao(customerDao);
		customerRegistryLogic.setCustomerPurchaseLogic(customerPurchaseLogic);
		
		ApplicationUI result = new ApplicationUI();
		result.setCustomerRegistryLogic(customerRegistryLogic);
		
		return result;
		
	}

}

package net.tinvention.training.arch.gl.conf;

import javax.sql.DataSource;

import net.tinvention.training.arch.gl.bl.impl.CustomerPurchaseLogicImpl;
import net.tinvention.training.arch.gl.bl.impl.CustomerRegistryLogicImpl;
import net.tinvention.training.arch.gl.persistence.impl.CustomerDaoImpl;
import net.tinvention.training.arch.gl.persistence.impl.PurchaseDaoImpl;
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
		
		CustomerDaoImpl customerDao = new CustomerDaoImpl(dataSource);//Inject by constructor
		customerDao.setDataSource(dataSource);
		
		PurchaseDaoImpl purchaseDao = new PurchaseDaoImpl(); //TODO to be implemented DI ..
		
		CustomerPurchaseLogicImpl customerPurchaseLogic = new CustomerPurchaseLogicImpl();
		customerPurchaseLogic.setPurchaseDao(purchaseDao);
	
		CustomerRegistryLogicImpl customerRegistryLogic = new CustomerRegistryLogicImpl();
		customerRegistryLogic.setCustomerDao(customerDao);
		customerRegistryLogic.setCustomerPurchaseLogic(customerPurchaseLogic);
		
		ApplicationUI result = new ApplicationUI();
		result.setCustomerRegistryLogic(customerRegistryLogic);
		
		return result;
		
	}

}

package net.tinvention.training.arch.gl.bl.impl;

import java.util.List;

import net.tinvention.training.arch.gl.bl.CustomerPurchaseLogic;
import net.tinvention.training.arch.gl.persistence.PurchaseDao;
import net.tinvention.training.arch.gl.persistence.dto.PurchaseDto;

/**
 * 
 * This class offer methods necessary to manage the Purchases
 * 
 * @author Stefano
 *
 */
public class CustomerPurchaseLogicImpl implements CustomerPurchaseLogic {
	
	private PurchaseDao purchaseDao;	

	@Override
	public Integer getNumofPurchasesByCustomerId(Long customerId) {
		// TODO here the code to count the Purchases, for example using a db query
		List<PurchaseDto> purchases = purchaseDao.selectPurchases(customerId);
		Integer result = purchases.size();
		
		return null;
	}


	public void setPurchaseDao(PurchaseDao purchaseDao) {
		this.purchaseDao = purchaseDao;
	}


}

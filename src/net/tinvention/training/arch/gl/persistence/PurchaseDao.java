package net.tinvention.training.arch.gl.persistence;

import java.util.List;

import net.tinvention.training.arch.gl.persistence.dto.PurchaseDto;

/**
 * 
 * This interface offers methods to save, retrieve, update , ... Purchases
 * 
 * @author Stefano
 *
 */
public interface PurchaseDao {

	public List<PurchaseDto> selectPurchases(Long customerId);

}

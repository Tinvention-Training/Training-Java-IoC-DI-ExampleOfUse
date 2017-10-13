package net.tinvention.training.arch.gl.bl;

import net.tinvention.training.arch.gl.dto.CustomerInfoDto;

/**
 * 
 * This interface offers methods necessary to manage the registry
 * 
 * @author Stefano
 *
 */
public interface CustomerRegistryLogic {

	public CustomerInfoDto retriveCustomerInfo(Long customerId) throws Exception;

}

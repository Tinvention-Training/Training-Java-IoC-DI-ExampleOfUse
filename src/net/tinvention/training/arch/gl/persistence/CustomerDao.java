package net.tinvention.training.arch.gl.persistence;

import net.tinvention.training.arch.gl.persistence.dto.CustomerDto;

/**
 * 
 * This interface offers methods to save, retrieve, update , ... Customer data
 * 
 * @author Stefano
 *
 */
public interface CustomerDao {

	public CustomerDto selectBytId(Long customerId) throws Exception;
}

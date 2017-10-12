package net.tinvention.training.arch.gl.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import net.tinvention.training.arch.gl.persistence.dto.CustomerDto;

/**
 * 
 * This class offer methods to save, retrieve, update , ... Customer data
 * 
 * @author Stefano
 *
 */
public class CustomerDao {
	
	private DataSource dataSource;	

	//Dependency Injection by constructor 
	public CustomerDao(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public CustomerDao() {
		super();
	}

	public CustomerDto selectBytId(Long customerId) throws SQLException {
		
		try( Connection con = dataSource.getConnection();) {
			//TODO here the code to prepare and execute db query 
		}
		
		return null;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}

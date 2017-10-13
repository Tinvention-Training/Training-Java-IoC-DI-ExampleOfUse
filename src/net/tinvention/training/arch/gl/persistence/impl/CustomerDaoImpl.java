package net.tinvention.training.arch.gl.persistence.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import net.tinvention.training.arch.gl.persistence.CustomerDao;
import net.tinvention.training.arch.gl.persistence.dto.CustomerDto;

/**
 * 
 * This class offers methods to save, retrieve, update , ... Customer data
 * 
 * @author Stefano
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	
	private DataSource dataSource;	

	//Dependency Injection by constructor 
	public CustomerDaoImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public CustomerDaoImpl() {
		super();
	}

	@Override
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

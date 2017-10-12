package net.tinvention.training.arch.gl.dto;

import java.io.Serializable;

/**
 * 
 * This JavaBean class, create a data structure to transport Customer properties,
 * between layers
 * 
 * @author Stefano
 *
 */
@SuppressWarnings("serial")
public class CustomerInfoDto implements Serializable {
	
	private String address;
	private String code;
	private String name;
	private Long id;	
	
	private Long numOfPurchases;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumOfPurchases() {
		return numOfPurchases;
	}
	public void setNumOfPurchases(Long numOfPurchases) {
		this.numOfPurchases = numOfPurchases;
	}

	

}

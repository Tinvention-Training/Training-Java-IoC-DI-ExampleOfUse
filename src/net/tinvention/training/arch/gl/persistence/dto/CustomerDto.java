package net.tinvention.training.arch.gl.persistence.dto;

import java.io.Serializable;

/**
 * 
 * This JavaBean class, create a data structure to transport Customer properties,
 * between persistence and logic layers
 * 
 * @author Stefano
 *
 */
@SuppressWarnings("serial")
public class CustomerDto implements Serializable {
	
	private String code;
	private String name;
	private Long id;	
	
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
	
	

}

package net.tinvention.training.arch.gl.persistence.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * This JavaBean class, create a data structure to transport Purchase properties,
 * between persistence and logic layers
 * 
 * @author Stefano
 *
 */
@SuppressWarnings("serial")
public class PurchaseDto implements Serializable {
	
	private Long id;
	private BigDecimal amount;
	private Date when;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getWhen() {
		return when;
	}
	public void setWhen(Date when) {
		this.when = when;
	}
	
	
	

}

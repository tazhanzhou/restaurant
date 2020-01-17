package com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrder")
	private int idOrder;
	

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name = "idCustomer", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE) the difference between OnDelete and CascadeType????
	@ManyToOne
	@JoinColumn(name = "customers_idCustomer", nullable=false)
	private CustomerEntity customerEntity;

	public OrderEntity() {
	}

	public OrderEntity(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

}

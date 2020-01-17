package com.finalproject.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCustomer")
	private int idCustomer;

	@Column(name = "nameCustomer")
	private String nameCustomer;

	@OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
	private Set<OrderEntity> orderEntity;

	public CustomerEntity() {

	}

	public CustomerEntity(int idCustomer, String nameCustomer) {

		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public Set<OrderEntity> getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(Set<OrderEntity> orderEntity) {
		this.orderEntity = orderEntity;
	}

}

package com.grizzlystore.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inventory")
public class Inventory {
	private String productName;
	private String id;
	private String stock;
	private String req;
	private String buffer;
	private String price;
	private String pending;
	private String rating;
	
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	public String getReq() {
		return req;
	}
	public void setReq(String req) {
		this.req = req;
	}
	
	public String getBuffer() {
		return buffer;
	}
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}
	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public Inventory() {
		super();
	}
	
	@Override
	public String toString() {
		return "Inventory [ProductName=" + productName + ", id=" + id + ", stock=" + stock + ", req=" + req
				+ ", buffer=" + buffer + ", price=" + price + ", pending=" + pending + ", rating=" + rating + "]";
	}
	
	
	
}

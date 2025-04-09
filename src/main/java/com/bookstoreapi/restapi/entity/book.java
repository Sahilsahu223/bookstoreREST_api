package com.bookstoreapi.restapi.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	@Column(name = "book_name")
	private String name;
	@Column(name="price")
	private float price;
	@Column(name="category")
	private String branch;
	
	public book() {
		// TODO Auto-generated constructor stub
	}
	public book(int book_id, String name, float price, String branch) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.price = price;
		this.branch = branch;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "book [book_id=" + book_id + ", name=" + name + ", price=" + price + ", branch=" + branch + "]";
	}

	

}

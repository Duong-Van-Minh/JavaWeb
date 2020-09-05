package net.code.oas;
// Generated Aug 26, 2020 10:11:09 PM by Hibernate Tools 5.4.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private Integer id;
	private String name;
	private String nameVn;
	private Set products = new HashSet(0);
	private Set products_1 = new HashSet(0);

	public Category() {
	}

	public Category(String name, String nameVn) {
		this.name = name;
		this.nameVn = nameVn;
	}

	public Category(String name, String nameVn, Set products, Set products_1) {
		this.name = name;
		this.nameVn = nameVn;
		this.products = products;
		this.products_1 = products_1;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameVn() {
		return this.nameVn;
	}

	public void setNameVn(String nameVn) {
		this.nameVn = nameVn;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

	public Set getProducts_1() {
		return this.products_1;
	}

	public void setProducts_1(Set products_1) {
		this.products_1 = products_1;
	}

}

package net.code.oas;
// Generated Aug 26, 2020 10:11:09 PM by Hibernate Tools 5.4.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer id;
	private String fullname;
	private String password;
	private String email;
	private String photo;
	private boolean activated;
	private boolean admin;
	private Set orders = new HashSet(0);

	public Customer() {
	}

	public Customer(String fullname, String password, String email, String photo, boolean activated, boolean admin) {
		this.fullname = fullname;
		this.password = password;
		this.email = email;
		this.photo = photo;
		this.activated = activated;
		this.admin = admin;
	}

	public Customer(String fullname, String password, String email, String photo, boolean activated, boolean admin,
			Set orders) {
		this.fullname = fullname;
		this.password = password;
		this.email = email;
		this.photo = photo;
		this.activated = activated;
		this.admin = admin;
		this.orders = orders;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isActivated() {
		return this.activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public boolean isAdmin() {
		return this.admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}

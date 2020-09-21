package net.codejava.model1;
// Generated Aug 26, 2020 10:02:08 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "mysales")
public class Customer implements java.io.Serializable {

	private Integer id;
	private String name;
	private String email;
	private String address;

	public Customer() {
	}

	public Customer(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address", nullable = false, length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
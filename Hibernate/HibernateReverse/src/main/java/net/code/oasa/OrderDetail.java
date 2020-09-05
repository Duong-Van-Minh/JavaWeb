package net.code.oasa;
// Generated Aug 26, 2020 10:14:19 PM by Hibernate Tools 5.4.12.Final

/**
 * OrderDetail generated by hbm2java
 */
public class OrderDetail implements java.io.Serializable {

	private OrderDetailId id;
	private Order order;
	private Product product;

	public OrderDetail() {
	}

	public OrderDetail(OrderDetailId id, Order order, Product product) {
		this.id = id;
		this.order = order;
		this.product = product;
	}

	public OrderDetailId getId() {
		return this.id;
	}

	public void setId(OrderDetailId id) {
		this.id = id;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}

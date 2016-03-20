package emag;

import java.util.List;

import exceptions.EmagException;

public class Client extends User {
	
	private int clientId;
	private Cart myCart;
	private List<Order> orderHistory;

	public Client(int id, String name, String email, String password) {
		super(name, email, password);
		this.myCart = new Cart(this);
		this.setClientId(id);
	}
	
	public void addToCart(Product pr) throws EmagException {
		this.myCart.addProduct(pr);
	}
	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public void removeFromCart(Product pr) throws EmagException {
		this.myCart.removeProduct(pr);
	}
	
	public void buy() {
		this.orderHistory.add(this.myCart.submitOrder());
	}

}

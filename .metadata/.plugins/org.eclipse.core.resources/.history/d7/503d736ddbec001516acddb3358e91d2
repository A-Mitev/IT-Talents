package emag;

import java.util.HashMap;
import java.util.Map;

import exceptions.EmagException;

public class Cart {
	private Map<Product, Integer> productsInCart;
	private Client client;
	
	public Cart(Client client) {
		this.client = client;
		productsInCart = new HashMap<Product, Integer>();
	}
	
	public void addProduct(Product pr) throws EmagException {
		try {
			if (!productsInCart.containsKey(pr)) {
				productsInCart.put(pr, 1);
			}
			else {
				int newQuantity = productsInCart.get(pr)+1;
				productsInCart.put(pr, newQuantity);
			}
		}
		catch (NullPointerException npe){
			throw new EmagException("Cannot add this product to cart right now. Please try again later", npe);
		}
	}
	
	public void removeProduct(Product pr) throws EmagException {
		if (productsInCart.containsKey(pr)) {
			int newQuantity = productsInCart.get(pr)-1;
			productsInCart.put(pr, newQuantity);
		}
		else {
			throw new EmagException("This product is not in the cart!");
		}
	}
	
	public Order submitOrder() {
		Map<Product, Integer> currentOrder = new HashMap<Product, Integer>();
		currentOrder.putAll(productsInCart);
		productsInCart.clear();
		return new Order(0, currentOrder, this.client);
	}
	
}

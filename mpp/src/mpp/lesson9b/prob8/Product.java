package mpp.lesson9b.prob8;

import java.util.Optional;
 
public class Product {
	private String productId;
	private String productName;
	private double unitPrice;
	public Product(String prodId, String prodName, double price) {
		this.productId = prodId;
		this.productName = prodName;
		this.unitPrice = price;
	}
	public String getProductId() {
		return productId;
	}
	public Optional<String> getProductName() {
		return  this.productName == null ? Optional.empty() : Optional.of( productName);
		
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice + "]\n";
	}
	
	
}

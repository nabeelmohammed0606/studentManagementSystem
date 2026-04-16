class Product {
private String productID;
private String name;
private double price;
private int stockQuantity;
public Product(String productID, String name, double price, int stockQuantity) {
this.productID = productID;
this.name = name;
this.price = price;
this.stockQuantity = stockQuantity;
}
public void addStock(int quantity) {
this.stockQuantity += quantity;
}
public void purchase(int quantity) {
if (quantity <= stockQuantity) {
stockQuantity -= quantity;
System.out.println(quantity + " items purchased.");
} else {
System.out.println("Insufficient stock!");
}
}
public void displayProduct() {
System.out.println("Product: " + name + " | Price: " + price + " | Stock: " +
stockQuantity);
}
}
// Test Code for Product
class ProductTest {
public static void main(String[] args) {
Product product1 = new Product("P101", "Laptop", 1200.50, 10);
product1.displayProduct();
product1.purchase(2);
product1.displayProduct();
}
}
class Product {
 	private static double discount = 10.0; // Static variable
 	private final int productID; // Final variable
 	private String productName;
 	private double price;
 	private int quantity;

 	public Product(int productID, String productName, double price, int quantity) {
     	this.productID = productID;
     	this.productName = productName;
     	this.price = price;
     	this.quantity = quantity;
 	}
    //method to display
 	public void displayProductDetails() {
     	if (this instanceof Product) { // Using instanceof
         	System.out.println("Product ID: " + productID);
         	System.out.println("Name: " + productName);
         	System.out.println("Price: $" + price);
         	System.out.println("Quantity: " + quantity);
         	System.out.println("Discount: " + discount + "%");
     	}
 	}
        //static method
 	public static void updateDiscount(double newDiscount) {
     	discount = newDiscount;
 	}
 }

 // Main class
 public class Shopping {
 	public static void main(String[] args) {
     	Product prod1 = new Product(101, "Laptop", 1200, 2);
     	Product prod2 = new Product(102, "Smartphone", 800, 5);
     	prod1.displayProductDetails();
     	prod2.displayProductDetails();
     	Product.updateDiscount(15);
		System.out.println("New Discount Updated!");
		prod1.displayProductDetails();
		prod2.displayProductDetails();
 	}
 }
 /*Product ID: 101
Name: Laptop
Price: $1200.0
Quantity: 2
Discount: 10.0%
Product ID: 102
Name: Smartphone
Price: $800.0
Quantity: 5
Discount: 10.0%
New Discount Updated!
Product ID: 101
Name: Laptop
Price: $1200.0
Quantity: 2
Discount: 15.0%
Product ID: 102
Name: Smartphone
Price: $800.0
Quantity: 5
Discount: 15.0%
 */
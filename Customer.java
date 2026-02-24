package Ecommerce;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

class Customer {
    String customerName;

    Customer(String n) {
        customerName = n;
    }
}

class Order {
    Product product;
    int quantity;

    Order(Product p, int q) {
        product = p;
        quantity = q;
    }

    double calculateTotal() {
        return product.price * quantity;
    }

    void displayOrder() {
        System.out.println("Product: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 50000);
        Customer c = new Customer("Prachi");
        Order o = new Order(p, 2);

        System.out.println("Customer: " + c.customerName);
        o.displayOrder();
    }
}
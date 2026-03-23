
class product {
    int id, quantity;
    String name;
    double price;

    product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    double getTotalPrice() {
        return price * quantity;
    }

}

class Cart {
    public static void main(String[] args) {
        System.out.println("BILL DETAILS:");

        product p1 = new product(1, "pen", 12.0, 3);
        product p2 = new product(2, "chart", 20.5, 2);
        product p3 = new product(3, "keychain", 54.0, 1);

        product[] cart = { p1, p2, p3 };
        double totalBill = 0.0;

        for (product p : cart) {
            p.getDetails();
            System.out.println("Total Price: " + p.getTotalPrice());
            totalBill += p.getTotalPrice();
            System.out.println();
        }
        System.out.println("Total Bill: " + totalBill);
    }
}

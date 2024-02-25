public class Order extends Product {
    private String customer;
    private String shippingAddress;
    private Product[] products;
    private boolean paymentStatus;
    private int len;

    public Order(String name, double price, int quantity) {
        super(name, price, quantity);
        products = new Product[10]; // Initialize the products array
        len = 0; // Initialize len to 0
    }


    public void addProduct(Product product) {
        if (len < products.length) {
            products[len] = product;
            len++;
        } else {
            System.out.println("Замовлення вже має максимальну кількість товарів.");
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
            }
        }
    }


    public void changePaymentStatus(boolean status) {
        this.paymentStatus = status;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product products : products) {
            if (products != null) {
                total += products.getPrice() * products.getQuantity();
            }
        }
        return total;
    }
}
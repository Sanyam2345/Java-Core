package OOPS;

class Products {
    private int itemNo;
    private String Name;
    private double price;
    private int quantity;
    public Products(int itemNo, String Name, double price, int quantity) {
        this.itemNo = itemNo;
        this.Name = Name;
        this.price = price;
        this.quantity = quantity;
    }
    public Products() {
        itemNo = 0;
        Name = "";
        price = 0;
        quantity = 0;
    }
    public int getItemNo() {
        return itemNo;
    }
    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Customers {
    private int customerId;
    private String name;
    private String address;
    private String phone;
    public Customers(int customerId, String name, String address, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public Customers() {
        customerId = 0;
        name = "";
        address = "";
        phone = "";
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}


public class ProductAndCustomers {
    public static void main(String[] args) {
        Products prod =  new Products(56,"T-Shirt",100.00,4);
        System.out.println("Product Details: ");
        System.out.println("Item No: " + prod.getItemNo());
        System.out.println("Name: " + prod.getName());
        System.out.println("Price: $" + prod.getPrice());
        System.out.println("Quantity: " + prod.getQuantity());
        System.out.println();
        Customers person = new Customers(45,"Sanyam","Shastri Enclave", "9627792563");
        System.out.println("Customer Details: ");
        System.out.println("Customer ID: " + person.getCustomerId());
        System.out.println("Customer Name: " + person.getName());
        System.out.println("Customer Address: " + person.getAddress());
        System.out.println("Customer Phone: +91" + person.getPhone());
    }
}

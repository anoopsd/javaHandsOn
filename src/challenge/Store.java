package challenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}
public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
    storeProducts.add(new ArtObject("Painting", 356.5, "This is a painting done in 1900s by Gokul GP"));
    listProducts();
    System.out.println("ORDER1");
    var order1 = new ArrayList<OrderItem>();
    addItemToOrder(order1,0, 45);
    printOrderItems(order1);
    }

    public static void listProducts() {
        for (ProductForSale product : storeProducts) {
            product.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrderItems(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (OrderItem orderItem : order) {
            orderItem.product().printPricedItem(orderItem.qty());
            salesTotal += orderItem.product().getSalesPrice(orderItem.qty());
        }
        System.out.println("Total sales is $" + salesTotal);
    }
}

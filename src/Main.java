public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.addOrder(new Order("1", "P001", 10));
        manager.addOrder(new Order("2", "P002", 5));
        System.out.println("Orders: " + manager.getOrders().size());
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public List<Order> searchByProductId(String productId) {
        System.out.println("Searching for product: " + productId);
        return orders.stream()
                .filter(order -> order.getProductId().equals(productId))
                .collect(Collectors.toList());
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.logging.Logger;
import java.util.logging.Level;

public class OrderManager {
    private List<Order> orders;
    private static final Logger LOGGER = Logger.getLogger(OrderManager.class.getName());

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
        LOGGER.log(Level.INFO, "Searching orders for productId: {0}", productId);
        return orders.stream()
                .filter(order -> order.getProductId().equals(productId))
                .collect(Collectors.toList());
    }
}
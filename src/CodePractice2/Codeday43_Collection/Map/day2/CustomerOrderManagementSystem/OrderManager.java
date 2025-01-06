package CodePractice2.Codeday43_Collection.Map.day2.CustomerOrderManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    private Map<String, Order> orderMap = new HashMap<>();

    public void addOrder(Order order) {
        // System.out.println(order);
        orderMap.put(order.getOrderId(), order);

    }

    public void getOrder(String orderId) {

        if (orderId.contains(orderId)) {
            System.out.println(orderMap.values());
        }
    }

    public List<Order> listAllOrders() {
        List<Order> list = new ArrayList<>();

        list.addAll(orderMap.values());
        return list;
    }

    public boolean removeOrder(String orderId) {
        return true;
    }

    public List<Order> findOrdersByStatus(String status) {
        List<Order> list = new ArrayList<>();

        list.addAll(orderMap.values());
        if (list.contains(status))
            return list;

        return list;


    }
}

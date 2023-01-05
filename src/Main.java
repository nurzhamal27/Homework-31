import domain.Customer;
import domain.Item;
import domain.Order;
import util.NotImplementedException;
import util.RestaurantOrders;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparingDouble;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        var orders = RestaurantOrders.read("orders_100.json").getOrders();


    }
}



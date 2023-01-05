import util.RestaurantOrders;

public class Main {

    public static void main(String[] args) {

        var orders = RestaurantOrders.read("orders_100.json").getOrders();


    }
}



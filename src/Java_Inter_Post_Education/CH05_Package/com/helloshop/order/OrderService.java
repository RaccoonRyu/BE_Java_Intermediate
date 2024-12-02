package Java_Inter_Post_Education.CH05_Package.com.helloshop.order;

import Java_Inter_Post_Education.CH05_Package.com.helloshop.product.Product;
import Java_Inter_Post_Education.CH05_Package.com.helloshop.user.User;

public class OrderService {
    public void Order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}

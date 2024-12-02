package Java_Inter_Post_Education.CH05_Package.com.helloshop.order;

// 핵심은 import를 통해 다른 패키지의 클래스를 가져다 쓴다는 것
import Java_Inter_Post_Education.CH05_Package.com.helloshop.product.Product;
import Java_Inter_Post_Education.CH05_Package.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}

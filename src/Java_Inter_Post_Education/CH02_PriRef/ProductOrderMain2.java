package Java_Inter_Post_Education.CH02_PriRef;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;

        for (ProductOrder order : orders) {
            printOrder(order);
        }

        int sum = getTotalAmount(orders);
        System.out.println("총 결제 금액 : " + sum);
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }

        return sum;
    }

    static void printOrder(ProductOrder order) {
        System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
}

package Java_Inter_Post_Education.CH01_Class;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        productOrder1.productName = "두부";
        productOrder2.productName = "김치";
        productOrder3.productName = "콜라";

        productOrder1.price = 2000;
        productOrder2.price = 5000;
        productOrder3.price = 1500;

        productOrder1.quantity = 2;
        productOrder2.quantity = 1;
        productOrder3.quantity = 2;

        ProductOrder[] orders = {productOrder1, productOrder2, productOrder3};

        int sum = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            sum += order.price * order.quantity;
        }

        System.out.println("총 결제 금액 : " + sum);
    }
}

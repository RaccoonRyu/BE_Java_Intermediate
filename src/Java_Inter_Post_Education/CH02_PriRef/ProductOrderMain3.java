package Java_Inter_Post_Education.CH02_PriRef;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요. : ");
        int size = sc.nextInt();
        sc.nextLine(); // 입력 버퍼를 비우기 위한 코드
        ProductOrder[] orders = new ProductOrder[size];

        int count = 0;
        while (count < size) {
            System.out.println((count + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String name = sc.nextLine();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

            ProductOrder order = createOrder(name, price, quantity);
            orders[count] = order;

            count++;
        }

        printOrder(orders);

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

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
}

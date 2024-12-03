package Java_Inter_Post_Education.CH06_AccessModifier;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    void addItem(Item item) {
        // 검증 로직
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 수행 로직
        items[itemCount] = item;
        itemCount++;
    }

    void displayItems() {
        System.out.println("장바구니 상품 출력");
        // NPE 주의. itemCount만큼만 loop 수행해야한다.
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
           totalPrice += items[i].getTotalPrice();
        }

        return totalPrice;
    }
}

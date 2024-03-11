package hello.core.order;

public class Order {
    private Long memberId;
    private String itemName;
    private Integer itemPrice;
    private Integer discountPrice;
    private Integer totalPrice;

    public Order(Long memberId, String itemName, Integer itemPrice, Integer discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
        this.totalPrice = itemPrice - discountPrice;
    }
}

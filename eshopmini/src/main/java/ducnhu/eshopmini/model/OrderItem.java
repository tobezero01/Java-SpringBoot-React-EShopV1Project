package ducnhu.eshopmini.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private Integer quantity;
    private double discount;
    private double orderedProductPrice;

    public OrderItem(Long orderItemId, Product product, Order order, Integer quantity, double discount, double orderedProductPrice) {
        this.orderItemId = orderItemId;
        this.product = product;
        this.order = order;
        this.quantity = quantity;
        this.discount = discount;
        this.orderedProductPrice = orderedProductPrice;
    }

    public OrderItem() {
    }

    public Long getOrderItemId() {
        return this.orderItemId;
    }

    public Product getProduct() {
        return this.product;
    }

    public Order getOrder() {
        return this.order;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getOrderedProductPrice() {
        return this.orderedProductPrice;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setOrderedProductPrice(double orderedProductPrice) {
        this.orderedProductPrice = orderedProductPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderItem)) return false;
        final OrderItem other = (OrderItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderItemId = this.getOrderItemId();
        final Object other$orderItemId = other.getOrderItemId();
        if (this$orderItemId == null ? other$orderItemId != null : !this$orderItemId.equals(other$orderItemId))
            return false;
        final Object this$product = this.getProduct();
        final Object other$product = other.getProduct();
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$order = this.getOrder();
        final Object other$order = other.getOrder();
        if (this$order == null ? other$order != null : !this$order.equals(other$order)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
        if (Double.compare(this.getDiscount(), other.getDiscount()) != 0) return false;
        if (Double.compare(this.getOrderedProductPrice(), other.getOrderedProductPrice()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderItemId = this.getOrderItemId();
        result = result * PRIME + ($orderItemId == null ? 43 : $orderItemId.hashCode());
        final Object $product = this.getProduct();
        result = result * PRIME + ($product == null ? 43 : $product.hashCode());
        final Object $order = this.getOrder();
        result = result * PRIME + ($order == null ? 43 : $order.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final long $discount = Double.doubleToLongBits(this.getDiscount());
        result = result * PRIME + (int) ($discount >>> 32 ^ $discount);
        final long $orderedProductPrice = Double.doubleToLongBits(this.getOrderedProductPrice());
        result = result * PRIME + (int) ($orderedProductPrice >>> 32 ^ $orderedProductPrice);
        return result;
    }

    public String toString() {
        return "OrderItem(orderItemId=" + this.getOrderItemId() + ", product=" + this.getProduct() + ", order=" + this.getOrder() + ", quantity=" + this.getQuantity() + ", discount=" + this.getDiscount() + ", orderedProductPrice=" + this.getOrderedProductPrice() + ")";
    }
}
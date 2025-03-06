package ducnhu.eshopmini.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;
    private double discount;
    private double productPrice;

    public CartItem(Long cartItemId, Cart cart, Product product, Integer quantity, double discount, double productPrice) {
        this.cartItemId = cartItemId;
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.productPrice = productPrice;
    }

    public CartItem() {
    }

    public Long getCartItemId() {
        return this.cartItemId;
    }

    public Cart getCart() {
        return this.cart;
    }

    public Product getProduct() {
        return this.product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartItem)) return false;
        final CartItem other = (CartItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cartItemId = this.getCartItemId();
        final Object other$cartItemId = other.getCartItemId();
        if (this$cartItemId == null ? other$cartItemId != null : !this$cartItemId.equals(other$cartItemId))
            return false;
        final Object this$cart = this.getCart();
        final Object other$cart = other.getCart();
        if (this$cart == null ? other$cart != null : !this$cart.equals(other$cart)) return false;
        final Object this$product = this.getProduct();
        final Object other$product = other.getProduct();
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
        if (Double.compare(this.getDiscount(), other.getDiscount()) != 0) return false;
        if (Double.compare(this.getProductPrice(), other.getProductPrice()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cartItemId = this.getCartItemId();
        result = result * PRIME + ($cartItemId == null ? 43 : $cartItemId.hashCode());
        final Object $cart = this.getCart();
        result = result * PRIME + ($cart == null ? 43 : $cart.hashCode());
        final Object $product = this.getProduct();
        result = result * PRIME + ($product == null ? 43 : $product.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final long $discount = Double.doubleToLongBits(this.getDiscount());
        result = result * PRIME + (int) ($discount >>> 32 ^ $discount);
        final long $productPrice = Double.doubleToLongBits(this.getProductPrice());
        result = result * PRIME + (int) ($productPrice >>> 32 ^ $productPrice);
        return result;
    }

    public String toString() {
        return "CartItem(cartItemId=" + this.getCartItemId() + ", cart=" + this.getCart() + ", product=" + this.getProduct() + ", quantity=" + this.getQuantity() + ", discount=" + this.getDiscount() + ", productPrice=" + this.getProductPrice() + ")";
    }
}

package ducnhu.eshopmini.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    private List<CartItem> cartItems = new ArrayList<>();

    private Double totalPrice = 0.0;

    public Cart(Long cartId, User user, List<CartItem> cartItems, Double totalPrice) {
        this.cartId = cartId;
        this.user = user;
        this.cartItems = cartItems;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }

    public Long getCartId() {
        return this.cartId;
    }

    public User getUser() {
        return this.user;
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Cart)) return false;
        final Cart other = (Cart) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cartId = this.getCartId();
        final Object other$cartId = other.getCartId();
        if (this$cartId == null ? other$cartId != null : !this$cartId.equals(other$cartId)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$cartItems = this.getCartItems();
        final Object other$cartItems = other.getCartItems();
        if (this$cartItems == null ? other$cartItems != null : !this$cartItems.equals(other$cartItems)) return false;
        final Object this$totalPrice = this.getTotalPrice();
        final Object other$totalPrice = other.getTotalPrice();
        if (this$totalPrice == null ? other$totalPrice != null : !this$totalPrice.equals(other$totalPrice))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Cart;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cartId = this.getCartId();
        result = result * PRIME + ($cartId == null ? 43 : $cartId.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $cartItems = this.getCartItems();
        result = result * PRIME + ($cartItems == null ? 43 : $cartItems.hashCode());
        final Object $totalPrice = this.getTotalPrice();
        result = result * PRIME + ($totalPrice == null ? 43 : $totalPrice.hashCode());
        return result;
    }

    public String toString() {
        return "Cart(cartId=" + this.getCartId() + ", user=" + this.getUser() + ", cartItems=" + this.getCartItems() + ", totalPrice=" + this.getTotalPrice() + ")";
    }
}

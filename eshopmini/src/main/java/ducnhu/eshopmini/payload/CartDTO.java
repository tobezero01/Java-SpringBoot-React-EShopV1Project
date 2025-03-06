package ducnhu.eshopmini.payload;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {
    private Long cartId;
    private Double totalPrice = 0.0;
    private List<ProductDTO> products = new ArrayList<>();

    public CartDTO(Long cartId, Double totalPrice, List<ProductDTO> products) {
        this.cartId = cartId;
        this.totalPrice = totalPrice;
        this.products = products;
    }

    public CartDTO() {
    }

    public Long getCartId() {
        return this.cartId;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public List<ProductDTO> getProducts() {
        return this.products;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartDTO)) return false;
        final CartDTO other = (CartDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cartId = this.getCartId();
        final Object other$cartId = other.getCartId();
        if (this$cartId == null ? other$cartId != null : !this$cartId.equals(other$cartId)) return false;
        final Object this$totalPrice = this.getTotalPrice();
        final Object other$totalPrice = other.getTotalPrice();
        if (this$totalPrice == null ? other$totalPrice != null : !this$totalPrice.equals(other$totalPrice))
            return false;
        final Object this$products = this.getProducts();
        final Object other$products = other.getProducts();
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cartId = this.getCartId();
        result = result * PRIME + ($cartId == null ? 43 : $cartId.hashCode());
        final Object $totalPrice = this.getTotalPrice();
        result = result * PRIME + ($totalPrice == null ? 43 : $totalPrice.hashCode());
        final Object $products = this.getProducts();
        result = result * PRIME + ($products == null ? 43 : $products.hashCode());
        return result;
    }

    public String toString() {
        return "CartDTO(cartId=" + this.getCartId() + ", totalPrice=" + this.getTotalPrice() + ", products=" + this.getProducts() + ")";
    }
}

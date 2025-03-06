package ducnhu.eshopmini.payload;

public class CartItemDTO {
    private Long productId;
    private Integer quantity;

    public CartItemDTO(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItemDTO() {
    }

    public Long getProductId() {
        return this.productId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartItemDTO)) return false;
        final CartItemDTO other = (CartItemDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartItemDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        return result;
    }

    public String toString() {
        return "CartItemDTO(productId=" + this.getProductId() + ", quantity=" + this.getQuantity() + ")";
    }
}

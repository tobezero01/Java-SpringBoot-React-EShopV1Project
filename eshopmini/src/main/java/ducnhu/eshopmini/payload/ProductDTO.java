package ducnhu.eshopmini.payload;

public class ProductDTO {
    private Long productId;
    private String productName;
    private String image;
    private String description;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;

    public ProductDTO(Long productId, String productName, String image, String description, Integer quantity, double price, double discount, double specialPrice) {
        this.productId = productId;
        this.productName = productName;
        this.image = image;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.specialPrice = specialPrice;
    }

    public ProductDTO() {
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getImage() {
        return this.image;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public double getSpecialPrice() {
        return this.specialPrice;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductDTO)) return false;
        final ProductDTO other = (ProductDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$productName = this.getProductName();
        final Object other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName))
            return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        if (Double.compare(this.getDiscount(), other.getDiscount()) != 0) return false;
        if (Double.compare(this.getSpecialPrice(), other.getSpecialPrice()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $productName = this.getProductName();
        result = result * PRIME + ($productName == null ? 43 : $productName.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        final long $discount = Double.doubleToLongBits(this.getDiscount());
        result = result * PRIME + (int) ($discount >>> 32 ^ $discount);
        final long $specialPrice = Double.doubleToLongBits(this.getSpecialPrice());
        result = result * PRIME + (int) ($specialPrice >>> 32 ^ $specialPrice);
        return result;
    }

    public String toString() {
        return "ProductDTO(productId=" + this.getProductId() + ", productName=" + this.getProductName() + ", image=" + this.getImage() + ", description=" + this.getDescription() + ", quantity=" + this.getQuantity() + ", price=" + this.getPrice() + ", discount=" + this.getDiscount() + ", specialPrice=" + this.getSpecialPrice() + ")";
    }
}

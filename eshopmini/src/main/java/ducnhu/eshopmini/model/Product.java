package ducnhu.eshopmini.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @NotBlank
    @Size(min = 3, message = "Product name must contain atleast 3 characters")
    private String productName;
    private String image;

    @NotBlank
    @Size(min = 6, message = "Product description must contain atleast 6 characters")
    private String description;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<CartItem> products = new ArrayList<>();

    public Product(Long productId, @NotBlank @Size(min = 3, message = "Product name must contain atleast 3 characters") String productName, String image, @NotBlank @Size(min = 6, message = "Product description must contain atleast 6 characters") String description, Integer quantity, double price, double discount, double specialPrice, Category category, User user, List<CartItem> products) {
        this.productId = productId;
        this.productName = productName;
        this.image = image;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.specialPrice = specialPrice;
        this.category = category;
        this.user = user;
        this.products = products;
    }

    public Product() {
    }

    public Long getProductId() {
        return this.productId;
    }

    public @NotBlank @Size(min = 3, message = "Product name must contain atleast 3 characters") String getProductName() {
        return this.productName;
    }

    public String getImage() {
        return this.image;
    }

    public @NotBlank @Size(min = 6, message = "Product description must contain atleast 6 characters") String getDescription() {
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

    public Category getCategory() {
        return this.category;
    }

    public User getUser() {
        return this.user;
    }

    public List<CartItem> getProducts() {
        return this.products;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(@NotBlank @Size(min = 3, message = "Product name must contain atleast 3 characters") String productName) {
        this.productName = productName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(@NotBlank @Size(min = 6, message = "Product description must contain atleast 6 characters") String description) {
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

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProducts(List<CartItem> products) {
        this.products = products;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;
        final Product other = (Product) o;
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
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        if (this$category == null ? other$category != null : !this$category.equals(other$category)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$products = this.getProducts();
        final Object other$products = other.getProducts();
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
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
        final Object $category = this.getCategory();
        result = result * PRIME + ($category == null ? 43 : $category.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $products = this.getProducts();
        result = result * PRIME + ($products == null ? 43 : $products.hashCode());
        return result;
    }

    public String toString() {
        return "Product(productId=" + this.getProductId() + ", productName=" + this.getProductName() + ", image=" + this.getImage() + ", description=" + this.getDescription() + ", quantity=" + this.getQuantity() + ", price=" + this.getPrice() + ", discount=" + this.getDiscount() + ", specialPrice=" + this.getSpecialPrice() + ", category=" + this.getCategory() + ", user=" + this.getUser() + ", products=" + this.getProducts() + ")";
    }
}

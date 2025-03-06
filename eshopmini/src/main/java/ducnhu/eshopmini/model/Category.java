package ducnhu.eshopmini.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @NotBlank
    @Size(min = 5, message = "Category name must contain atleast 5 characters")
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

    public Category(Long categoryId, @NotBlank @Size(min = 5, message = "Category name must contain atleast 5 characters") String categoryName, List<Product> products) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.products = products;
    }

    public Category() {
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public @NotBlank @Size(min = 5, message = "Category name must contain atleast 5 characters") String getCategoryName() {
        return this.categoryName;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(@NotBlank @Size(min = 5, message = "Category name must contain atleast 5 characters") String categoryName) {
        this.categoryName = categoryName;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Category)) return false;
        final Category other = (Category) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (this$categoryId == null ? other$categoryId != null : !this$categoryId.equals(other$categoryId))
            return false;
        final Object this$categoryName = this.getCategoryName();
        final Object other$categoryName = other.getCategoryName();
        if (this$categoryName == null ? other$categoryName != null : !this$categoryName.equals(other$categoryName))
            return false;
        final Object this$products = this.getProducts();
        final Object other$products = other.getProducts();
        if (this$products == null ? other$products != null : !this$products.equals(other$products)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Category;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $categoryName = this.getCategoryName();
        result = result * PRIME + ($categoryName == null ? 43 : $categoryName.hashCode());
        final Object $products = this.getProducts();
        result = result * PRIME + ($products == null ? 43 : $products.hashCode());
        return result;
    }

    public String toString() {
        return "Category(categoryId=" + this.getCategoryId() + ", categoryName=" + this.getCategoryName() + ", products=" + this.getProducts() + ")";
    }
}

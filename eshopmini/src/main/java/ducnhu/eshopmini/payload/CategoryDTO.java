package ducnhu.eshopmini.payload;

public class CategoryDTO {
    private Long categoryId;
    private String categoryName;

    public CategoryDTO(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public CategoryDTO() {
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryDTO)) return false;
        final CategoryDTO other = (CategoryDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        if (this$categoryId == null ? other$categoryId != null : !this$categoryId.equals(other$categoryId))
            return false;
        final Object this$categoryName = this.getCategoryName();
        final Object other$categoryName = other.getCategoryName();
        if (this$categoryName == null ? other$categoryName != null : !this$categoryName.equals(other$categoryName))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CategoryDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $categoryId = this.getCategoryId();
        result = result * PRIME + ($categoryId == null ? 43 : $categoryId.hashCode());
        final Object $categoryName = this.getCategoryName();
        result = result * PRIME + ($categoryName == null ? 43 : $categoryName.hashCode());
        return result;
    }

    public String toString() {
        return "CategoryDTO(categoryId=" + this.getCategoryId() + ", categoryName=" + this.getCategoryName() + ")";
    }
}

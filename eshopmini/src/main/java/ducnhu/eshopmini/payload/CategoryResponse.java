package ducnhu.eshopmini.payload;

import java.util.List;

public class CategoryResponse {
    private List<CategoryDTO> content;
    private Integer pageNumber;
    private Integer pageSize;
    private Long totalElements;
    private Integer totalPages;
    private boolean lastPage;

    public CategoryResponse(List<CategoryDTO> content, Integer pageNumber, Integer pageSize, Long totalElements, Integer totalPages, boolean lastPage) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.lastPage = lastPage;
    }

    public CategoryResponse() {
    }

    public List<CategoryDTO> getContent() {
        return this.content;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Long getTotalElements() {
        return this.totalElements;
    }

    public Integer getTotalPages() {
        return this.totalPages;
    }

    public boolean isLastPage() {
        return this.lastPage;
    }

    public void setContent(List<CategoryDTO> content) {
        this.content = content;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryResponse)) return false;
        final CategoryResponse other = (CategoryResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$pageNumber = this.getPageNumber();
        final Object other$pageNumber = other.getPageNumber();
        if (this$pageNumber == null ? other$pageNumber != null : !this$pageNumber.equals(other$pageNumber))
            return false;
        final Object this$pageSize = this.getPageSize();
        final Object other$pageSize = other.getPageSize();
        if (this$pageSize == null ? other$pageSize != null : !this$pageSize.equals(other$pageSize)) return false;
        final Object this$totalElements = this.getTotalElements();
        final Object other$totalElements = other.getTotalElements();
        if (this$totalElements == null ? other$totalElements != null : !this$totalElements.equals(other$totalElements))
            return false;
        final Object this$totalPages = this.getTotalPages();
        final Object other$totalPages = other.getTotalPages();
        if (this$totalPages == null ? other$totalPages != null : !this$totalPages.equals(other$totalPages))
            return false;
        if (this.isLastPage() != other.isLastPage()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CategoryResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $pageNumber = this.getPageNumber();
        result = result * PRIME + ($pageNumber == null ? 43 : $pageNumber.hashCode());
        final Object $pageSize = this.getPageSize();
        result = result * PRIME + ($pageSize == null ? 43 : $pageSize.hashCode());
        final Object $totalElements = this.getTotalElements();
        result = result * PRIME + ($totalElements == null ? 43 : $totalElements.hashCode());
        final Object $totalPages = this.getTotalPages();
        result = result * PRIME + ($totalPages == null ? 43 : $totalPages.hashCode());
        result = result * PRIME + (this.isLastPage() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "CategoryResponse(content=" + this.getContent() + ", pageNumber=" + this.getPageNumber() + ", pageSize=" + this.getPageSize() + ", totalElements=" + this.getTotalElements() + ", totalPages=" + this.getTotalPages() + ", lastPage=" + this.isLastPage() + ")";
    }
}

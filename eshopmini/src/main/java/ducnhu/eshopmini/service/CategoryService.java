package ducnhu.eshopmini.service;

import ducnhu.eshopmini.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}

package ducnhu.eshopmini.controller;

import ducnhu.eshopmini.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private List<Category> categories = new ArrayList<>();

    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories() {
        return categories;
    }
    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody Category category) {
        categories.add(category);
        return "Categories added successfully";
    }
}

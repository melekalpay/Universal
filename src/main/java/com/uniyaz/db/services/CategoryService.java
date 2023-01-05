package com.uniyaz.db.services;

import com.uniyaz.db.entity.Category;
import com.uniyaz.db.entity.Category;
import com.uniyaz.db.operations.DbOperationsCategory;

import java.util.List;

public class CategoryService {
    private DbOperationsCategory dbOperationsCategory = new DbOperationsCategory();

    public List<Category> findAllCategory() {
        return dbOperationsCategory.findAllCategory();
    }

    public List<Category> findAllCategoryName(String name) {
        return dbOperationsCategory.findAllCategoryName(name);
    }

    public int saveCategory(Category category) {
        return dbOperationsCategory.saveCategory(category);
    }

    public int updateCategory(Category category) {
        return dbOperationsCategory.updateCategory(category);
    }
    public int deleteCategory(Category category) {
        return dbOperationsCategory.deleteCategory(category);
    }

}

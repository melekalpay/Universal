package com.uniyaz.db.tests;

import com.uniyaz.db.entity.Category;
import com.uniyaz.db.operations.DbOperationsCategory;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DbCategoryTest {
    public static void main(String[] args) {
        Category category = new Category();
        Scanner scanner = new Scanner(System.in);

        DbOperationsCategory dbOperationsCategory = new DbOperationsCategory();
       /* category.setName("Melek");
        category.setLastUpdate(new Date());
        dbOperationsCategory.saveActor(category);
        List<Category> categories = dbOperationsCategory.findAllCategory();
        for (Category category1 : categories) {
            System.out.println(category1);
        }*/

      System.out.print("Değiştirmek İstediğiniz Id = ");
        int id=scanner.nextInt();
        System.out.println();
        System.out.print("Yeni İsim = ");
        String yeniIsim = scanner.next();
        category.setName(yeniIsim);
        Date date= new Date();
        category.setLastUpdate(date);
        category.setId(id);
        dbOperationsCategory.updateCategory(category);

        List<Category> categories = dbOperationsCategory.findAllCategory();
        for (Category category1 : categories) {
            System.out.println(category1);
        }
    }
}

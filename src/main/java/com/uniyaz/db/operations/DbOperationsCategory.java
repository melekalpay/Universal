package com.uniyaz.db.operations;

import com.uniyaz.db.entity.Category;
import com.uniyaz.db.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbOperationsCategory {
    private final String url = "jdbc:mysql://localhost:3306/sakila";
    private final String user = "root";
    private final String password = "1234";

    public DbOperationsCategory() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Category> findAllCategory() {

        List<Category> categories = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
        ) {

            ResultSet resultSet = statement.executeQuery("Select * from category");
            while (resultSet.next()) {
                int id = resultSet.getInt("category_id");
                String name = resultSet.getString("name");
                Date last_update = resultSet.getDate("last_update");

                Category category = new Category();
                category.setId(id);
                category.setName(name);
                category.setLastUpdate(last_update);
                categories.add(category);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categories;
    }

    public List<Category> findAllCategoryName(String name) {

        List<Category> categories = new ArrayList<Category>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("Select * from category where name = ?");
        ) {

            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("category_id");
                String name1 = resultSet.getString("name");
                Date last_update = resultSet.getDate("last_update");

                Category category = new Category();
                category.setId(id);
                category.setName(name1);
                category.setLastUpdate(last_update);
                categories.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categories;
    }

    public int saveCategory(Category category) {

        String sql =
                "insert into category " +
                        "       (name,last_update)" +
                        "values (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {

            preparedStatement.setString(1, category.getName());
            java.util.Date lastUpdate = category.getLastUpdate();
            Date sqlDate = new Date(lastUpdate.getTime());
            preparedStatement.setDate(2, sqlDate);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int updateCategory(Category category ) {
        String sql = "update category set  name=? ,last_update=? where category_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setString(1,category.getName());
            java.util.Date lastUpdate = category.getLastUpdate();
            Date sqlDate = new Date(lastUpdate.getTime());
            preparedStatement.setDate(2, sqlDate);
            preparedStatement.setInt(3,category.getId());
            return preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteCategory(Category category ) {
        String sql = "delete from category where category_id=? ";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,category.getId());

            return preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

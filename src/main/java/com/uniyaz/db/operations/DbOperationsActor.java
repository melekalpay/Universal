package com.uniyaz.db.operations;

import com.uniyaz.db.entity.Actor;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class DbOperationsActor {

    private final String url = "jdbc:mysql://localhost:3306/sakila";
    private final String user = "root";
    private final String password = "1234";

    public DbOperationsActor() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Actor> findAllActor() {

        List<Actor> actorList = new ArrayList<Actor>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
        ) {

            ResultSet resultSet = statement.executeQuery("Select * from actor");
            while (resultSet.next()) {
                int id = resultSet.getInt("actor_id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                Date last_update = resultSet.getDate("last_update");

                Actor actor = new Actor();
                actor.setId(id);
                actor.setFirstName(first_name);
                actor.setLastName(last_name);
                actor.setLastUpdate(last_update);
                actorList.add(actor);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return actorList;
    }

    public List<Actor> findAllActorByFirstName(String firstName) {

        List<Actor> actorList = new ArrayList<Actor>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "Select * from actor where first_name = ?");
        ) {

            preparedStatement.setString(1, firstName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("actor_id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                Date last_update = resultSet.getDate("last_update");

                Actor actor = new Actor();
                actor.setId(id);
                actor.setFirstName(first_name);
                actor.setLastName(last_name);
                actor.setLastUpdate(last_update);
                actorList.add(actor);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return actorList;
    }

    public int saveActor(Actor actor) {

        String sql =
                "insert into actor " +
                        "       (first_name, last_name, last_update)" +
                        "values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {

            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());
            java.util.Date lastUpdate = actor.getLastUpdate();
            Date sqlDate = new Date(lastUpdate.getTime());
            preparedStatement.setDate(3, sqlDate);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int updateActor(Actor actor ) {
        String sql = "Update actor Set first_name=? ,last_name=?,last_update=? where actor_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setString(1,actor.getFirstName());
            preparedStatement.setString(2,actor.getLastName() );
            java.util.Date lastUpdate = actor.getLastUpdate();
            Date sqlDate = new Date(lastUpdate.getTime());
            preparedStatement.setDate(3, sqlDate);
            preparedStatement.setInt(4,actor.getId());
            return preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int deleteActor(Actor actor ) {
        String sql = "delete from actor where actor_id=? ";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,actor.getId());

            return preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

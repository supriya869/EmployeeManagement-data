package com.hyp;

//UserDao.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
 public static void insertProduct(int productId, String productName, double productCost, String madeIn, String company) {
     try (Connection connection = DatabaseUtils.createConnection()) {
         String query = "INSERT INTO productscost (product_id, product_name, product_cost, made_in, company) VALUES (?, ?, ?, ?, ?)";

         try (PreparedStatement statement = connection.prepareStatement(query)) {
             statement.setInt(1, productId);
             statement.setString(2, productName);
             statement.setDouble(3, productCost);
             statement.setString(4, madeIn);
             statement.setString(5, company);

             int rowsInserted = statement.executeUpdate();

             if (rowsInserted > 0) {
                 System.out.println("A new product was inserted successfully.");
             } else {
                 System.out.println("Failed to insert the product.");
             }
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }

 public List<Product> getAllProducts() {
     List<Product> productList = new ArrayList<>();
     try (Connection connection = DatabaseUtils.createConnection();
          PreparedStatement statement = connection.prepareStatement("SELECT * FROM productscost");
          ResultSet resultSet = statement.executeQuery()) {

         while (resultSet.next()) {
             int productId = resultSet.getInt("product_id");
             String productName = resultSet.getString("product_name");
             double productCost = resultSet.getDouble("product_cost");
             String madeIn = resultSet.getString("made_in");
             String company = resultSet.getString("company");

             Product product = new Product(productId, productName, productCost, madeIn, company);
             productList.add(product);
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
     return productList;
 }
}

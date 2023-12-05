package com.hyp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
     int productId = Integer.parseInt(request.getParameter("product_id"));
     String productName = request.getParameter("product_name");
     double productCost = Double.parseDouble(request.getParameter("product_cost"));
     String madeIn = request.getParameter("made_in");
     String company = request.getParameter("company");

     UserDao dao = new UserDao();
     UserDao.insertProduct(productId, productName, productCost, madeIn, company);

     // Set inserted product details as a request attribute
     request.setAttribute("insertedProduct", new Product(productId, productName, productCost, madeIn, company));

     // Retrieve all submitted data from the database and set as a request attribute
     request.setAttribute("allProducts", dao.getAllProducts());
     request.setAttribute("successMessage", "Product data inserted successfully!");

     // Forward to a success page
     request.getRequestDispatcher("success.jsp").forward(request, response);
     request.getRequestDispatcher("AllTableDetails.jsp").forward(request, response);
     
 }
}

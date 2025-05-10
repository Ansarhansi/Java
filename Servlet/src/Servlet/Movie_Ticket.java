package Servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/action")
public class Movie_Ticket extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String movie = request.getParameter("movie");
        String location = request.getParameter("location");
        String price = request.getParameter("price");
        String tickets = request.getParameter("tickets");

        int s_price = 0, T_ticket = 0, total = 0;
        try {
            s_price = Integer.parseInt(price);
            T_ticket = Integer.parseInt(tickets);
            total = s_price * T_ticket;
        } catch (NumberFormatException e) {
            // handle error if needed
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Booking Confirmation</title>");
        out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css'></head>");
        out.println("<body class='bg-light p-5'>");

        out.println("<div class='container text-center bg-white p-4 rounded shadow'>");
        out.println("<h2 class='text-success'>Thank You for Booking!</h2>");
        out.println("<hr>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Phone Number:</strong> " + phone + "</p>");
        out.println("<p><strong>Movie Name:</strong> " + movie + "</p>");
        out.println("<p><strong>Location:</strong> " + location + "</p>");
        out.println("<p><strong>Number of Tickets:</strong> " + T_ticket + "</p>");
        out.println("<p><strong>Total Price:</strong> ₹" + total + "</p>");
        out.println("</div>");

        out.println("</body></html>");
    }
}

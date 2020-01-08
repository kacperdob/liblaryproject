package pl.sda.servlets;

import model.Author;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/pl.sda.servlets.RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final String AUTHOR = "author";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(10);
        session.setAttribute(AUTHOR, getAuthorFromParams(request));
        request.getRequestDispatcher("/addButton.jsp").include(request, response);
    }

    private Author getAuthorFromParams(HttpServletRequest request) {
        Author author = new Author();
        author.setFirstName(request.getParameter("username"));
        author.setLastName(request.getParameter("lastName"));

        return author;
    }
}
package pl.sda.servlets;

import model.Book;
import pl.sda.servises.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    BookService bookService = new BookService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Action action = Action.valueOf(request.getParameter("action"));
        Long bookId = Long.valueOf(request.getParameter("bookId"));

        switch (action){
            case ADD:
                response.sendRedirect("/addButton.jsp");
                break;
            case EDIT:
                response.sendRedirect("/editButton");
                break;
            case SHOW:
                response.sendRedirect("/showButton");
                break;
//            case DELETE:
//                bookService.delete(bookId);
//                response.sendRedirect("/deleteButton");
//                break;
                default:
                    throw new UnsupportedOperationException("no action");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = bookService.findAll();
        request.setAttribute("books", books);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

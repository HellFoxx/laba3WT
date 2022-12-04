package hellfoxx.server.DataAccessLayer.BookDao;

import java.util.ArrayList;
import hellfoxx.models.Book;

public interface IBookDao {
	
	Boolean delete(Book book);
    Boolean save(Book book);
    ArrayList<Book> getBooks();
    ArrayList<Book> getBooksByTitle(String title);
    ArrayList<Book> getBooksByAuthor(String author);
}

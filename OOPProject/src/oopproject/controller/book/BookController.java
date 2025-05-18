 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.controller.book;

import java.sql.SQLException;
import oopproject.controller.Controller;
import oopproject.model.Book;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class BookController extends Controller{
    public BookController() throws SQLException {
        super(new Book());
    }
}

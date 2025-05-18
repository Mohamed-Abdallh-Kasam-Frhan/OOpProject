 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.controller.student;

import java.sql.SQLException;
import oopproject.controller.Controller;
import oopproject.model.Student;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class StudentController extends Controller{

    public StudentController() throws SQLException {
        super(new Student());
    }

}

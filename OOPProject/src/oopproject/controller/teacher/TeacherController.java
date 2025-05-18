 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.controller.teacher;

import java.sql.SQLException;
import oopproject.controller.Controller;
import oopproject.model.Teacher;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class TeacherController extends Controller{

    public TeacherController() throws SQLException {
        super(new Teacher());
    }

}

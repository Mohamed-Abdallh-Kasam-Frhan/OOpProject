 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.controller.parent;

import java.sql.SQLException;
import oopproject.controller.Controller;
import oopproject.model.Parent;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class ParentController extends Controller {

    public ParentController() throws SQLException {
        super(new Parent());
    }

}

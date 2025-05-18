 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.controller.circle;

import java.sql.SQLException;
import oopproject.controller.Controller;
import oopproject.model.Circle;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class CircleController extends Controller{

    public CircleController() throws SQLException {
        super(new Circle());
    }

}

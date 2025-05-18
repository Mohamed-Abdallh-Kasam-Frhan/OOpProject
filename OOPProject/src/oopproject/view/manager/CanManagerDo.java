/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.manager;

import oopproject.model.Model;

/**
 *
 * @author PC
 */
public interface CanManagerDo extends CanManageStudent, CanManageTeacher, CanManageCircle, CanManageParent{ 
    /**
     * reset actor password when actor has forget it
     * @param model type of actor
     * @param id is id of actor to reset
     * @param newPassword new password to login 
     */
    void resetPassword(Model model, int id, String newPassword) throws Exception;
}


/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.manager;

import java.util.LinkedHashMap;
import oopproject.view.teacher.CanTeacherDo;

/**
 *
 * @author PC
 */

public interface CanManageTeacher extends CanTeacherDo{
    void addTeacher(LinkedHashMap<String, String> teacherData);
    void updateTeacher(LinkedHashMap<String, String> teacherData, int id);
    void deleteTeacher(int id);
    
    void setTeacherPresent(int id, boolean present);
}

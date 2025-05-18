/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.manager;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import oopproject.view.student.CanStudentDo;

/**
 *
 * @author PC
 */
public interface CanManageStudent extends CanStudentDo{
    void addStudent(LinkedHashMap<String, String> studentData) throws Exception;
    void updateStudent(LinkedHashMap<String, String> studentData, int id) throws Exception;
    void deleteStudent(int id) throws Exception;
    
    /**
     * transfer/move student from circle to another
     * @param studentId 
     * @param oldCircleId
     * @param newCircleId 
     */
    void transferStudent(int studentId, int oldCircleId, int newCircleId) throws Exception;
}

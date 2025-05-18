/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.student;

import java.sql.SQLException;
import oopproject.view.CanActorDo;

/**
 *
 * @author PC
 */
public interface CanStudentDo extends CanActorDo{
    /**
     * view today report
     * @param studentId id of student to get him report
     */
    void viewStudentDailyReport(int studentId) throws Exception;
    
    /**
     * view this week report
     * @param studentId id of student to get him report
     */
    void viewStudentWeeklyReport(int studentId) throws Exception;
}

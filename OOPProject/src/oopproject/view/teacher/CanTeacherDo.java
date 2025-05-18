/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject.view.teacher;

import oopproject.view.student.CanStudentDo;

/**
 *
 * @author PC
 */
public interface CanTeacherDo extends CanStudentDo{
    /**
     * present student daily
     * @param studentId is student id to present
     * @param present state , false if not present
     */
    void setStudentPresent(int studentId, boolean present);
    
    /**
     * rate the student save daily
     * @param studentId is student to rate 
     * @param rate is rate between 0 - 10
     */
    void setDailySaveRate(int studentId, int rate);
    
    /**
     * rate the student resave(review) daily
     * @param studentId is student to rate 
     * @param rate is rate between 0 - 10
     */
    void setDailyResaveRate(int studentId, int rate);
    
    /**
     * add note to student 
     * @param note is text note about the student
     * @param studentId is id of student to set note for him
     */
    void addStudetnNotes(String note, int studentId);
    
    /**
     * get all student notes
     * @param studentId is id of student to get note of him
     */
    void viewStudetnNotes(int studentId);
    
    /**
     * get monthly report of circle
     * @param cicleId is id of circle to get its report
     */
    void viewMonthlyReport(int cicleId);
    
    /**
     * set monthly plan for student
     * @param studentId is id of student to set him plan
     * @param plan text plan
     */
    void setPlanForStudent(int studentId, String plan);
}
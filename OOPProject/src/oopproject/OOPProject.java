/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import oopproject.controller.parent.ParentController;
import oopproject.model.Book;
import oopproject.model.Circle;
import oopproject.model.Parent;
import oopproject.model.Student;
import oopproject.model.Teacher;
import oopproject.view.manager.Manager;

/**
 *
 * @author PC
 */
public class OOPProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        // create tables
        new Parent().createTable();
        new Teacher().createTable(); 
        new Book().createTable(); 
        new Circle().createTable();
        new Student().createTable();
        
        // create controllers
        Manager m = new Manager();
        
        // create data collections
        LinkedHashMap<String, String> parent = new LinkedHashMap<>();
        parent.put("id", "1");
        parent.put("name", "parent first student");
        parent.put("relationship", "father");
        parent.put("work_place", "taiz");
        parent.put("phone", "123");
        parent.put("location", "yemen");
        parent.put("password", "pass");
        new ParentController().store(parent);
        
        
        LinkedHashMap<String, String> teacher = new LinkedHashMap<>();
        teacher.put("id", "1");
        teacher.put("name", "teacher name");
        teacher.put("phone", "123");
        teacher.put("acadymic_degree", "master");
        teacher.put("working_hours", "2");
        teacher.put("side", "side name");
        teacher.put("location", "taiz yemen");
        teacher.put("password", "pass");
//        new TeacherController().store(teacher);
        
        LinkedHashMap<String, String> book = new LinkedHashMap<>();
        book.put("id", "1");
        book.put("name", "book name");
        book.put("teacher_id", "1");
        book.put("time", "1");
//        new BookController().store(book);
        
        LinkedHashMap<String, String> circle = new LinkedHashMap<>();
        circle.put("id", "1");
        circle.put("name", "first student circle");
        circle.put("side", "side name");
        circle.put("progress", "10");
        circle.put("time", "2");
        circle.put("period", "2");
        circle.put("book_id", "1");
//        new CircleController().store(circle);
        
        LinkedHashMap<String, String> data = new LinkedHashMap<>();
        data.put("id", "1");
        data.put("name", "name first student name");
        data.put("date_of_birth", "2002");
        data.put("date_of_regester", null);
        data.put("circle_id", "1"); 
        data.put("saved_parts", "2");
        data.put("surah_name", "almolk");
        data.put("parent_id", "1"); 
        data.put("phone", "123191");
        data.put("resaved_parts", "1");
        data.put("last_resaved_time", "2025/5/3");
        data.put("last_save_time", "2025/5/5");
        data.put("location", "yemen");
        data.put("monthly_plan", "10 save, 2 resave");
        data.put("save_rate", "8");
        data.put("resave_rate", "7");
        data.put("birth_location", "yemen");
        data.put("password", "password");
        m.updateStudent(data, 1);
    }
    
}

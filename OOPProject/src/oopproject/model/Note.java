 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.model;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import oopproject.database.Connector;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class Note extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("student_id", "int");
        insertable.put("note", "string");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("student_id", "int");
        selectCols.put("note", "string");
        
        updateable = new LinkedHashMap<>();
        updateable.put("note", "string");
        
    }

    public Note() throws SQLException {
        super("notes", insertable, updateable, selectCols);
    }
    
    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                 student_id INT PRIMARY KEY,
                 note VARCHAR(100) NOT NULL,
                 CONSTRAINT student_id_fk FOREIGN KEY (student_id) REFERENCES students(id)
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }
}

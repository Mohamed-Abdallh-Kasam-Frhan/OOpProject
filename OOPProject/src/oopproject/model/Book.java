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
public class Book extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("id", "int");
        insertable.put("name", "string");
        insertable.put("teacher_id", "int");
        insertable.put("time", "string");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("id", "int");
        selectCols.put("name", "string");
        selectCols.put("teacher_id", "int");
        selectCols.put("time", "string");
        
        updateable = new LinkedHashMap<>();
        updateable.put("teacher_id", "int");
        updateable.put("time", "string");
        updateable.put("name", "string");
    }
    
    public Book() throws SQLException {
        super("books", insertable, updateable, selectCols);
    }

    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                id INT PRIMARY KEY,
                name VARCHAR(100) NOT NULL,
                teacher_id INT REFERENCES teachers(id),
                time TINYINT CHECK(time > 0 AND time < 5)
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }
    
}

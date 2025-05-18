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
public class Teacher extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("id", "int");
        insertable.put("name", "string");
        insertable.put("phone", "string");
        insertable.put("acadymic_degree", "string");
        insertable.put("working_hours", "string");
        insertable.put("side", "string");
        insertable.put("location", "string");
        insertable.put("password", "string");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("id", "int");
        selectCols.put("name", "string");
        selectCols.put("phone", "string");
        selectCols.put("acadymic_degree", "string");
        selectCols.put("working_hours", "string");
        selectCols.put("side", "string");
        selectCols.put("location", "string");
        
        updateable = new LinkedHashMap<>();
        updateable.put("name", "string");
        updateable.put("phone", "string");
        updateable.put("acadymic_degree", "string");
        updateable.put("working_hours", "string");
        updateable.put("side", "string");
        updateable.put("location", "string");
        updateable.put("password", "string");
        
    }

    public Teacher() throws SQLException {
        super("teachers", insertable, updateable, selectCols);
    }
    
    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                id INT PRIMARY KEY,
                name VARCHAR(100) NOT NULL,
                phone VARCHAR(100) NOT NULL,
                acadymic_degree VARCHAR(100),
                working_hours VARCHAR(100),
                side VARCHAR(100),
                location VARCHAR(100),
                password VARCHAR(100)
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }

}

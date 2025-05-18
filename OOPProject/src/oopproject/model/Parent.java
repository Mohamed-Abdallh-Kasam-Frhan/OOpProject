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
public class Parent extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("id", "int");
        insertable.put("name", "string");
        insertable.put("relationship", "string");
        insertable.put("work_place", "string");
        insertable.put("phone", "string");
        insertable.put("location", "string");
        insertable.put("password", "string");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("id", "int");
        selectCols.put("name", "string");
        selectCols.put("relationship", "string");
        selectCols.put("work_place", "string");
        selectCols.put("phone", "string");
        selectCols.put("location", "string");
        
        updateable = new LinkedHashMap<>();
        updateable.put("name", "string");
        updateable.put("relationship", "string");
        updateable.put("work_place", "string");
        updateable.put("phone", "string");
        updateable.put("location", "string");
        
    }

    public Parent() throws SQLException {
        super("parents", insertable, updateable, selectCols);
    }
    
    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                 id INT PRIMARY KEY,
                 name VARCHAR(100) NOT NULL,
                 relationship VARCHAR(100) NOT NULL DEFAULT ('father'),
                 work_place VARCHAR(100),
                 phone VARCHAR(100) NOT NULL,
                 location VARCHAR(100),
                 password VARCHAR(100)
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }

}

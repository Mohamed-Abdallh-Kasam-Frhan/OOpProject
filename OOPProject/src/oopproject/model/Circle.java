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
public class Circle extends Model{
private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("id", "int");
        insertable.put("name", "string");
        insertable.put("side", "string");
        insertable.put("progress", "int");
        insertable.put("time", "string");
        insertable.put("period", "int");
        insertable.put("book_id", "int");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("id", "int");
        selectCols.put("name", "string");
        selectCols.put("side", "string");
        selectCols.put("progress", "int");
        selectCols.put("time", "string");
        selectCols.put("period", "int");
        selectCols.put("book_id", "int");
        
        updateable = new LinkedHashMap<>();
        selectCols.put("name", "string");
        selectCols.put("side", "string");
        selectCols.put("progress", "int");
        selectCols.put("time", "string");
        selectCols.put("period", "int");
        selectCols.put("book_id", "int");
    }
    
    public Circle() throws SQLException {
        super("circles", insertable, updateable, selectCols);
    }

    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                id INT PRIMARY KEY,
                name VARCHAR(100) NOT NULL,
                side VARCHAR(100) ,
                progress TINYINT CHECK(progress > 0 AND progress <= 100),
                time VARCHAR(100) ,
                period TINYINT CHECK(period > 0 AND period <= 5),
                book_id INT REFERENCES books(id)
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }
    
}

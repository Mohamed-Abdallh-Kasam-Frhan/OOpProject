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
public class Student extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("id", "int");
        insertable.put("name", "string");
        insertable.put("date_of_birth", "string");
        insertable.put("date_of_regester", "string");
        insertable.put("circle_id", "int"); // fk
        insertable.put("saved_parts", "int");
        insertable.put("surah_name", "string");
        insertable.put("parent_id", "int"); // fk
        insertable.put("phone", "string");
        insertable.put("resaved_parts", "int"); // fk
        insertable.put("last_resaved_time", "string");
        insertable.put("last_save_time", "string");
        insertable.put("location", "string");
        insertable.put("monthly_plan", "string");
        insertable.put("save_rate", "string");
        insertable.put("resave_rate", "string");
        insertable.put("birth_location", "string");
        insertable.put("password", "string");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("id", "int");
        selectCols.put("name", "string");
        selectCols.put("date_of_birth", "string");
        selectCols.put("date_of_regester", "string");
        selectCols.put("circle_id", "int"); // fk
        selectCols.put("saved_parts", "int");
        selectCols.put("surah_name", "string");
        selectCols.put("parent_id", "int"); // fk
        selectCols.put("phone", "string");
        selectCols.put("resaved_parts", "int"); // fk
        selectCols.put("last_resaved_time", "string");
        selectCols.put("last_save_time", "string");
        selectCols.put("location", "string");
        selectCols.put("monthly_plan", "string");
        selectCols.put("save_rate", "string");
        selectCols.put("resave_rate", "string");
        selectCols.put("birth_location", "string");
        
        updateable = new LinkedHashMap<>();
        updateable.put("name", "string");
        updateable.put("date_of_birth", "string");
        updateable.put("circle_id", "int"); // fk
        updateable.put("saved_parts", "int");
        updateable.put("surah_name", "string");
        updateable.put("parent_id", "int"); // fk
        updateable.put("phone", "string");
        updateable.put("resaved_parts", "int"); // fk
        updateable.put("last_resaved_time", "string");
        updateable.put("last_save_time", "string");
        updateable.put("location", "string");
        updateable.put("monthly_plan", "string");
        updateable.put("save_rate", "string");
        updateable.put("resave_rate", "string");
        insertable.put("password", "string");
        
    }

    public Student() throws SQLException {
        super("students", insertable, updateable, selectCols);
    }
    
    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                id INT PRIMARY KEY,
                name VARCHAR(100) NOT NULL, 
                date_of_birth VARCHAR(100) ,
                date_of_regester VARCHAR(100) ,
                circle_id INT REFERENCES circles(id),
                saved_parts TINYINT CHECK (saved_parts >= 0 AND saved_parts <= 30) ,
                surah_name VARCHAR(100),
                parent_id INT REFERENCES parents(id),
                phone VARCHAR(100),
                resaved_parts TINYINT CHECK (saved_parts >= 0 AND saved_parts <= 30) ,
                last_resaved_time VARCHAR(100),
                last_save_time VARCHAR(100),
                location VARCHAR(100),
                monthly_plan VARCHAR(255),
                save_rate TINYINT CHECK (saved_parts >= 0 AND saved_parts <= 10) ,
                resave_rate TINYINT CHECK (saved_parts >= 0 AND saved_parts <= 10) ,
                birth_location VARCHAR(100),
                password VARCHAR(100)
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }
    
}

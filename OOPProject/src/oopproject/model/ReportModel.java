/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject.model;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import oopproject.database.Connector;


/**
 *
 * @author a
 */
public class ReportModel extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static{
   insertable =new LinkedHashMap<>();
   
   insertable.put("id","string");
  insertable.put("present","string");
  insertable.put("WithPermission","string");//اذا كان الغايم هل بأذن او لا 
  insertable.put("SaveQuantity","string");//اسم السورة و رقم الاياية
  insertable.put("ReviewQuantity","string");//اسم السورة و رقم الاياية
  insertable.put("evaluation","string");
   insertable.put("date","string");
  
     updateable =new LinkedHashMap<>();
   
  
  insertable.put("present","string");
  insertable.put("WithPermission","string");//اذا كان الغايم هل بأذن او لا 
  
  insertable.put("SaveQuantity","string");//اسم السورة و رقم الاياية
  insertable.put("ReviewQuantity","string");//اسم السورة و رقم الاياية
  insertable.put("evaluation","string");
   insertable.put("date","string");

  ///
  selectCols =new LinkedHashMap<>();
   
   insertable.put("id","string");
  insertable.put("present","string");
  insertable.put("WithPermission","string");//اذا كان الغايم هل بأذن او لا 
  
  insertable.put("SaveQuantity","string");//اسم السورة و رقم الاياية
  insertable.put("ReviewQuantity","string");//اسم السورة و رقم الاياية
  insertable.put("evaluation","string");
   insertable.put("date","string");
    }
    public ReportModel() throws SQLException {
        super("report", insertable, updateable, selectCols);
        
    }

    @Override
    public void createTable() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    

  
    
}

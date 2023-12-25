package mashru.busmanagement;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mashru
 */

public class DbUtils {
    public static TableModel resultSetToTableModel(ResultSet rs){
        try{
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            
            for( int column = 0; column < numberOfColumns; column++){
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }
            Vector rows = new Vector();
            while(rs.next()) {
                Vector newRow = new Vector();
                
                for(int i = 1; i<= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
            rows.addElement(newRow);    
            }
            return new DefaultTableModel(rows, columnNames);
        }
        catch (SQLException e) {
            return null;
        }
    }
}

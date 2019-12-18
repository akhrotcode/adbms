/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import adbms.Emp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author afif
 */
public class DataHelper {

    private Connection conn = null;
    private Statement stmt = null;
    
    public DataHelper() {
    }
    
    public void connection(){
        try {
//            thin:@localhost:1521:orcl
//            jdbc:oracle:thin:expdb.dbf:1521:orcl
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//Haier-PC:1521/oltp", "oltpdb", "oltpdb");
            System.out.println("Connection Successfull");
            if (conn == null) {
                System.out.println("conn is null");
            }
            else{
                stmt=conn.createStatement();
                // hoga initalize     ;kiss initialize krun? // ek min  ab kro        
            }
        
        } catch (Exception e) {
            System.err.println("conn Exception: " + e);
        }
    }
    
    public void insertAll(String tableName, Object ...values){
        try {
            connection();
            System.out.println("Number of Colomns: " + values.length);
            System.out.println("Inserting Data...");

            String cols_values = "(";
            for(Object value : values){
                System.out.println("value: " + value);
                // here concate all the colnames in one string variable for query
                cols_values = cols_values.concat(String.valueOf(value) + ",");
            }
            // remove the last ,(comma) from the string
            cols_values = cols_values.substring(0, cols_values.length()-1);
            cols_values = cols_values.concat(")");

            String query = "INSERT INTO " +tableName+" VALUES "+cols_values;
            System.out.println(query);
            String q = "INSERT INTO dummy VALUES (1,'fifa',34.22)";
            int st = stmt.executeUpdate(q); // yaha error hadasd
            

            // if query is executed.
            if (st>0) {
                System.out.println("Data Successfully inserted");
                //return true
            }
            else{
                System.out.println("Data Failed to insert");
            //return false
            }
        } catch (Exception e) {
            System.err.println("DbHelper->Exception: "+e);
        }
        finally{
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
//                    Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                        System.err.println("DBHelper->Exception: " +ex);
                }
            }
        }
    }
    
    
    public void updateData(String tableName,String idCol,String idVal, String ...values){
        try {
            connection();
            int count = values.length;
            System.out.println(String.valueOf(count));
            LinkedList<String> cols = new LinkedList<>();
            LinkedList<String> vals = new LinkedList<>();
            String query = "UPDATE " + tableName + " SET ";
            int i = 0;
            for (String value: values) {
                if (i%2 == 0) {
                    cols.add(value);
                }
                else{
                    vals.add(value);
                }
                System.out.println(value);
                i++;
            }
            for (int j = 0; j < cols.size(); j++) {
                 query = query.concat(cols.get(j) + " = '" + vals.get(j) + "',");
            }
            query = query.substring(0, query.length()-1);
            String whereClause = " WHERE "+ idCol + " = '" + idVal+ "'";
            query = query.concat(whereClause);
            System.out.println(query);
            int st = stmt.executeUpdate(query);
            // if query is executed.
            if (st>0) {
                System.out.println("Data Successfully Updated");
                //return true
            }
            else{
                System.out.println("Data Failed to update");
            //return false
            }
            
        } catch (Exception e) {
            System.out.println("DbHelper->Exception: "+e);
        }
    }
    
}

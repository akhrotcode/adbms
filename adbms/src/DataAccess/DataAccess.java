/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import adbms.Attendance;
import adbms.Dept;
import adbms.Emp;
import adbms.Salary;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author afif
 */
public class DataAccess {

    DataHelper dh;
    
    public DataAccess() {
        dh = new DataHelper();
    }
    
    //------------------GET DATA-------------------
    
    public LinkedList<Emp> getAllEmp(String Tablename,Object...cols){
        //try{
            LinkedList<Emp> emps = new LinkedList<>();
            
            try {
                if(cols.length==0){
                    ResultSet rs = dh.getAllData(Tablename,"\0");
                    while(rs.next())
                    {
                        Emp emp = new Emp(rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("PHONENO"), rs.getString("ADDRESS"), rs.getInt("DEPTNO"));
                        emps.add(emp);
                    }
                        return emps;
                
                }else{
                    
                    ResultSet rs = dh.getSpecData(Tablename, cols);
                    while(rs.next())
                    {
                        Emp emp = new Emp(rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("PHONENO"), rs.getString("ADDRESS"), rs.getInt("DEPTNO"));
                        emps.add(emp);
                    }
                        return emps;
                    
                }
                
            } catch (Exception e) {
                System.err.println("DataAccess->Exception: " + e);
            }
    
            return null;
    }
    
    public LinkedList<Attendance> getAllAttendance(String Tablename,Object...cols){
        
            LinkedList<Attendance> atts = new LinkedList<>();
            try {
                if(cols.length==0){
                    ResultSet rs = dh.getAllData(Tablename,"\0");
                    while(rs.next())
                    {
                        Attendance att = new Attendance( rs.getString("STATUS"),rs.getString("REASON"), rs.getString("ATT_DATE"),rs.getInt("EMPNO"));
                        atts.add(att);
                    }
                    return atts;
                }else{
                    ResultSet rs = dh.getSpecData(Tablename,cols);
                    while(rs.next())
                    {
                        Attendance att = new Attendance( rs.getString("STATUS"),rs.getString("REASON"), rs.getString("ATT_DATE"),rs.getInt("EMPNO"));
                        atts.add(att);
                    }
                    return atts;
                }
                
            } catch (Exception e) {
                System.err.println("DataAccess->Exception: " + e);
            }
    
            return null;
    }
    
    public LinkedList<Salary> getAllSalary(String Tablename,Object...cols){
            LinkedList<Salary> sals = new LinkedList<>();
            
            try {
               if(cols.length==0){
                   ResultSet rs = dh.getAllData(Tablename,"\0");
                    while(rs.next())
                    {
                        Salary sal = new Salary(rs.getInt("AMOUNT"), rs.getString("DATE_FROM"), rs.getString("DATE_TO"),rs.getInt("EMPNO"),rs.getString("STATUS"));
                        sals.add(sal);
                    }
                return sals;
                }  else{
                    ResultSet rs = dh.getSpecData(Tablename,cols);
                    while(rs.next())
                    {
                        Salary sal = new Salary(rs.getInt("AMOUNT"), rs.getString("DATE_FROM"), rs.getString("DATE_TO"),rs.getInt("EMPNO"),rs.getString("STATUS"));
                        sals.add(sal);
                    }
                return sals;
                }
                
            } catch (Exception e) {
                System.err.println("DataAccess->Exception: " + e);
            }
    
            return null;
    }
    
    public LinkedList<Dept> getAllDeptl(String Tablename,Object...cols){

            LinkedList<Dept> depts = new LinkedList<>();
            
            
            
            try {
                if(cols.length==0){
                    ResultSet rs = dh.getAllData(Tablename,"\0");
                    while(rs.next())
                    {
                        Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"));
                        depts.add(dept);
                    }
                    return depts;
                }  else{
                    ResultSet rs = dh.getSpecData(Tablename,cols);
                    while(rs.next())
                    {
                        Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"));
                        depts.add(dept);
                    }
                    return depts;
                }
                
            } catch (Exception e) {
                System.err.println("DataAccess->Exception: " + e);
            }
    
            return null;
    }
    
    //-------------Insert Data --------------
    
    public void insert_emp(Emp e){
        dh.insertAll("EMP", e.getEmpno(),"'"+e.getEname()+"'","'"+e.getPhoneno()+"'","'"+e.getAddress()+"'",e.getDeptno());
        JOptionPane.showMessageDialog(null, "employee record inserted!");
    }
    
    public void insert_dept(Dept d){
        dh.insertAll("DEPT", d.getDeptno(),"'"+d.getDname()+"'","'"+d.getLoc()+"'");
        JOptionPane.showMessageDialog(null, "deparment record inserted!");
    }
    
    public void insert_attendance(Attendance a){
        dh.insertAll("ATTENDANCE","'"+a.getStatus()+"'","'"+a.getAtt_date()+"'","'"+a.getReason()+"'",a.getEmpno());
        JOptionPane.showMessageDialog(null, "attendance record inserted!");
    }
    public void insert_salary(Salary s){
        dh.insertAll("SALARY", s.getAmount(),"'"+s.getDate_from()+"'","'"+s.getDate_to()+"'",s.getEmpno(),"'"+s.getStatus()+"'");
        JOptionPane.showMessageDialog(null, "salary record inserted!");
    }
    
    
    
    
    //-------DELETE DATA ----------------
    
    public void delete_emp(Emp v){
        dh.deleteData("EMP", "EMPNO",v.getEmpno());
        JOptionPane.showMessageDialog(null, "record deleted!");
    }
    
    public void delete_attendance(Attendance v){
        dh.deleteData("ATTENDANCE", "ATT_DATE",v.getAtt_date());
        JOptionPane.showMessageDialog(null, "record deleted!");
    }
    
    public void delete_salary(Salary s){
        dh.deleteData("SALARY", "DATE_FROM","'"+s.getDate_from()+"'");
        JOptionPane.showMessageDialog(null, "salary record deleted!");
    }
    
     //------- Update DATA ----------------
    
    public void update_emp(Emp e){
        if(e.getEname().isEmpty()){
            dh.updateData("EMP", "EMPNO", e.getEmpno(),"PHONENO","'"+e.getPhoneno()+"'","ADDRESS","'"+e.getAddress()+"'","DEPTNO",e.getDeptno());
        }else if(e.getPhoneno().isEmpty()){
            dh.updateData("EMP", "EMPNO", e.getEmpno(), "ENAME","'"+e.getEname()+"'","ADDRESS","'"+e.getAddress()+"'","DEPTNO",e.getDeptno());
        }else if(e.getAddress().isEmpty()){
            dh.updateData("EMP", "EMPNO", e.getEmpno(), "ENAME","'"+e.getEname()+"'","PHONENO","'"+e.getPhoneno()+"'","DEPTNO",e.getDeptno());
        }else{
            dh.updateData("EMP", "EMPNO", e.getEmpno(), "ENAME","'"+e.getEname()+"'","PHONENO","'"+e.getPhoneno()+"'","ADDRESS","'"+e.getAddress()+"'","DEPTNO",e.getDeptno());
        }
        JOptionPane.showMessageDialog(null, "record updated!");
    }
    
    public void update_attendace(Attendance a){
        dh.updateData("ATTENDANCE", "ATT_DATE", "'"+a.getAtt_date()+"'", "STATUS","'"+a.getStatus()+"'","ATT_DATE","'"+a.getAtt_date()+"'","REASON","'"+a.getReason()+"'","EMPNO",a.getEmpno());
        JOptionPane.showMessageDialog(null, "record updated!");
    }
    
    public void update_salary(Salary s){
        dh.updateData("SALARY", "DATE_FROM", "'"+s.getDate_from()+"'", "AMOUNT",+s.getAmount(),"DATE_FROM", "'"+s.getDate_from()+"'","DATE_TO","'"+s.getDate_to()+"'","EMPNO",s.getEmpno(),"STATUS","'"+s.getStatus()+"'");
        JOptionPane.showMessageDialog(null, "record updated!");
    }
//    ResultSetMetaData rsmd = rs.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();
//            while (rs.next()) {
//    for (int i = 1; i <= columnsNumber; i++) {
//        if (i > 1) System.out.print(",  ");
//        String columnValue = rs.getString(i);
//        System.out.print(columnValue + " " + rsmd.getColumnName(i));
//    }
//            }
//    System.out.println("list in DA checking...");
//            System.out.println(emps);
    
        
//        }catch(SQLException e){
//            
//        }
//    return null;
//}    
    
}

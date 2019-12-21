/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbms;

/**
 *
 * @author afif
 */
public class Salary {
    
   int amount;
   String date_from;
   String date_to;
   int empno;
   String status;

    public Salary(int amount, String date_from, String date_to, int empno, String status) {
        this.amount = amount;
        this.date_from = date_from;
        this.date_to = date_to;
        this.empno = empno;
        this.status = status;
    }

    public Salary() {
        
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
   

    
   
   
}

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
public class Attendance {
   
   String status;
   String reason;
   String att_date;
   int empno;

    public Attendance(String status, String reason, String att_date, int empno) {
        
        this.status = status;
        this.reason = reason;
        this.att_date = att_date;
        this.empno = empno;
    }

    public Attendance() {
       
    }

    public String getAtt_date() {
        return att_date;
    }

    public void setAtt_date(String att_date) {
        this.att_date = att_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }
   
   
    
}

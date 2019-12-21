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
public class Emp {
    int empno;
    String ename;
    String phoneno;
    String address;
    int deptno;

    public Emp(int empno, String ename, String phoneno, String address, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.phoneno = phoneno;
        this.address = address;
        this.deptno = deptno;
    }

    public Emp() {
        
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbms;
import DataAccess.DataHelper;

/**
 *
 * @author afif
 */
public class Adbms {
    
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DataHelper dh = new DataHelper();
        dh.getAllData("dummy","A","B");
        
                
    }

   

   
    
    
    
}

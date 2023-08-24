/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author TECH-U LIB 014
 */
class StudentDetails {
    
    private long st_id; 
    private String st_name; 
    private long st_mobile;
    
    public StudentDetails(long st_id,String st_name,long st_mobile){
    this.st_id = st_id; 
    this.st_name = st_name;
    this.st_mobile = st_mobile;
    }

    public long getSt_id(){
        return st_id;
    }

    public void setSt_id(long st_id){
        this.st_id = st_id;
    }
    public String getSt_name(){
        return st_name;
    }

    public void setSt_name(String st_name){
        this.st_name = st_name;
    }
    public long getSt_mobile(){
        return st_mobile;
    }
    public void setSt_mobile(long st_mobile){
        this.st_mobile = st_mobile;
    }

}

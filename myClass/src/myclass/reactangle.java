/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

/**
 *
 * @author OPEYEMI
 */
public class reactangle extends shape {
    
    public int area(){
        
    return(length*breath);
    }
    
    public int perimeter(){
    
        return (2*(length*breath));
    }
    reactangle(){
    length = 20;
    breath = 53;
    }
}



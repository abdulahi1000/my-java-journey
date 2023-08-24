/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author OPEYEMI
 */
public class Runner {
    public static void  main(String[] args){
        linkedList list1 = new linkedList();
        
        Node ni = new Node(4);
        
        list1.Insert(4);
        list1.Insert(6);
        list1.Insert(9);
        list1.Insert(2);
        list1.Insert(0);
        list1.Insert(ni);
        list1.display();
        
    
    
    }
    
}

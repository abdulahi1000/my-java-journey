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
public class linkedList {
   public Node head;
   
  /* public linkedList(){
   this(head);
   }*/
   
//   public linkedList (Node head){
//   this.head = head;
//   }
   
   public void Insert (int data){
       Node newNode = new Node(data);
       if(isEmpty()){
           this.head = newNode;
       }else{
           newNode.next = head;
           head = newNode;          
       }
         if(data > head.data){
                 head.next = newNode;
             }
       
      
 
   }
   public void Insert(Node newNode){
   
      if(isEmpty()){
           this.head = newNode;
       }else{
           newNode.next = head;
           head = newNode;
            
             }
   }
   public void display(){
       Node current;
       if (isEmpty()){
       System.out.println("list is empty");
       }else{
           current = head;
             System.out.print("[");
           while(current != null){
               System.out.print(current.data+",");
               current = current.next;
           
           }
           System.out.print("]");
       
       }
   
   
   }
   
   
   
   
   
   
   
   
   
   
   public void insert (Node newNode){
       if(isEmpty()){
       this.head = newNode;
       }else{
           
       }
   
   }
   
   public Node createNode(int data){
   
       Node n1 = new Node(data);
       return n1;
   
   }
   public boolean isEmpty(){
   if (head == null){
       return true;
   }
   else{
       return false;
   }
           
   }
}

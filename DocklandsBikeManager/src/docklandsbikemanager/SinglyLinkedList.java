/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public class SinglyLinkedList {
    
    private Node head;
    private Node curr;
    private Node prev;
    private int size;

    public SinglyLinkedList() {
        head = null;
        curr = null;
        prev = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    public void add(int index, Object element){
        if(index == 1){
            Node newNode = new Node(element, head);
            head = newNode;
            
        }else if(head == null){
            Node newNode = new Node (element);
            head = newNode;
            
        }else{
            setCurrent(index -1);
            Node newNode = new Node(element, curr.getNext());
            curr.setNext(newNode);
            
        }
        
        size++;
    }
    
    private void setCurrent(int index){
        curr = head;
        prev = null;
        
        for(int i = 1; i < index; i++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    public void remove(int index){
        
        if(index == 1){
            head = head.getNext();
            
        }else{
            setCurrent(index);
            curr = curr.getNext();
            prev.setNext(curr);
        }
        
        size --;
        
    }
    
    public void printList(){
        Node aNode = head;
        
        while(aNode != null){
            System.out.println(aNode.getElement().toString());
            aNode = aNode.getNext();
        }
    }
    
    public String displayList(){
        String output = "";
        Node aNode = head;
        
        while(aNode != null ) {
            output += aNode.getElement() .toString()+"\n";
            aNode = aNode.getNext();
        }
        
        return output;
    }
    
    
    

    
    
    
    
}

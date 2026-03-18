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
    //checks if its empty
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    //adds element at given index
    public void add(int index, Object element){
        //if adding at head
        if(index == 1){
            Node newNode = new Node(element, head);
            head = newNode;
            //if list is empty
        }else if(head == null){
            Node newNode = new Node (element);
            head = newNode;
            
        }else{
            //moves node before adding
            setCurrent(index -1);
            //creates a new node and link it to the list
            Node newNode = new Node(element, curr.getNext());
            curr.setNext(newNode);
            
        }
        
        size++;// increases after adding
    }
    
    //moves curr and prev to corresct position
    private void setCurrent(int index){
        curr = head;
        prev = null;
        
        for(int i = 1; i < index; i++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    //removes element at index
    public void remove(int index){
        
        if(index == 1){
            head = head.getNext();
            
        }else{
            //moves position
            setCurrent(index);
            curr = curr.getNext();
            prev.setNext(curr);
        }
        
        size --;//decreases after removing
        
    }
    
    public Object get(int index){
        setCurrent(index);
        return curr.getElement();
    }
    
    public void printList(){//used for testing
        Node aNode = head;
        
        while(aNode != null){
            System.out.println(aNode.getElement().toString());
            aNode = aNode.getNext();
        }
    }
    
    //displays all elements fro GUI
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

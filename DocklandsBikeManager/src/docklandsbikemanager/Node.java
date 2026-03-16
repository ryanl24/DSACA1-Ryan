/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public class Node {
    
    public Object element;
    public Node next;

    public Node(Object element){
        this.element = element;
        this.next = null;
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
    
    
    
    
    
    
}

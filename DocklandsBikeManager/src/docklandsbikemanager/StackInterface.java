/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandsbikemanager;

/**
 *
 * @author ryanl
 */
public interface StackInterface {
    
    public boolean isEmpty();
    public int size();
    public Object pop();
    public void push(Object e);
    public Object peek();
    public String displayStack();
    
}

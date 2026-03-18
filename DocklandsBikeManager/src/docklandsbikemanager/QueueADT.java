/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsbikemanager;

import java.util.ArrayList;

/**
 *
 * @author ryanl
 */
public class QueueADT implements QueueInterface{
    
    private final ArrayList<Object> theQueue;
    
    public QueueADT(){
        theQueue = new ArrayList<>();
    }
    
    @Override
    public int size(){
        return theQueue.size();
    }
    
    @Override
    public Object frontElement(){
        if(theQueue.size() > 0){
            return theQueue.get(0);
        }else{
            return null;
        }
    }
    
    @Override
    public void enqueue(Object element){
        theQueue.add(element);
    }
    
    @Override
    public Object dequeue(){
        if(theQueue.size() > 0){
            return theQueue.remove(0);
        }else{
            return  null;
        }
    }
    
    @Override
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    
    @Override
    public String displayQueue(){
        StringBuilder strB = new StringBuilder();
        
        if(theQueue.isEmpty()){
            strB.append("Empty Queue");
        }else{
            for(int i = 0; i< theQueue.size(); i++){
                strB.append(theQueue.get(i).toString());
                strB.append("\n");
            }
        
        }
        
        return strB.toString();
        
    }
    
}
